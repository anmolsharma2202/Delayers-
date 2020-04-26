package com.example.d;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class eeeAdd extends AppCompatActivity {
    AutoCompleteTextView txtname, txtroll, sec;
    Button btn;

    private static final String[] EEE = new String[]{
            "16NU1A0201",
            "17NU5A0201",
            "17NU5A0203",
            "17NU5A0204",
            "17NU5A0205",
            "17NU5A0207",
            "17NU5A0208",
            "17NU5A0209",
            "17NU5A0210",
            "17NU5A0211",
            "17NU5A0212",
            "17NU1A0201",
            "17NU1A0202",
            "17NU1A0203",
            "17NU1A0204",
            "17NU1A0205",
            "17NU1A0207",
            "18NU5A0201",
            "18NU5A0202",
            "18NU5A0203",
            "18NU5A0204",
            "18NU5A0205",
            "18NU5A0206",
            "18NU5A0207",
            "18NU5A0208",
            "18NU5A0209",
            "18NU5A0210",
            "18NU5A0211",
            "18NU5A0212",
            "18NU5A0213",
            "18NU5A0215",
            "18NU5A0216",
            "18NU5A0218",
            "18NU5A0219",
            "18NU5A0220",
            "18NU5A0221",
            "18NU5A0222",
            "18NU5A0223",
            "18NU5A0224",
            "18NU5A0225",
            "18NU5A0227",
            "18NU5A0228",
            "18NU5A0229",
            "18NU5A0230",
            "18NU5A0231",
            "18NU5A0232",
            "18NU5A0233",
            "18NU5A0234",
            "18NU5A0235",
            "18NU5A0236",
            "18NU5A0237",
            "18NU5A0238",
            "18NU5A0239",
            "18NU5A0240",
            "18NU5A0241",
            "18NU5A0242",
            "18NU5A0243",
            "18NU5A0244",
            "18NU5A0245",
            "18NU5A0246",
            "18NU5A0247",
            "18NU5A0248",
            "18NU5A0249",
            "18NU1A0201",
            "18NU1A0202",
            "18NU1A0203",
            "18NU1A0204",
            "18NU1A0206",
            "18NU1A0207",
            "18NU1A0208",
            "18NU1A0209",
            "18NU1A0210",
            "18NU1A0211",
            "18NU1A0212",
            "18NU1A0213",
            "18NU1A0214",
            "18NU1A0215",
            "19NU5A0201",
            "19NU5A0202",
            "19NU5A0203",
            "19NU5A0204",
            "19NU5A0205",
            "19NU5A0206",
            "19NU5A0207",
            "19NU5A0208",
            "19NU5A0209",
            "19NU5A0211",
            "19NU5A0212",
            "19NU5A0213",
            "19NU5A0214",
            "19NU5A0215",
            "19NU5A0216",
            "19NU5A0217",
            "19NU5A0218",
            "19NU5A0219",
            "19NU5A0220",
            "19NU5A0221",
            "19NU5A0222",
            "19NU5A0223",
            "19NU5A0224",
            "19NU5A0225",
            "19NU5A0226",
            "19NU5A0227",
            "19NU5A0228",
            "19NU5A0229",
            "19NU5A0230",
            "19NU5A0231",
            "19NU5A0232",
            "19NU5A0233",
            "19NU5A0234",
            "19NU5A0235",
            "19NU5A0236",
            "19NU5A0237",
            "19NU5A0238",
            "19NU5A0239",
            "19NU5A0240",
            "19NU5A0241",
            "19NU5A0242",
            "19NU5A0243",
            "19NU5A0245",
            "19NU5A0246",
            "19NU5A0247",
            "19NU5A0248",
            "19NU5A0249",
            "19NU5A0250",
            "17NU1A0206",
            "19NU1A0201",
            "19NU1A0202",
            "19NU1A0203",
            "19NU1A0204",
            "19NU1A0205",
            "19NU1A0206",
            "19NU1A0207",
            "19NU1A0208",
            "19NU1A0209",
            "19NU1A0210",
            "19NU1A0211",
            "19NU1A0212",
            "19NU1A0213",

    };
    private static final String[] EEENAME = new String[]{


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee_add);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        txtname = findViewById(R.id.name);
        txtroll = findViewById(R.id.rollno);
        sec = findViewById(R.id.section);
        btn = findViewById(R.id.submit);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, EEE);
        txtroll.setAdapter(adapter);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, EEENAME);
        txtname.setAdapter(adapter1);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public void submit(View view) {
        String url = "http://192.168.1.8/inserteee.php";
        RequestQueue myrequest = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), response, Toast.LENGTH_LONG).show();

            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(), error.getMessage().toString(), Toast.LENGTH_LONG).show();
                    }
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> map = new HashMap<String, String>();
                map.put("name", txtname.getText().toString());
                map.put("rollno", txtroll.getText().toString());
                map.put("section", sec.getText().toString());
                return map;
            }
        };
        if (TextUtils.isEmpty(txtroll.getText().toString())) {
            txtroll.setError("required roll");

        }

        if (TextUtils.isEmpty(txtname.getText().toString())) {
            txtname.setError("required name");
        }
        if (TextUtils.isEmpty(sec.getText().toString())) {
            sec.setError("required section");

        } else {
            Toast.makeText(eeeAdd.this, "details saved", Toast.LENGTH_SHORT).show();

            myrequest.add(stringRequest);
        }
    }
}
