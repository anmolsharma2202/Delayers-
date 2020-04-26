package com.example.d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class cse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void insertcse(View view) {
        Intent intent = new Intent(cse.this, cseAdd.class);
        startActivity(intent);
    }

    public void viewcse(View view) {
        Intent intent = new Intent(cse.this, cseView.class);
        startActivity(intent);
    }
}
