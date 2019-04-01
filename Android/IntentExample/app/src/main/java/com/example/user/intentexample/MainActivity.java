package com.example.user.intentexample;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sub1Button = (Button)findViewById(R.id.button_sub1);
        sub1Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(MainActivity.this, Sub1Activity.class), 3000);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 3000 && resultCode == RESULT_OK){
            String name = data.getStringExtra("이름");
            String password = data.getStringExtra("비밀번호");
            Toast.makeText(this, "name : " + name + ", password : " + password, Toast.LENGTH_LONG).show();
        }
    }
}
