package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<Module> module;
    TextView tvYear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvYear = (TextView) findViewById(R.id.tvYear);
        lv = (ListView) this.findViewById(R.id.lvModules);

        module = new ArrayList<Module>();

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);
        module.add(new Module("C208","Test" ,true));
        module.add(new Module("C200","Test" ,false));
        module.add(new Module("C346","Test" ,true));

        // arrayadapter - link with row2.xml, and the arraylist module
        aa = new ModuleAdapter(this, R.layout.row2, module);
        lv.setAdapter(aa);

    }



}
