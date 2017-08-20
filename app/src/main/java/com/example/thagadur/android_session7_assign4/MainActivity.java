package com.example.thagadur.android_session7_assign4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText emailId;
    EditText password;

    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Getting the Email, password and Login Buttons ID.
        emailId = (EditText) findViewById(R.id.email_id_editText);
        password = (EditText) findViewById(R.id.password_editText);
        login = (Button) findViewById(R.id.login_button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //getting the username and password in the form of of text using getText()
                String email = emailId.getText().toString();
                String pass = password.getText().toString();
                //comparing whether the inputted string equals to specified value
                if (email.equals("admin") && pass.equals("123456")) {
                    //Moving from one main Activity to LoggedIn activity
                    Intent i = new Intent(MainActivity.this,LoggedInActivity.class);
                    //adding email to the Intent
                    i.putExtra("username",email);
                    startActivity(i);
                }
                else{
                    Toast.makeText(MainActivity.this,"username is invalid",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
