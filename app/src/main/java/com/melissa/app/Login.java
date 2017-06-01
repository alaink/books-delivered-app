package com.melissa.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button mLogin;
    EditText mPhoneNumber;
    EditText mPassword;

    public void forgotPassword(View v){
        //New activity when password was forgotten
    }

    //When user clicks Login button in activity_login
    public void login (View v) {
        if (isValid()) {
            //Go to welcome page is login is successful
            Intent intent = new Intent(this, WelcomePage.class);
            startActivity(intent);

        }
    }

    //Determine whether user login information is valid
    public boolean isValid(){
        boolean retval = true;
        String phoneNumber = mPhoneNumber.getText().toString();
        String password = mPassword.getText().toString();

        //Conditions for valid phone number
        if (phoneNumber.isEmpty()) {
            retval = false;
            Toast.makeText(this, "Enter a Phone Number", Toast.LENGTH_SHORT).show();
        }

        //Conditions for valid password
        if (password.isEmpty()) {
            retval = false;
            Toast.makeText(this, "Enter a password", Toast.LENGTH_SHORT).show();
        }
        return retval;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLogin = (Button) findViewById(R.id.login_button);
        mPhoneNumber = (EditText) findViewById(R.id.phoneNumber_ID);
        mPassword = (EditText) findViewById(R.id.password_ID);

        //Everything dealing with the login button
        // mLogin = (Button) findViewById(R.id.login_button);
       /* mLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Move to *** activity when login button clicked
            }
        });*/



    }
}
