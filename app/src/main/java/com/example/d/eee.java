package com.example.d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class eee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void inserteee(View view) {
        Intent intent = new Intent(eee.this, eeeAdd.class);
        startActivity(intent);

    }

    public void vieweee(View view) {
        Intent intent = new Intent(eee.this, eeeView.class);
        startActivity(intent);

    }
}
