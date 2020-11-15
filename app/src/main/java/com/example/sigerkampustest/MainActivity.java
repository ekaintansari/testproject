package com.example.sigerkampustest;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //4000=4 detik
        int waktu_loading = 4000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //setelah loading maka akan berpindah ke home activity
                Intent activity_home= new Intent(MainActivity.this,activity_home.class);
                startActivity(activity_home);
                finish();

            }
        }, waktu_loading);
    }
}