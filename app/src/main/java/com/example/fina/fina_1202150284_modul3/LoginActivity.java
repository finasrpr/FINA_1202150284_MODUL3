package com.example.fina.fina_1202150284_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edUsername, edPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edUsername = (EditText) findViewById(R.id.username);
        edPassword = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.login);
    }


    public void showLogin(View view) {
        if (edUsername.getText().toString().equals("EAD") && edPassword.getText().toString().equals("MOBILE")){
            Toast.makeText(this, "Welcome", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Username & Password Incorrect, Try Again!", Toast.LENGTH_LONG).show();
        }
    }
}
