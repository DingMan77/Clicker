package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class question3Activity extends AppCompatActivity {

    Button btn;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

        button = (Button) findViewById(R.id.next2);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openQuestion4Activity();
            }
        });

    }

    public void openQuestion4Activity() {
        Intent intent2 = new Intent(this, question4Activity.class);
        startActivity(intent2);
    }
}