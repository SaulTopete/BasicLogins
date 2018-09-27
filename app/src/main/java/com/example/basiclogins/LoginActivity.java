package com.example.basiclogins;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button login;
    private Button signUp;

    public static final String EXTRA_USERNAME = "the username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        wireWidgets();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = username.getText().toString();
                Intent intentSendMessage = new Intent(LoginActivity.this, CreateAccountActivity.class);
                intentSendMessage.putExtra(EXTRA_USERNAME, message);
                startActivity(intentSendMessage);
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSignUp = new Intent(Intent.ACTION_SEND);
                
            }
        };
    }

    private void wireWidgets() {
        username = findViewById(R.id.edittext_activitylogin_username);
        password = findViewById(R.id.edittext_activitylogin_password);
        login = findViewById(R.id.button_activitylogin_login);
        signUp = findViewById(R.id.button_activitylogin_signup);
    }
}
