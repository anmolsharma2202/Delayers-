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

public class civilAdd extends AppCompatActivity {
    AutoCompleteTextView txtname, txtroll, sec;
    Button btn;

    private static final String[] CIVIL = new String[]{
            "19NU1A0101",
            "19NU1A0102",
            "19NU1A0103",
            "19NU1A0104",
            "19NU1A0105",
            "19NU1A0106",
            "19NU1A0107",
            "18NU1A0101",
            "18NU1A0102",
            "18NU1A0103",
            "18NU1A0104",
            "18NU1A0105",
            "18NU1A0106",
            "18NU1A0107",
            "18NU1A0109",
            "18NU1A0110",
            "18NU1A0111",
            "18NU1A0112",
            "18NU1A0113",
            "18NU1A0114",
            "18NU1A0115",
            "18NU1A0116",
            "19NU5A0101",
            "19NU5A0102",
            "19NU5A0103",
            "19NU5A0104",
            "19NU5A0105",
            "19NU5A0106",
            "19NU5A0107",
            "19NU5A0108",
            "19NU5A0109",
            "19NU5A0110",
            "19NU5A0111",
            "19NU5A0112",
            "19NU5A0113",
            "19NU5A0114",
            "19NU5A0115",
            "19NU5A0116",
            "19NU5A0117",
            "19NU5A0119",
            "19NU5A0120",
            "19NU5A0122",
            "19NU5A0123",
            "19NU5A0124",
            "19NU5A0125",
            "19NU5A0126",
            "19NU5A0127",
            "19NU5A0128",
            "19NU5A0129",
            "19NU5A0130",
            "19NU5A0131",
            "19NU5A0132",
            "19NU5A0133",
            "19NU5A0134",
            "19NU5A0135",
            "19NU5A0136",
            "19NU5A0138",
            "19NU5A0139",
            "16NU1A0102",
            "16NU1A0104",
            "17NU1A0101",
            "18NU5A0101",
            "18NU5A0102",
            "18NU5A0103",
            "18NU5A0104",
            "18NU5A0105",
            "18NU5A0106",
            "18NU5A0107",
            "18NU5A0108",
            "18NU5A0109",
            "18NU5A0110",
            "18NU5A0111",
            "18NU5A0112",
            "18NU5A0113",
            "18NU5A0114",
            "18NU5A0115",
            "18NU5A0116",
            "18NU5A0117",
            "18NU5A0118",
            "18NU5A0119",
            "18NU5A0120",
            "18NU5A0122",
            "18NU5A0123",
            "18NU5A0124",
            "18NU5A0125",
            "18NU5A0126",
            "18NU5A0127",
            "18NU5A0128",
            "18NU5A0129",
            "18NU5A0130",
            "18NU5A0131",
            "18NU5A0132",
            "16NU1A0101",
            "16NU1A0103",
            "16NU1A0105",
            "17NU5A0101",
            "17NU5A0102",
            "17NU5A0103",
            "17NU5A0104",
            "17NU5A0105",
            "17NU5A0106",
            "17NU5A0107",
            "17NU5A0108",


    };
    private static final String[] CIVILName = new String[]{
            "BAGANA VENKATA RAMANA MURTY",
            "BONDA SAI BHARGAV",
            "GANAPATHIRAJU JAYA KRISHNA VARMA",
            "KADAMATI VISWANATH",
            "KAKKALA MURALI",
            "MODI ANATA RAO",
            "SABBAVARAPU GNANA PRADEEP",
            "ANKUR KUMAR SINGH",
            "ARASADA BHANOJI RAO",
            "BAYANA VAMSI",
            "CHAITANYA VARMA SAGIRAJU",
            "CHUNDRU SAIRAM",
            "DANDUPOLU DURGA PRASAD",
            "DASARI SRI VENKATA SAI THRINADH GOPAL",
            "KOTNI RENUKA",
            "LACHIREDDY SATISH",
            "MADDILA KRISHNA RAVALI",
            "NAKKA MURALI KRISHNA",
            "PRITI ROUT",
            "SABBISETTI MOUNIKA",
            "SIRAPARAPU SRI LAKSHMI NARAYANA",
            "VARADA THANUS",
            "ADARI VARAHA HANUMANTHA RAO",
            "ADIVARAPU NAGESH",
            "AKKIREDDY LAVANYA",
            "ARIKITHOTA SRIVAMSI",
            "BADITHAMANI BHAVANA SRI",
            "BADNAINI MOHAN",
            "BESATTY YUVA RAJ",
            "BOBBARA YASWANTH",
            "BODDU SANDHYA",
            "DADI REVANTH",
            "DASARI SIVA KUMAR",
            "GADI THARUN KUMAR",
            "GOGADA MOUNIKA",
            "GOPISETTI BHASKARA RAO",
            "IPPILI VENKATA RAMANA",
            "KARRI SATISH KUMAR",
            "KIRLA SIVAJI",
            "MATTA CHAYA SRIDEVI",
            "MIDATHANA VINOD",
            "NALLA DURGA PRASAD",
            "P. RAVI",
            "PELURI MOHANARUPA",
            "PETHAKAMSETTY EESANYA",
            "POOJARI SAIKIRAN",
            "POTNURU PARVATHI",
            "PULAMARASETTI MOHAN",
            "PULAMARASETTI RAVINDRA",
            "PURUSHOTHAM VENNELA",
            "SARAGADAM MADHUSUDHANA RAO",
            "SHAIK TAJ HUSSAIN",
            "SHAVUKARU LOKESH",
            "SIRIGAM MOHAN RAO",
            "SUREDDI PAVAN KALYAN",
            "SURISETTY POORNA CHANDRIKA",
            "VANA SASI KUMAR",
            "YERRA SUMA",
            "CHEEDI SAI VAMSI",
            "JOGA REVANTH",
            "ALLAMPALLI LAXMAN DHEERAJ",
            "ALLA VENKATARAMYA",
            "ALLAM SAI KUHELIKA",
            "APPIKONDA CHIRANJEEVI",
            "BUDARAYAVALASA MAHESH BABU",
            "CHEKKA ESWARA RAO",
            "DADI SAI SUDHAKAR",
            "DEVADULA BHARGAV",
            "GANDEPALLI SRINIVAS",
            "GANGAVARAPU VASU",
            "KANDREGULA RAJA",
            "KARRI SRAVANI",
            "KINTADA ANIL KUMAR",
            "KONATHALA SAI LAXMI",
            "KOTYADA YAMINI",
            "MARIYA DASU GOLAJAPU",
            "MATHIBOYINA JAGADEESH",
            "MUDADLA GAYATHRI",
            "MUKESH SEN",
            "PAKKI VENKATA MANOJ KUMAR",
            "PEDAPATI SAI KUMAR",
            "POLAMARASETTI MOUNIKA",
            "RAVADA MOUNIKA",
            "RAYINI BALAJI",
            "REVALLA ANURADHA",
            "SAMMINGI DURGA PRAKASH",
            "SIKHA JAHNAVI",
            "SUNKARI CHARIKA",
            "TEKETI JYOTHI KIRAN",
            "URUKUTI DEEPIKA",
            "VADAMODULA PRATYUSHA",
            "VAJRAPU PENTAYYA",
            "ASHISH KUMAR",
            "GUNTURI AKESH VARMA",
            "PAILA UDAY KUMAR",
            "ALLADA RAVINDRA",
            "BORA SUGUNA",
            "KATA NEELIMA",
            "KORADA LAKSHMAN",
            "SEKHARMAHANTI SANDEEP",
            "SUVVADA OMKARESWARI",
            "TAMMA USHA GOWRI AKHILESWARI",
            "YENUGULA SONI",


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_add);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        txtname = findViewById(R.id.name);
        txtroll = findViewById(R.id.rollno);
        sec = findViewById(R.id.section);
        btn = findViewById(R.id.submit);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, CIVIL);
        txtroll.setAdapter(adapter);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, CIVILName);
        txtname.setAdapter(adapter1);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public void submit(View view) {
        String url = "http://192.168.6.139/insertcivil.php";
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
            Toast.makeText(civilAdd.this, "details saved", Toast.LENGTH_SHORT).show();

            myrequest.add(stringRequest);
        }
    }
}
