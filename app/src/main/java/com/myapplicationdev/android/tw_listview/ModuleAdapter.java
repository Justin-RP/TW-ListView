package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<Modules> {

    private ArrayList<Modules> modules;
    private Context context;
    private TextView tvModule;
    private ImageView ivImg;

    public ModuleAdapter(Context context, int resource, ArrayList<Modules> object) {
        super(context, resource, object);
        // Store the food that is passed to this adapter
        modules = object;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvModule = (TextView) rowView.findViewById(R.id.textViewName);
        // Get the ImageView object
        ivImg = (ImageView) rowView.findViewById(R.id.imageViewMod);
        // The parameter "position" is the index of the row ListView is requesting. We get back the food at the same index.
        Modules currentMod = modules.get(position);
        // Set the TextView to show the food
        tvModule.setText(currentMod.getName());
        // Set the image to star or nostar accordingly
        if(currentMod.isImg()) {
            ivImg.setImageResource(R.drawable.prog);
        }
        else {
            ivImg.setImageResource(R.drawable.nonprog);
        }
        // Return the nicely done up View to the ListView
        return rowView;

    }
}
