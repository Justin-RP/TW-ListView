package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    ArrayList<String> alYear;
    ArrayAdapter<String> aaYear;
    ListView lvYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvYear=(ListView)findViewById(R.id.ListViewYear);



        alYear = new ArrayList<String>();
        alYear.add("Year 1");
        alYear.add("Year 2");
        alYear.add("Year 3");

        aaYear = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alYear);
        lvYear.setAdapter(aaYear);

        lvYear.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> lvYear, View view, int position, long id) {
                String Year = (String) lvYear.getAdapter().getItem(position);
                Intent intent = new Intent(lvYear.getContext(), SecondActivity.class);
                intent.putExtra("year", Year);

                startActivity(intent);
            }
        });







    }
}
