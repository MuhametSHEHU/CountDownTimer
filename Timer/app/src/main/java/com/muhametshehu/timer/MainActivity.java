package com.muhametshehu.timer;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        new CountDownTimer(10000,100){

            @Override
            public void onTick(long millisUntilFinished) {

                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Left: " +  millisUntilFinished / 100);

            }

            @Override
            public void onFinish() {

                Toast.makeText(getApplicationContext(), "Time is Done", Toast.LENGTH_LONG).show();

                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Left: 0 ");

            }


        }.start();

    }
}
