package com.example.clicker;


import androidx.appcompat.app.AppCompatActivity;
import android.widget.RadioButton;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import com.loopj.android.http.*;
import java.net.*;
import java.io.*;
import android.net.*;
import android.util.*;

public class logInActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.clicker.NAME";
    public final static String EXTRA_MESSAGE2 = "com.example.clicker.NO";
    public final static String EXTRA_MESSAGE3= "com.example.clicker.EMAIL";
    public final static String EXTRA_MESSAGE4= "com.example.clicker.PSWD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

    }

    /** Callback when the user selects the Send button */
    public void sendMessage(View view) {
        // Create an Intent to start the second activity
        Intent intent = new Intent(this, homeActivity.class);
        // Retrieve the message entered and put into the Intent
        EditText nameInput = (EditText) findViewById(R.id.nameInput);
        String message = nameInput.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);  // key-value pair

        EditText noInput = (EditText) findViewById(R.id.noInput);
        String message2 = noInput.getText().toString();
        intent.putExtra(EXTRA_MESSAGE2, message2);  // key-value pair

        EditText emailInput = (EditText) findViewById(R.id.emailInput);
        String message3 = noInput.getText().toString();
        intent.putExtra(EXTRA_MESSAGE3, message3);  // key-value pair

        EditText pswdInput = (EditText) findViewById(R.id.pswdInput);
        String message4 = noInput.getText().toString();
        intent.putExtra(EXTRA_MESSAGE4, message4);  // key-value pair

        // Start the intended activity
        startActivity(intent);
    }

}