package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.RadioButton;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import android.util.*;


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


        button = (Button) findViewById(R.id.login);
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
        if (a.isChecked()) {
            new Thread(){
                @Override
                public void run() {
                    networkRequest1();
                }
            }.start();
        }

        if (b.isChecked()) {
            new Thread(){
                @Override
                public void run() {
                    networkRequest2();
                }
            }.start();
        }

        if (c.isChecked()) {
            new Thread(){
                @Override
                public void run() {
                    networkRequest3();
                }
            }.start();
        }

        if (d.isChecked()) {
            new Thread(){
                @Override
                public void run() {
                    networkRequest4();
                }
            }.start();
        }
    }

    private void networkRequest1(){
        HttpURLConnection connection=null;
        try {
            URL url = new URL("http://192.168.1.100:9999/Clicker/select1?choice=a");
            connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(3000);
            connection.setReadTimeout(3000);
            //设置请求方式 GET / POST 一定要大小
            connection.setRequestMethod("GET");
            connection.setDoInput(true);
            connection.setDoOutput(false);
            connection.connect();
            int responseCode = connection.getResponseCode();
            if (responseCode != HttpURLConnection.HTTP_OK) {
                throw new IOException("HTTP error code" + responseCode);
            }
            String result = getStringByStream(connection.getInputStream());
            if (result == null) {
                Log.d("Fail", "失败了");
            }else{
                Log.d("succuss", "成功了 ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void networkRequest2(){
        HttpURLConnection connection=null;
        try {
            URL url = new URL("http://192.168.1.100:9999/Clicker/select1?choice=b");
            connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(3000);
            connection.setReadTimeout(3000);
            //设置请求方式 GET / POST 一定要大小
            connection.setRequestMethod("GET");
            connection.setDoInput(true);
            connection.setDoOutput(false);
            connection.connect();
            int responseCode = connection.getResponseCode();
            if (responseCode != HttpURLConnection.HTTP_OK) {
                throw new IOException("HTTP error code" + responseCode);
            }
            String result = getStringByStream(connection.getInputStream());
            if (result == null) {
                Log.d("Fail", "失败了");
            }else{
                Log.d("succuss", "成功了 ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void networkRequest3(){
        HttpURLConnection connection=null;
        try {
            URL url = new URL("http://192.168.1.100:9999/Clicker/select1?choice=c");
            connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(3000);
            connection.setReadTimeout(3000);
            //设置请求方式 GET / POST 一定要大小
            connection.setRequestMethod("GET");
            connection.setDoInput(true);
            connection.setDoOutput(false);
            connection.connect();
            int responseCode = connection.getResponseCode();
            if (responseCode != HttpURLConnection.HTTP_OK) {
                throw new IOException("HTTP error code" + responseCode);
            }
            String result = getStringByStream(connection.getInputStream());
            if (result == null) {
                Log.d("Fail", "失败了");
            }else{
                Log.d("succuss", "成功了 ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void networkRequest4(){
        HttpURLConnection connection=null;
        try {
            URL url = new URL("http://192.168.1.100:9999/Clicker/select1?choice=d");
            connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(3000);
            connection.setReadTimeout(3000);
            //设置请求方式 GET / POST 一定要大小
            connection.setRequestMethod("GET");
            connection.setDoInput(true);
            connection.setDoOutput(false);
            connection.connect();
            int responseCode = connection.getResponseCode();
            if (responseCode != HttpURLConnection.HTTP_OK) {
                throw new IOException("HTTP error code" + responseCode);
            }
            String result = getStringByStream(connection.getInputStream());
            if (result == null) {
                Log.d("Fail", "失败了");
            }else{
                Log.d("succuss", "成功了 ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private String getStringByStream(InputStream inputStream){
        Reader reader;
        try {
            reader=new InputStreamReader(inputStream,"UTF-8");
            char[] rawBuffer=new char[512];
            StringBuffer buffer=new StringBuffer();
            int length;
            while ((length=reader.read(rawBuffer))!=-1){
                buffer.append(rawBuffer,0,length);
            }
            return buffer.toString();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }




}


