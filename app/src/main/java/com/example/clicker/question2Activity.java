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

public class question2Activity extends AppCompatActivity {

    Button btn;
    private Button button;
    private Button button2;
    private RadioButton a, b, c, d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        a = (RadioButton) findViewById(R.id.q2a);
        b = (RadioButton) findViewById(R.id.q2b);
        c = (RadioButton) findViewById(R.id.q2c);
        d = (RadioButton) findViewById(R.id.q2d);

        button = (Button) findViewById(R.id.login);


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
        triggerURL();
    }

    public void triggerURL() {
        if (a.isChecked()) {
            new Thread(){
                @Override
                public void run() {
                    networkRequest11();
                }
            }.start();
        }

        if (b.isChecked()) {
            new Thread(){
                @Override
                public void run() {
                    networkRequest22();
                }
            }.start();
        }

        if (c.isChecked()) {
            new Thread(){
                @Override
                public void run() {
                    networkRequest33();
                }
            }.start();
        }

        if (d.isChecked()) {
            new Thread(){
                @Override
                public void run() {
                    networkRequest44();
                }
            }.start();
        }
    }

    private void networkRequest11(){
        HttpURLConnection connection=null;
        try {
            URL url = new URL("http://192.168.1.100:9999/Clicker/select2?choice=a");
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

    private void networkRequest22(){
        HttpURLConnection connection=null;
        try {
            URL url = new URL("http://192.168.1.100:9999/Clicker/select2?choice=b");
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
    private void networkRequest33(){
        HttpURLConnection connection=null;
        try {
            URL url = new URL("http://192.168.1.100:9999/Clicker/select2?choice=c");
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
    private void networkRequest44(){
        HttpURLConnection connection=null;
        try {
            URL url = new URL("http://192.168.1.100:9999/Clicker/select2?choice=d");
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