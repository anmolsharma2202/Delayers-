package com.example.d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class dme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dme);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void insertdme(View view) {
        Intent intent = new Intent(dme.this, dmeAdd.class);
        startActivity(intent);
    }

    public void viewdme(View view) {
        Intent intent = new Intent(dme.this, dmeView.class);
        startActivity(intent);
    }
}
