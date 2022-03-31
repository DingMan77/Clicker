package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.RadioButton;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class question1Activity extends AppCompatActivity {

    Button btn;
    private Button button;
    private RadioButton a, b, c, d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

         a = (RadioButton) findViewById(R.id.q1a);
         b = (RadioButton) findViewById(R.id.q1b);
         c = (RadioButton) findViewById(R.id.q1c);
         d = (RadioButton) findViewById(R.id.q1d);


        button = (Button) findViewById(R.id.next2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openQuestion2Activity();
                triggerURL();
            }
        });
    }

    public void openQuestion2Activity() {
        Intent intent = new Intent(this, question2Activity.class);
        startActivity(intent);
    }

    public void triggerURL(){
        if(a.isChecked()){

        }
    }
}