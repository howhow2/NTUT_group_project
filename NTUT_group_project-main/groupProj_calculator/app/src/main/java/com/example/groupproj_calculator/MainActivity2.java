package com.example.groupproj_calculator;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    private Button sure=null;
    private Button reset=null;
    private Button btnBack;
    int num = 5;
    private EditText input_object=null;
    Random random = new Random(10);
    int rand = random.nextInt(10);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sure = (Button) findViewById(R.id.btn_submit);
        reset = (Button) findViewById(R.id.btn_restart);
        input_object = (EditText) findViewById(R.id.ed_input);

        sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String empt=input_object.getText().toString().trim();

                if(num>0) {
                    if (empt.isEmpty()) {
                        Toast.makeText(MainActivity2.this, "請輸入數字", Toast.LENGTH_LONG).show();
                    } else {
                        num--;
                        int inputnum = (int) Integer.parseInt(input_object.getText().toString());
                        if (inputnum == rand) {
                            Toast.makeText(MainActivity2.this, "恭喜!猜對了!", Toast.LENGTH_LONG).show();
                        } else if (inputnum < rand) {
                            Toast.makeText(MainActivity2.this, "猜小了...還有" + num+"次機會", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(MainActivity2.this, "猜大了...還有" + num+"次機會", Toast.LENGTH_LONG).show();
                        }
                    }
                }else if(num==0){

                    Toast.makeText(MainActivity2.this, "答案是："+rand+"結束了～請重新開始", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivityForResult(new Intent(MainActivity2.this,
                        MainActivity.class), 10);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rand = random.nextInt(10);
                num=5;
                Toast.makeText(MainActivity2.this, "隨機數重置", Toast.LENGTH_LONG).show();
            }
        });
    }
}