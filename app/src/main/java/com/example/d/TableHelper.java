package com.example.d;

import android.content.Context;

import java.util.ArrayList;

public class TableHelper {

    Context c;
    private String[] SpaceProbeHeaders={"rollno","name","section","date"};
    private String[][] SpaceProbes ;

    public TableHelper(Context c) {
        this.c= c;

    }

    public String[] getSpaceProbeHeaders()
    {
        return SpaceProbeHeaders;
    }

    public String[][] returnSpaceProbesArray(ArrayList<spacecraft> spacecrafts)
    {
        SpaceProbes = new String[spacecrafts.size()][4];
        spacecraft s;
        for (int i=0;i<spacecrafts.size();i++){
            s=spacecrafts.get(i);

            SpaceProbes[i][0]=s.getRollno();
            SpaceProbes[i][1]=s.getName();
            SpaceProbes[i][2]=s.getSection();
            SpaceProbes[i][3]=s.getDate();

        }
        return SpaceProbes;
    }
}

