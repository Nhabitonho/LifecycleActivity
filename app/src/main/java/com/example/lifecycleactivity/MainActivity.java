package com.example.lifecycleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mBtnNavigateScreen2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BBB","Main : onCreate");
        mBtnNavigateScreen2 = findViewById(R.id.buttonNavigateScreen2);

        mBtnNavigateScreen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","Main : onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","Main : onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","Main : onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","Main : onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","Main : onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","Main : onDestroy");
    }
}