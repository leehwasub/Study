package com.example.user.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sub1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);

        Button return1Button = (Button)findViewById(R.id.button_return1);
        return1Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("이름", "leehwasub");
                intent.putExtra("비밀번호", "123456");
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}