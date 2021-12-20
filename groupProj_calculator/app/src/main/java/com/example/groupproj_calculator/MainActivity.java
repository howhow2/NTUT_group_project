package com.example.groupproj_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private String mathsQuest;
    private String mathsAns;
    private EditText edInput,edOutput;
    private Button btnNo1,btnNo2,btnNo3,btnNo4,btnNo5,btnNo6,btnNo7;
    private Button btnNo8,btnNo9,btnNo0,btnDP,btnNeg,btnExe,btnPlus;
    private Button btnMinus,btnMultiply,btnDivide,btnBP,btnCA;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EditText edInput =  findViewById(R.id.ed_input);
        EditText edOutput =  findViewById(R.id.ed_output);
        Button btnNo1 =  findViewById(R.id.btn_no1);
        Button btnNo2 = findViewById(R.id.btn_no2);
        Button btnNo3 = findViewById(R.id.btn_no3);
        Button btnNo4 = findViewById(R.id.btn_no4);
        Button btnNo5 =findViewById(R.id.btn_no5);
        Button btnNo6 = findViewById(R.id.btn_no6);
        Button btnNo7 = findViewById(R.id.btn_no7);
        Button btnNo8 = findViewById(R.id.btn_no8);
        Button btnNo9 = findViewById(R.id.btn_no9);
        Button btnNo0 = findViewById(R.id.btn_no0);
        Button btnDP = findViewById(R.id.btn_dp);
        Button btnNeg = findViewById(R.id.btn_negative);
        Button btnExe = findViewById(R.id.btn_exe);
        Button btnPlus = findViewById(R.id.btn_plus);
        Button btnMinus = findViewById(R.id.btn_minus);
        Button btnMultiply = findViewById(R.id.btn_multiply);
        Button btnDivide = findViewById(R.id.btn_divide);
        Button btnBP = findViewById(R.id.btn_backspace);
        Button btnCA = findViewById(R.id.btn_cleanAll);
        setContentView(R.layout.activity_main);


        Toast.makeText(this, "Toast 基本用法", Toast.LENGTH_LONG).show();
    }

    public void btn1_OnClick(View view) {
        Toast.makeText(this, "Toast 基本用法", Toast.LENGTH_LONG).show();
    }
    public void btn2_OnClick(View view) {
        Toast.makeText(this, "Toast 基本用法", Toast.LENGTH_LONG).show();
    }
    public void btn3_OnClick(View view) {
        Toast.makeText(this, "Toast 基本用法", Toast.LENGTH_LONG).show();
    }
    public void btn4_OnClick(View view) {
        Toast.makeText(this, "Toast 基本用法", Toast.LENGTH_LONG).show();
    }
    public void btn5_OnClick(View view) {
        Toast.makeText(this, "Toast 基本用法", Toast.LENGTH_LONG).show();
    }
    public void btn6_OnClick(View view) {
        Toast.makeText(this, "Toast 基本用法", Toast.LENGTH_LONG).show();
    }
    public void btn7_OnClick(View view) {
        Toast.makeText(this, "Toast 基本用法", Toast.LENGTH_LONG).show();
    }
    public void btn8_OnClick(View view) {
        Toast.makeText(this, "Toast 基本用法", Toast.LENGTH_LONG).show();
    }
    public void btn9_OnClick(View view) {
        Toast.makeText(this, "Toast 基本用法", Toast.LENGTH_LONG).show();
    }
    public void btn0_OnClick(View view) {
        Toast.makeText(this, "Toast 基本用法", Toast.LENGTH_LONG).show();
    }
    public void btnDP_OnClick(View view) {
        Toast.makeText(this, "Toast 基本用法", Toast.LENGTH_LONG).show();
    }public void btnNeg_OnClick(View view) {
        Toast.makeText(this, "Toast 基本用法", Toast.LENGTH_LONG).show();
    }



}
