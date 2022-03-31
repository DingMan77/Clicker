package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class question4Activity extends AppCompatActivity {

    Button btn;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        button = (Button) findViewById(R.id.previous2);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openFinishPage();
            }
        });

    }
    public void openFinishPage() {
        Intent intent2 = new Intent(this, finishPage.class);
        startActivity(intent2);
    }

}