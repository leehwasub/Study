package com.example.user.layoutpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button goLinearLayoutButton = (Button)findViewById(R.id.goLinearLayout);
        Button goRelativeLayoutButton = (Button)findViewById(R.id.goRelativeLayout);
        Button goFrameLayoutButton = (Button)findViewById(R.id.goFrameLayout);
        Button goTableLayoutButton = (Button)findViewById(R.id.goTableLayout);
        Button goListViewButton = (Button)findViewById(R.id.goListView);
        Button goGridViewButton = (Button)findViewById(R.id.goGridView);

        goLinearLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LinearLayoutActivity.class));
            }
        });
        goRelativeLayoutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RelativeLayoutActivity.class));
            }
        });
        goFrameLayoutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FrameLayoutActivity.class));
            }
        });
        goTableLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TableLayoutActivity.class));
            }
        });
        goListViewButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ListViewActivity.class));
            }
        });
        goGridViewButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, GridViewActivity.class));
            }
        });
    }
}
