package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class question2Activity extends AppCompatActivity {

    Button btn;
    private Button button;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        button = (Button) findViewById(R.id.next2);


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openQuestion3Activity();
            }
        });

    }


    public void openQuestion3Activity() {
        Intent intent2 = new Intent(this, question3Activity.class);
        startActivity(intent2);
    }
}