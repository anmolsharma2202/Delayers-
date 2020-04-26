package com.example.d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText user,pass;
    Button btnlogin;
    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        user = findViewById(R.id.username);
        pass = findViewById(R.id.password);
        btnlogin = findViewById(R.id.login);
        sp = findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.usertype,R.layout.support_simple_spinner_dropdown_item);
        sp.setAdapter(adapter);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String item =sp.getSelectedItem().toString();
                if (user.getText().toString().equals("CSE")&& pass.getText().toString().equals("Rocks")&& item.equals("CSE")){
                    Intent intent = new Intent(LoginActivity.this, cse.class);
                    startActivity(intent);
                }else if (user.getText().toString().equals("ECE")&& pass.getText().toString().equals("ECE")&& item.equals("ECE")){
                    Intent intent = new Intent(LoginActivity.this, ece.class);
                    startActivity(intent);
                }else if (user.getText().toString().equals("EEE")&& pass.getText().toString().equals("EEE")&& item.equals("EEE")) {
                    Intent intent = new Intent(LoginActivity.this, eee.class);
                    startActivity(intent);
                }
                else if (user.getText().toString().equals("MECH")&& pass.getText().toString().equals("MECH")&& item.equals("MECH")){
                    Intent intent = new Intent(LoginActivity.this, mech.class);
                    startActivity(intent);}
                else if (user.getText().toString().equals("CIVIL")&& pass.getText().toString().equals("CIVIL")&& item.equals("CIVIL")){
                    Intent intent = new Intent(LoginActivity.this, civil.class);
                    startActivity(intent);}
                else if (user.getText().toString().equals("DEEE")&& pass.getText().toString().equals("DEEE")&& item.equals("DEEE")){
                    Intent intent = new Intent(LoginActivity.this, deee.class);
                    startActivity(intent);}
                else if (user.getText().toString().equals("DME")&& pass.getText().toString().equals("DME")&& item.equals("DME")){
                    Intent intent = new Intent(LoginActivity.this, dme.class);
                    startActivity(intent);}
                else {
                    Toast.makeText(getApplicationContext(), "INCORRECT CREDENTIALS", Toast.LENGTH_SHORT).show();
                }
            }


        });
    }

    public void login(View view) {
    }
}

