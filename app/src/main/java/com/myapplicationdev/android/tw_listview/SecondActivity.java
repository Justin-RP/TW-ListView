package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayAdapter aa;
    ArrayList<Modules> modulesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModule);
        tvYear = (TextView) findViewById(R.id.tvYear);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        Log.d("Year","Year is" + year);
        modulesList = new ArrayList<Modules>();
        if(year.equalsIgnoreCase("Year 1")){
            modulesList.add(new Modules("C208",true));
            modulesList.add(new Modules("C200",false));
            modulesList.add(new Modules("C346",true));
        } else if (year.equalsIgnoreCase( "Year 2")){
            modulesList.add(new Modules("C100",true));
            modulesList.add(new Modules("C900",false));
            modulesList.add(new Modules("C200",true));
        } else {
            modulesList.add(new Modules("C300",false));
            modulesList.add(new Modules("C700",false));
            modulesList.add(new Modules("C902",true));
        }
        aa = new ModuleAdapter(this, R.layout.row, modulesList);
        lv.setAdapter(aa);


    }



}
