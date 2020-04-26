package com.example.d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class ece extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void insertece(View view) {
        Intent intent = new Intent(ece.this, eceAdd.class);
        startActivity(intent);
    }

    public void viewece(View view) {
        Intent intent = new Intent(ece.this, eceView.class);
        startActivity(intent);
    }
}
