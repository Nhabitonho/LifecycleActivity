package com.example.lifecycleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button mBtnNavigateScreen3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mBtnNavigateScreen3 = findViewById(R.id.buttonNavigateScreen3);
        Log.d("BBB","Home : onCreate");

        mBtnNavigateScreen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,ListActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","Home : onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","Home : onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","Home : onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","Home : onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","Home : onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","Home : onDestroy");
    }
}