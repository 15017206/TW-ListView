package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<Module> {

    private ArrayList<Module> year;
    private Context context;
    private TextView tvYear;
    private ImageView iv;
    private TextView tvModuleCode;

    public ModuleAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<Module> objects) {
        super(context, resource, objects);
        year = objects;
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //connect to row2.xml
        View rowView = inflater.inflate(R.layout.row2, parent, false);

        // Get the TextView object - Year
        tvYear = (TextView) rowView.findViewById(R.id.tvYear);
        // Get the ImageView object
        iv = (ImageView) rowView.findViewById(R.id.imageView2);
        // Get the TextView object - Module Code
        tvModuleCode = (TextView) rowView.findViewById(R.id.tvModuleCode);

        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Module currentModule = year.get(position);

        // Set the TextView to show the Year
        tvModuleCode.setText(currentModule.getTvYear());

        // Set the image to star or nostar accordingly
        if (currentModule.isProgramming()) {
            iv.setImageResource(R.drawable.prog);
        } else {
            iv.setImageResource(R.drawable.nonprog);
        }

        // Return the nicely done up View to the ListView
        return rowView;
    }


}
