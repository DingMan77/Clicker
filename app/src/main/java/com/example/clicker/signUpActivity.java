package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

public class signUpActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        button = (Button) findViewById(R.id.btnToLI);


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLogInActivity();
            }
        });
    }

    public void openLogInActivity() {
        Intent intent = new Intent(this, logInActivity.class);
        startActivity(intent);
    }
}