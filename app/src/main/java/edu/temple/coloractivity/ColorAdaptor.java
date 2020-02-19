package edu.temple.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorAdaptor extends BaseAdapter {
    Context context;
    ArrayList<String> colors;
    LayoutInflater inflater;

    public ColorAdaptor(Context c, ArrayList<String> co){
        this.context = c;
        this.colors = co;
    }

    @Override
    public int getCount() {

        return colors.size();
    }

    @Override
    public Object getItem(int position) {
        return colors.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView newview = new TextView(context);

        newview.setText(colors.get(position));
        newview.setBackgroundColor(Color.parseColor(colors.get(position)));

        return newview;
    }


}
