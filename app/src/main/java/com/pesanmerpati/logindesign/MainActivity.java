package com.pesanmerpati.logindesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mButtonLogin, mButtonLoginFacebook, mButtonLoginTwitter, mButtonSignUp;
    TextView mTextViewForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonLogin = findViewById(R.id.button_login);
        mButtonLoginFacebook = findViewById(R.id.button_login_facebook);
        mButtonLoginTwitter = findViewById(R.id.button_login_twitter);
        mButtonSignUp = findViewById(R.id.button_sign_up);

        mTextViewForgotPassword = findViewById(R.id.textView_forgot_password);

        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Login", Toast.LENGTH_SHORT).show();
            }
        });

        mButtonLoginFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Login with Facebook", Toast.LENGTH_SHORT).show();
            }
        });

        mButtonLoginTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Login with Twitter", Toast.LENGTH_SHORT).show();
            }
        });

        mButtonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Sign Up", Toast.LENGTH_SHORT).show();
            }
        });

        mTextViewForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Forgot Password", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
