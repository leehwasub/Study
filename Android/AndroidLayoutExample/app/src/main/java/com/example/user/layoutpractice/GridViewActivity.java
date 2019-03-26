package com.example.user.layoutpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class GridViewActivity extends AppCompatActivity {

    GridViewAdapter gridViewAdapter;
    ArrayList<Integer> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        GridView gridView = (GridView)findViewById(R.id.gridView);
        arrayList = new ArrayList<Integer>();
        arrayList.add(R.drawable.ic_android_black_24dp);
        arrayList.add(R.drawable.ic_announcement_black_24dp);
        arrayList.add(R.drawable.ic_attach_money_black_24dp);
        arrayList.add(R.drawable.ic_bluetooth_searching_black_24dp);
        gridViewAdapter = new GridViewAdapter(this, arrayList);
        gridView.setAdapter(gridViewAdapter);
    }
}
