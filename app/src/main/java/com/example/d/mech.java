package com.example.d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class mech extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mech);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }




    public void insertmech(View view) {
            Intent intent = new Intent(mech.this, mechAdd.class);
            startActivity(intent);
        }


    public void viewmech(View view) {
        Intent intent = new Intent(mech.this, mechView.class);
        startActivity(intent);
    }
}


