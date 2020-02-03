package com.yoon.bi;

import androidx.annotation.NonNull;
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

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class InscriptionActivity extends AppCompatActivity {

    EditText InputPseudo, InputNumber, InputPassword, InputConfirm;
    Button CreateAccountButton;
    TextView mTextViewConnexion;
    ProgressDialog loadingBar;
    String databaseUsers = "Users";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        InputPseudo = (EditText)findViewById(R.id.edittext_pseudo);
        InputNumber = (EditText)findViewById(R.id.edit_number_ins);
        InputPassword = (EditText)findViewById(R.id.edit_password_ins);
        InputConfirm = (EditText)findViewById(R.id.edittext_cnf_password);
        mTextViewConnexion = (TextView)findViewById(R.id.textview_connexion);
        mTextViewConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InscriptionActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        loadingBar = new ProgressDialog(this);
        CreateAccountButton = (Button)findViewById(R.id.btn_inscrire);
        CreateAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateAccount();
            }
        });

    }
    private void CreateAccount(){
        String pseudo = InputPseudo.getText().toString();
        String number = InputNumber.getText().toString();
        String password = InputPassword.getText().toString();
        String confirm = InputConfirm.getText().toString();

        if (TextUtils.isEmpty(pseudo)){
            Toast.makeText(this, " Pseudo is Required.", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(number)){
            Toast.makeText(this, " Number is Required.", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(password)){
            Toast.makeText(this, " Password is Required.", Toast.LENGTH_SHORT).show();
        }
        else if (password.length() < 6){
            Toast.makeText(this, " Password Must be >= 6 caracters.", Toast.LENGTH_SHORT).show();
        }
        else {
            loadingBar.setTitle("Create Account");
            loadingBar.setMessage("Please wait, while we are checking the credentials");
            loadingBar.setCanceledOnTouchOutside(false);
            loadingBar.show();

            ValidatephoneNumber(pseudo, number, password);

        }

    }

    private void ValidatephoneNumber(final String pseudo, final String number, final String password){
        final DatabaseReference rootRef;
        rootRef = FirebaseDatabase.getInstance().getReference();

        rootRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (!(dataSnapshot.child(databaseUsers).child(number).exists())){
                    HashMap<String, Object> userdataMap = new HashMap<>();
                    userdataMap.put("pseudo", pseudo);
                    userdataMap.put("number", number);
                    userdataMap.put("password", password);
                    rootRef.child(databaseUsers).child(number).updateChildren(userdataMap)
                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()){
                                        Toast.makeText(InscriptionActivity.this, "Your account has been created.", Toast.LENGTH_SHORT).show();
                                        loadingBar.dismiss();

                                        Intent intent = new Intent(InscriptionActivity.this, MainActivity.class);
                                        startActivity(intent);
                                    }
                                    else {
                                        loadingBar.dismiss();
                                        Toast.makeText(InscriptionActivity.this, "Network Error: please try again after some time...", Toast.LENGTH_SHORT).show();

                                    }
                                }
                            });
                    
                }
                else {
                    Toast.makeText(InscriptionActivity.this, "This "+ number + " already exists.", Toast.LENGTH_SHORT).show();
                    loadingBar.dismiss();
                    Toast.makeText(InscriptionActivity.this, "Please try again using another number.", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(InscriptionActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }

}
