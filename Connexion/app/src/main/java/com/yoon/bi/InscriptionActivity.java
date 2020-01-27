package com.yoon.bi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InscriptionActivity extends AppCompatActivity {

    EditText mTextUsername;
    EditText mTextPassword;
    EditText getTextCnf_password;
    Button mbtn_Inscrire;
    TextView mTextViewConnexion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        mTextUsername = (EditText)findViewById(R.id.edittext_username);
        mTextPassword = (EditText)findViewById(R.id.edittext_password);
        getTextCnf_password = (EditText)findViewById(R.id.edittext_cnf_password);
        mbtn_Inscrire = (Button)findViewById(R.id.btn_inscrire);
        mTextViewConnexion = (TextView)findViewById(R.id.textview_connexion);
        mTextViewConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent connexionIntent = new Intent(InscriptionActivity.this, MainActivity.class);
                startActivity(connexionIntent);
            }
        });
    }
}
