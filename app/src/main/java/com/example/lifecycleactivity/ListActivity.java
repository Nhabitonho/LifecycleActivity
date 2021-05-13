package com.example.lifecycleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ListActivity extends AppCompatActivity {

    Button mBtnNavigateScreen1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        mBtnNavigateScreen1 = findViewById(R.id.buttonNavigateScreen1);
        Log.d("BBB","List : onCreate");

        mBtnNavigateScreen1 = findViewById(R.id.buttonNavigateScreen1);
        mBtnNavigateScreen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","List : onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","List : onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","List : onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","List : onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","List : onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","List : onDestroy");
    }
}