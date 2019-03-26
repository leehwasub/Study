package com.example.user.layoutpractice;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class GridViewAdapter extends BaseAdapter {

    private ArrayList<Integer> arrayList;
    private Context context;

    public GridViewAdapter(Context context, ArrayList<Integer> arrayList){
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context, R.layout.grid_view_item_layout, null);
        ImageView imageview = (ImageView)v.findViewById(R.id.imageView);
        imageview.setImageResource(arrayList.get(position));
        imageview.setPadding(10, 10, 10, 10);
        return v;
    }

}
