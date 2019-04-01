package com.example.user.alertdialogexample;

import android.app.Application;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button dialog1Button;
    Button dialog2Button;
    Button dialog3Button;
    Button dialog4Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialog1Button = (Button)findViewById(R.id.button_dialog1);
        dialog1Button.setOnClickListener(this);
        dialog2Button = (Button)findViewById(R.id.button_dialog2);
        dialog2Button.setOnClickListener(this);
        dialog3Button = (Button)findViewById(R.id.button_dialog3);
        dialog3Button.setOnClickListener(this);
        dialog4Button = (Button)findViewById(R.id.button_dialog4);
        dialog4Button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_dialog1:
                show1();
                break;
            case R.id.button_dialog2:
                show2();
                break;
            case R.id.button_dialog3:
                show3();
                break;
            case R.id.button_dialog4:
                show4();
                break;
        }
    }

    private void show1(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("AlertDialog Title 1");
        builder.setMessage("AlertDialog Content 1");
        builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "예 버튼 선택!", Toast.LENGTH_LONG).show();
            }
        });
        builder.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "아니요 버튼 선택!", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }

    private void show2(){
        final List<String> ListItems = new ArrayList();
        ListItems.add("사과");
        ListItems.add("배");
        ListItems.add("귤");
        ListItems.add("바나나");
        final String[] items = ListItems.toArray(new String[ListItems.size()]);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("AlertDialog Title 2");
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String selectText = items[which].toString();
                Toast.makeText(getApplicationContext(), selectText, Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }

    private void show3(){
        final EditText editText = new EditText(this);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("AlertDialog Title 3");
        builder.setMessage("AlertDialog Content 3");
        builder.setView(editText);
        builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "예 버튼 선택!", Toast.LENGTH_LONG).show();
            }
        });
        builder.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "아니요 버튼 선택!", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }

    private void show4(){
        final List<String> ListItems = new ArrayList();
        ListItems.add("사과");
        ListItems.add("배");
        ListItems.add("귤");
        ListItems.add("바나나");
        final String[] items = ListItems.toArray(new String[ListItems.size()]);

        final List selectedItems = new ArrayList();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("AlertDialog Title 4");
        builder.setMultiChoiceItems(items, null, new DialogInterface.OnMultiChoiceClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                if(isChecked){
                    selectedItems.add(items[which]);
                } else if(selectedItems.contains(items[which])){
                    selectedItems.remove(items[which]);
                }
            }
        });
        builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String msg = "";
                for (int i = 0; i < selectedItems.size(); i++) {
                    msg = msg+ "\n" + (i+1) + " : " + ListItems.get(i);
                }
                Toast.makeText(getApplicationContext(), "Total "+ selectedItems.size() +" Items Selected.\n"+ msg , Toast.LENGTH_LONG).show();
            }
        });
        builder.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "아니요 버튼 선택!", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }

}
