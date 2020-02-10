package com.yoon.bi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.yoon.bi.model.Users;

public class MainActivity extends AppCompatActivity {
    EditText InputNumber, InputPassword;
    Button LoginButton;
    TextView mTextViewRegister;
    ProgressDialog loadingBar;
    String databaseUsers = "Users";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InputNumber = (EditText)findViewById(R.id.edit_number);
        InputPassword = (EditText)findViewById(R.id.edittext_password);
        loadingBar = new ProgressDialog(this);
        mTextViewRegister = (TextView)findViewById(R.id.textview_register);
        mTextViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(MainActivity.this, InscriptionActivity.class);
                startActivity(registerIntent);
            }
        });
        LoginButton = (Button)findViewById(R.id.btn_login);
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginUser();
            }
        });

    }
    private void LoginUser(){
        String number = InputNumber.getText().toString();
        String password = InputPassword.getText().toString();

        if (TextUtils.isEmpty(number)){
            Toast.makeText(this, " Number is Required.", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(password)){
            Toast.makeText(this, " Password is Required.", Toast.LENGTH_SHORT).show();
        }
        else {
            loadingBar.setTitle("Login Account");
            loadingBar.setMessage("Please wait, while we are checking the credentials");
            loadingBar.setCanceledOnTouchOutside(false);
            loadingBar.show();

            AllowAccesToAccount(number, password);

        }
    }
    private void AllowAccesToAccount(final String number, final String password){
        final DatabaseReference rootRef;
        rootRef = FirebaseDatabase.getInstance().getReference();

        rootRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot.child(databaseUsers).child(number).exists()){
                    Users usersData = dataSnapshot.child(databaseUsers).child(number).getValue(Users.class);
                    if (usersData.getNumber().equals(number)){
                        if (usersData.getPassword().equals(password)){
                            Toast.makeText(MainActivity.this, "Logged in Successfully...", Toast.LENGTH_SHORT).show();
                            loadingBar.dismiss();

                            Intent intent = new Intent(MainActivity.this, HomActivity.class);
                            startActivity(intent);
                            displayChatMessages();
                        }
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Account with this " + number + " number do not exists.", Toast.LENGTH_SHORT).show();
                    loadingBar.dismiss();
                }
            }

            private void displayChatMessages() {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
