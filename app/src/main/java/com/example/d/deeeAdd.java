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

public class deeeAdd extends AppCompatActivity {
    AutoCompleteTextView txtname, txtroll, sec;
    Button btn;

    private static final String[] DEEE = new String[]{

            "19433-EE-001",
            "19433-EE-002",
            "19433-EE-003",
            "19433-EE-004",
            "19433-EE-005",
            "19433-EE-006",
            "19433-EE-007",
            "19433-EE-008",
            "19433-EE-009",
            "19433-EE-010",
            "19433-EE-011",
            "19433-EE-012",
            "19433-EE-013",
            "19433-EE-014",
            "19433-EE-015",
            "19433-EE-016",
            "19433-EE-017",
            "19433-EE-018",
            "19433-EE-019",
            "19433-EE-020",
            "19433-EE-021",
            "19433-EE-022",
            "19433-EE-023",
            "19433-EE-024",
            "19433-EE-025",
            "19433-EE-026",
            "19433-EE-027",
            "19433-EE-028",
            "18433-EE-001",
            "18433-EE-002",
            "18433-EE-003",
            "18433-EE-004",
            "18433-EE-005",
            "18433-EE-006",
            "18433-EE-007",
            "18433-EE-008",
            "18433-EE-009",
            "18433-EE-010",
            "18433-EE-011",
            "18433-EE-012",
            "18433-EE-013",
            "18433-EE-014",
            "18433-EE-015",
            "18433-EE-016",
            "18433-EE-017",
            "18433-EE-018",
            "18433-EE-019",
            "18433-EE-020",
            "18433-EE-021",
            "18433-EE-022",
            "18433-EE-023",
            "18433-EE-024",
            "18433-EE-025",
            "18433-EE-026",
            "18433-EE-027",
            "18433-EE-028",
            "18433-EE-029",
            "18433-EE-030",
            "18433-EE-031",
            "18433-EE-032",
            "18433-EE-033",
            "18433-EE-034",
            "18433-EE-035",
            "18433-EE-036",
            "18433-EE-037",
            "17433-EE-001",
            "17433-EE-002",
            "17433-EE-003",
            "17433-EE-004",
            "17433-EE-005",
            "17433-EE-006",
            "17433-EE-007",
            "17433-EE-008",
            "17433-EE-009",
            "17433-EE-010",
            "17433-EE-012",
            "17433-EE-013",
            "17433-EE-014",
            "17433-EE-015",
            "17433-EE-016",
            "17433-EE-017",
            "17433-EE-018",
            "17433-EE-020",
            "17433-EE-021",
            "17433-EE-023",
            "17433-EE-024",
            "17433-EE-025",
            "17433-EE-026",
            "17433-EE-027",
            "17433-EE-028",
            "17433-EE-029",
            "17433-EE-030",
            "17433-EE-031",
            "17433-EE-032",
            "17433-EE-033",
            "17433-EE-034"

    };
    private static final String[] DEEEName = new String[]{
            "AYINAM SIVA SAI",
            "BANTUBILLI CHANDU",
            "BUDDHA RAJESH",
            "CHEEPURUPALLI UDAY KIRAN",
            "CHITTIBOYENA YAMINI DEVI",
            "CHODAPALLI SANJAY DATH",
            "DAKARAPU SIRISHA",
            "DANTULURI TEJA SAI VARMA",
            "KALLURI TRIVENI",
            "KODA DINESH",
            "KOMARAPURI MANIKANTA",
            "MALLA MEGHASHYAM",
            "MEESALA GNANESWAR",
            "MUNUBARTHY CHAITANYA SAI",
            "NALLI BHARATH KUMAR",
            "NARAYANAPURAM SAI KUMAR",
            "NOLLU SAHITYA",
            "PAKALAPATI HEMANTH VARMA",
            "PAPPALA PRIYA",
            "PEETHALA RAGHAVENDRA",
            "PENTAKOTA PAVANSATISH",
            "PILLI UMA SATYA VENKAT",
            "PUSHPAJA PAPPU",
            "SIRIKI RAHUL",
            "UGGINA USHA",
            "UMMIDI MADHAVI",
            "VANAMADI SAI KUMAR",
            "VEMULA RAVI TEJA",
            "AGARAPU INDIRA",
            "AGATHAMUDI BHARATH",
            "AKKIREDDI JAGADEESH",
            "AAKKIREDDY BHASKARA RAO",
            "AMARAPALLI JANAKI",
            "AMBATI RAVI",
            "ARI V.D.L. LAVANYA",
            "ATTALURI DINESH",
            "BANTUPALLI VIVEKANANDA",
            "BORRA SAI MANOHAR",
            "CHUKKA THARUN",
            "DEVAGUPTAPU ANIKETH SANDILYA",
            "EEGALA BHARGAVI",
            "GANGAVARAPU YOGESH",
            "GENJI KUMAR",
            "GOMPA JAYA",
            "JAMMU NAVEEN",
            "JAYATHI ARUN RAMESHWAR",
            "KANDAVILLI THIRUMALA PRASAD",
            "KANNAMREDDI LOKESH",
            "KANURI DURGA BHAVANI",
            "KARRI VENKATA SAI MANIKANTA",
            "KODIGUDLA BALA GANESH MANIKANTA",
            "LALAM YASWANTH",
            "LENKA KOTESWARA RAO",
            "LOCHARLA PRIYANKA",
            "NAKKA VEERA KANAKA MAHA LAKSHMI",
            "OMMI VIVEK VARDHAN",
            "POLAMARASETTY LIKITHA",
            "PONTHAPALLI HARSHINI",
            "PUJARI ADITYA VARDHAN",
            "RAGUTHI DIVYA",
            "RAI SIRISHA",
            "SABBAVARAPU SURENDRA KUMAR",
            "SANGA NISSIE ASISH",
            "TATTABANA MOHAN KUMAR",
            "VUTA BALAJI",
            "ADARI VARAHA VENKATA JAGADEES SW",
            "ATTADA JAI SAI KUMAR",
            "BAGATHI SAI KARTHIK",
            "BALIREDDY VINETHA",
            "CHERUKURI GUNNA RAJU",
            "CHINNAM SIVA KOTESWARA REDDY",
            "CHINTHAPALLI MAHENDAR YASWANTH",
            "DASAMANTHARAO SAI GOUTHAM",
            "GAJJI LAKSHMANA RAO",
            "G NISHANK BABA",
            "G SUNIL GOPI",
            "KADIMI HARINADH",
            "KARANAM NAVEEN KUMAR",
            "KARUMURI SAGAR",
            "KILLI GEETHA NANDINI",
            "KONDROTHU RAMUNAIDU",
            "KONKIPUDI GANGADHAR",
            "KOSURI SHALINI SHIVA PRIYA",
            "KOTTALA MANOHAR",
            "LAKUMDASU JASWANTH KUMAR",
            "MUNIRATNAM SEKHAR RAJA RAVINDRA",
            "NAKKA CHANDRIKA DEVI",
            "NALLA NAVEEN SAI CHANDRA",
            "PANDURI HEMA SUNDHAR",
            "PATIBANDLA BOAZ RAJU",
            "SALAPU SAI GANESH",
            "SANAPATHI LEELA KRISHNA",
            "SIMHADRI LOHITH KUMAR",
            "SIRASAPALLI SAI KUMAR",
            "SORNAPUDI BHARGAVI",
            "V DEEKSHITHA YADAV",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deee_add);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        txtname = findViewById(R.id.name);
        txtroll = findViewById(R.id.rollno);
        sec = findViewById(R.id.section);
        btn = findViewById(R.id.submit);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, DEEE);
        txtroll.setAdapter(adapter);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, DEEEName);
        txtname.setAdapter(adapter1);


    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public void submit(View view) {
        String url = "http://192.168.6.139/insertdeee.php";
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
            Toast.makeText(deeeAdd.this, "details saved", Toast.LENGTH_SHORT).show();
            myrequest.add(stringRequest);

        }
    }
}










