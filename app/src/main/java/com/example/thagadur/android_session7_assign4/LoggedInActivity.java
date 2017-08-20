package com.example.thagadur.android_session7_assign4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class LoggedInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);
        //Getting the ID of Textview
        TextView tv = (TextView) findViewById(R.id.textView1);
        //Setting the text over the Text view

        tv.setText("Welcome ,"+getIntent().getExtras().getString("username"));
    }
}
