package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Button;

public class homeActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent2 = getIntent();
        String message1 = intent2.getStringExtra(logInActivity.EXTRA_MESSAGE);

        String message2 = intent2.getStringExtra(logInActivity.EXTRA_MESSAGE2);

        TextView txtDisplay1 = (TextView) findViewById(R.id.displayName);
        txtDisplay1.setText(message1);

        TextView txtDisplay2 = (TextView) findViewById(R.id.displayNo);
        txtDisplay2.setText(message2);


        button = (Button) findViewById(R.id.startButton);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openQuestion1Activity();
            }
        });
    }

    public void openQuestion1Activity() {
        Intent intent = new Intent(this, question1Activity.class);
        startActivity(intent);
    }
}