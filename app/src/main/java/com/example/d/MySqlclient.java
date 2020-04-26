package com.example.d;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import de.codecrafters.tableview.TableView;
import de.codecrafters.tableview.toolkit.SimpleTableDataAdapter;

public class MySqlclient {
    private static final String URL="http://192.168.137.1/index1.php";


    private final Context c;
    private SimpleTableDataAdapter adapter;

    public MySqlclient(Context c) {
        this.c = c;
    }
    public void retrieved(final TableView<String[]> tb){
        final ArrayList<spacecraft> spacecrafts = new ArrayList<>();
        AndroidNetworking.get(URL)
                .setPriority(Priority.HIGH)
                .build()
                .getAsJSONArray(new JSONArrayRequestListener() {
                    @Override
                    public void onResponse(JSONArray response) {

                        JSONObject jo;
                        spacecraft s;



                        try{
                            jo = new JSONObject();
                            for (int i=0;i<response.length();i++)
                                {
                                    jo= response.getJSONObject(i);
                                    int id = jo.getInt("id");
                                    String rollno=jo.getString("rollno");
                                    String name=jo.getString("name");
                                    String section = jo.getString("section");
                                    String date = jo.getString("date");

                                    s= new spacecraft();
                                    s.setId(id);
                                    s.setRollno(rollno);
                                    s.setName(name);
                                    s.setSection(section);
                                    s.setDate(date);

                                    spacecrafts.add(s);


                                }

                            adapter = new SimpleTableDataAdapter(c,new TableHelper(c).returnSpaceProbesArray(spacecrafts));
                            tb.setDataAdapter(adapter);

                        }catch (JSONException e){
                            Log.e("jsonparser","error parsing data"+e.toString());
                            Toast.makeText(c, "GOOD RESPONSE BUT JAVA CAN'T PASS JSON IT RECEIVED. "+e.getMessage(), Toast.LENGTH_LONG).show();

                        }

                    }

                    @Override
                    public void onError(ANError anError) {

                        anError.printStackTrace();
                        Toast.makeText(c, "UNSUCCESSFULL : ERROR IS" +anError.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });
    }
}
