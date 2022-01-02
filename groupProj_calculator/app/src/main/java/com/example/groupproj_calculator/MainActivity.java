package com.example.groupproj_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import org.mariuszgromada.math.mxparser.*;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    StringBuilder mathsQuest = new StringBuilder(64);
    StringBuilder mathsAns = new StringBuilder(64);
    boolean nextQuestion = false;
    private EditText edInput,edOutput;
    private Button btnNo1,btnNo2,btnNo3,btnNo4,btnNo5,btnNo6,btnNo7;
    private Button btnNo8,btnNo9,btnNo0,btnDP,btnNeg,btnExe,btnPlus;
    private Button btnMinus,btnMultiply,btnDivide,btnBP,btnCA;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        edInput =  (EditText) findViewById(R.id.ed_input);
        edOutput =  (EditText)findViewById(R.id.ed_output);
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
        Button btnOpB = findViewById(R.id.btn_openBracket);
        Button btnClB = findViewById(R.id.btn_closeBracket);
        setContentView(R.layout.activity_main);

    }

    public void btn1_OnClick(View view) {
        if(nextQuestion) cleanPrevInput();
        nextQuestion=false;
        mathsQuest.append("1");
        edInput =  (EditText) findViewById(R.id.ed_input);
        edInput.setText(mathsQuest,TextView.BufferType.EDITABLE);
    }
    public void btn2_OnClick(View view) {
        if(nextQuestion) cleanPrevInput();
        nextQuestion=false;
        mathsQuest.append("2");
        edInput =  (EditText) findViewById(R.id.ed_input);
        edInput.setText(mathsQuest,TextView.BufferType.EDITABLE);
    }
    public void btn3_OnClick(View view) {
        if(nextQuestion) cleanPrevInput();
        nextQuestion=false;
        mathsQuest.append("3");
        edInput =  (EditText) findViewById(R.id.ed_input);
        edInput.setText(mathsQuest,TextView.BufferType.EDITABLE);
    }
    public void btn4_OnClick(View view) {
        if(nextQuestion) cleanPrevInput();
        nextQuestion=false;
        mathsQuest.append("4");
        edInput =  (EditText) findViewById(R.id.ed_input);
        edInput.setText(mathsQuest,TextView.BufferType.EDITABLE);
    }

    public void btn5_OnClick(View view) {
        if(nextQuestion) cleanPrevInput();
        nextQuestion=false;
        mathsQuest.append("5");
        edInput =  (EditText) findViewById(R.id.ed_input);
        edInput.setText(mathsQuest,TextView.BufferType.EDITABLE);
    }
    public void btn6_OnClick(View view) {
        if(nextQuestion) cleanPrevInput();
        nextQuestion=false;
        mathsQuest.append("6");
        edInput =  (EditText) findViewById(R.id.ed_input);
        edInput.setText(mathsQuest,TextView.BufferType.EDITABLE);
    }
    public void btn7_OnClick(View view) {
        if(nextQuestion) cleanPrevInput();
        nextQuestion=false;
        mathsQuest.append("7");
        edInput =  (EditText) findViewById(R.id.ed_input);
        edInput.setText(mathsQuest,TextView.BufferType.EDITABLE);
    }
    public void btn8_OnClick(View view) {
        if(nextQuestion) cleanPrevInput();
        nextQuestion=false;
        mathsQuest.append("8");
        edInput =  (EditText) findViewById(R.id.ed_input);
        edInput.setText(mathsQuest,TextView.BufferType.EDITABLE);
    }
    public void btn9_OnClick(View view) {
        if(nextQuestion) cleanPrevInput();
        nextQuestion=false;
        mathsQuest.append("9");
        edInput =  (EditText) findViewById(R.id.ed_input);
        edInput.setText(mathsQuest,TextView.BufferType.EDITABLE);
    }
    public void btn0_OnClick(View view) {
        if(nextQuestion) cleanPrevInput();
        nextQuestion=false;
        mathsQuest.append("0");
        edInput =  (EditText) findViewById(R.id.ed_input);
        edInput.setText(mathsQuest,TextView.BufferType.EDITABLE);
    }
    public void btnDP_OnClick(View view) {
        if(nextQuestion) cleanPrevInput();
        nextQuestion=false;
        mathsQuest.append(".");
        edInput =  (EditText) findViewById(R.id.ed_input);
        edInput.setText(mathsQuest,TextView.BufferType.EDITABLE);
    }
    public void btnNeg_OnClick(View view) {
        mathsQuest.append("-");
        edInput =  (EditText) findViewById(R.id.ed_input);
        edInput.setText(mathsQuest,TextView.BufferType.EDITABLE);
    }
    public void btnOpenBracket_OnClick(View view) {
        mathsQuest.append("(");
        edInput =  (EditText) findViewById(R.id.ed_input);
        edInput.setText(mathsQuest,TextView.BufferType.EDITABLE);
    }
    public void btnCloseBracket_OnClick(View view) {
        mathsQuest.append(")");
        edInput =  (EditText) findViewById(R.id.ed_input);
        edInput.setText(mathsQuest,TextView.BufferType.EDITABLE);
    }

    public void btnPlus_OnClick(View view) {
        mathsQuest.append("+");
        edInput =  (EditText) findViewById(R.id.ed_input);
        edInput.setText(mathsQuest,TextView.BufferType.EDITABLE);
    }
    public void btnMinus_OnClick(View view) {
        mathsQuest.append("-");
        edInput =  (EditText) findViewById(R.id.ed_input);
        edInput.setText(mathsQuest,TextView.BufferType.EDITABLE);
    }
    public void btnMultiply_OnClick(View view) {
        mathsQuest.append("*");
        edInput =  (EditText) findViewById(R.id.ed_input);
        edInput.setText(mathsQuest,TextView.BufferType.EDITABLE);
    }
    public void btnDivide_OnClick(View view) {
        mathsQuest.append("/");
        edInput =  (EditText) findViewById(R.id.ed_input);
        edInput.setText(mathsQuest,TextView.BufferType.EDITABLE);
    }
    public void btnBP_OnClick(View view) {
        try {
            int count;
            count = mathsQuest.length();
            mathsQuest.deleteCharAt(count - 1);
            edInput = (EditText) findViewById(R.id.ed_input);
            edInput.setText(mathsQuest, TextView.BufferType.EDITABLE);
        } catch (StringIndexOutOfBoundsException e){
            Toast.makeText(this, "可以輸入新算式了", Toast.LENGTH_SHORT).show();
        }
    }
    public void btnCA_OnClick(View view) {
        cleanPrevInput();
        cleanPrevOutput();
        Toast.makeText(this, "全部清除", Toast.LENGTH_SHORT).show();
    }
    public void btnEnter_OnClick(View view) {
        double ans;
        Expression exp = new Expression(String.valueOf(mathsQuest));
        ans = exp.calculate();

        mathsAns.delete(0,mathsAns.length());
        mathsAns.append(ans);
        edOutput =  (EditText) findViewById(R.id.ed_output);
        edOutput.setText(mathsAns,TextView.BufferType.EDITABLE);
        nextQuestion = true;
        Toast.makeText(this, "計算已完成", Toast.LENGTH_SHORT).show();
    }
    public void cleanPrevInput(){
        int count;
        count = mathsQuest.length();
        mathsQuest.delete(0,count);
        edInput =  (EditText) findViewById(R.id.ed_input);
        edInput.setText(mathsQuest,TextView.BufferType.EDITABLE);
    }

    public void cleanPrevOutput(){
        int count;
        count = mathsAns.length();
        mathsAns.delete(0,count);
        edOutput =  (EditText) findViewById(R.id.ed_output);
        edOutput.setText(mathsAns,TextView.BufferType.EDITABLE);
    }



}
