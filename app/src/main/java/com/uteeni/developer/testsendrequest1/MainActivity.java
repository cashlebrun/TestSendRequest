package com.uteeni.developer.testsendrequest1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.net.Uri;
import android.net.Uri.Builder;

import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity {
    public final String LOG_TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendRequest() throws ClassNotFoundException {
        EditText editText1 = (EditText) findViewById(R.id.et1);
        String box1 = editText1.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.et2);
        String box2 = editText1.getText().toString();

        EditText editText3 = (EditText) findViewById(R.id.et3);
        String box3 = editText1.getText().toString();

        EditText editText4 = (EditText) findViewById(R.id.et4);
        String box4 = editText1.getText().toString();



        final String concat = box1 += box2 += box3 += box4;

        Log.d(LOG_TAG, ">>>>>>>>" + concat);

        Button button = (Button) findViewById(R.id.send_request);

        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String sendUrl = "http://google.com" + URLEncoder.encode(concat);
            }
        });


    }



}
