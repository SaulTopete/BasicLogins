package com.example.basiclogins;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CreateAccountActivity extends AppCompatActivity {

    private EditText name;
    private EditText username;
    private EditText password;
    private EditText confirmPassword;
    private EditText email;
    private Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        wireWidgets();
    }

    private void wireWidgets() {
        name = findViewById(R.id.edittext_createaccount_name);
        username = findViewById(R.id.edittext_activitylogin_username);
        password = findViewById(R.id.edittext_createaccount_pswrd);
        confirmPassword = findViewById(R.id.edittext_createaccount_confirmpswrd);
        email = findViewById(R.id.edittext_createaccount_email);
        signUp = findViewById(R.id.button_createaccount_signup);
    }
}
