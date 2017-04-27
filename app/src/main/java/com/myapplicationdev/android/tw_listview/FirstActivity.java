package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    ListView lv;
    TextView tv;
    ArrayList<String> modules;
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) this.findViewById(R.id.lvModule);
        tv = (TextView) this.findViewById(R.id.tvYear);


        modules = new ArrayList<String>();
        modules.add("Year 1");
        modules.add("Year 2");
        modules.add("Year 3");

        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, modules);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String year = modules.get(position).toString();
                Intent i = new Intent(FirstActivity.this, SecondActivity.class);
                i.putExtra("year", year);
                startActivity(i);
            }
        });





    }
}
