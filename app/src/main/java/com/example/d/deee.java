package com.example.d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class deee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deee);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void insertdeee(View view) {
        Intent intent = new Intent(deee.this, deeeAdd.class);
        startActivity(intent);
    }

    public void viewdeee(View view) {
        Intent intent = new Intent(deee.this, deeeView.class);
        startActivity(intent);
    }
}