package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.RadioButton;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.loopj.android.http.*;
import java.net.*;
import java.io.*;
import android.net.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;


import cz.msebera.android.httpclient.Header;


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
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuestion2Activity();
                triggerURL();
            }
        });
    }

    public void openQuestion2Activity() {
        Intent intent = new Intent(this, question2Activity.class);
        startActivity(intent);
    }

    public void triggerURL() {
       if(a.isChecked()){
           try{
               final String URL="http://192.168.1.100/Clicker/select1?choice=a";

               new Thread(new Runnable(){
                   public void run(){
                       try {

//                                Log.d("MainActivity","Continue");
                           URL url = new URL(URL);//生成一个URL实例，指向我们刚才设定的地址URL

                                /*
                                openConnection()方法只是创建了一个HttpURLConnection实例，
                                   并不是真正连接，在连接之前可以设置一些属性
                                 */
                           HttpURLConnection conn = (HttpURLConnection) url.openConnection();

                           conn.setRequestMethod("POST"); //设置请求方式为post

                           conn.setReadTimeout(5000);//设置超时信息
                           conn.setConnectTimeout(5000);//设置超时信息

                           conn.setDoInput(true);//设置输入流，允许输入
                           conn.setDoOutput(true);//设置输出流，允许输出
                           conn.setUseCaches(false);//设置POST请求方式不能够使用缓存
                           conn.disconnect();
                       } catch (IOException e) {
                           e.printStackTrace();
                       }

                   }
               }).start();
           }catch (Exception e) {
               e.printStackTrace();
           }
       }

    }
}


