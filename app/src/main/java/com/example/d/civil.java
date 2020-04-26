package com.example.d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class civil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void insertcivil(View view) {
        Intent intent = new Intent(civil.this, civilAdd.class);
        startActivity(intent);
    }

    public void viewcivil(View view) {
        Intent intent = new Intent(civil.this, civilView.class);
        startActivity(intent);
    }
}
