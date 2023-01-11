package com.example.project5_2_tablc_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView textResult;
    String num1, num2;
    Integer result;
    Button[] numButtons = new Button[10];

    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("테이블 레이아웃 계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv = (Button) findViewById(R.id.BtnDiv);

        textResult = (TextView) findViewById(R.id.TextResult);

        //5-1. 숫자 버튼 java 객체 만들기, xml 객체 가져와서 바인딩(findViewById)

        Button btnNum0 = findViewById(R.id.BtnNum0);
        Button btnNum1 = findViewById(R.id.BtnNum1);
        Button btnNum2 = findViewById(R.id.BtnNum2);
        Button btnNum3 = findViewById(R.id.BtnNum3);
        Button btnNum4 = findViewById(R.id.BtnNum4);
        Button btnNum5 = findViewById(R.id.BtnNum5);
        Button btnNum6 = findViewById(R.id.BtnNum6);
        Button btnNum7 = findViewById(R.id.BtnNum7);
        Button btnNum8 = findViewById(R.id.BtnNum8);
        Button btnNum9 = findViewById(R.id.BtnNum9);

        //개별 버튼 10개를 1개의 객체 배열에 넣고, 배열 멤버로 만든다.
        //객체 배열(new button 객체가 10개 들어가 있어야된다)
        //[숫자 적으면 안됌]
        Button btnNumArr[] = new Button[10];
        //btnNumArr[0] = new Button(this);
//        btnNumArr[0] = findViewById(R.id.BtnNum0);
//        btnNumArr[1] = findViewById(R.id.BtnNum1);
//        btnNumArr[2] = findViewById(R.id.BtnNum2);
//        btnNumArr[3] = findViewById(R.id.BtnNum3);
//        btnNumArr[4] = findViewById(R.id.BtnNum4);
//        btnNumArr[5] = findViewById(R.id.BtnNum5);
//        btnNumArr[6] = findViewById(R.id.BtnNum6);
//        btnNumArr[7] = findViewById(R.id.BtnNum7);
//        btnNumArr[8] = findViewById(R.id.BtnNum8);
//        btnNumArr[9] = findViewById(R.id.BtnNum9);


        int nBtnArr[] ={R.id.BtnNum0, R.id.BtnNum1,
                R.id.BtnNum2, R.id.BtnNum3,R.id.BtnNum4, R.id.BtnNum5,
                R.id.BtnNum6, R.id.BtnNum7,R.id.BtnNum8, R.id.BtnNum9};

        for(int i = 0; i< btnNumArr.length; ++i){
            btnNumArr[i] = findViewById(nBtnArr[i]);
        }

        for(int i = 0; i<btnNumArr.length; ++i){
            int finalI = i;
            btnNumArr[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(edit1.isFocused())
                    {
                        String str1 = edit1.getText().toString() + finalI;
                        edit1.setText(str1);
                    }
                    else if(edit2.isFocused()){
                        String str1 = edit2.getText().toString() + finalI;
                        edit1.setText(str1);

                    }
                    else{
                        Toast.makeText(getApplicationContext(),
                                "에디트를 선택해주세요.",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }


        btnAdd.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                String str1 = edit1.getText().toString();
                String str2 = edit2.getText().toString();

                if(str1.equals("") || str2.equals(""))
                {
                    Toast.makeText(MainActivity.this,"값을 입력해주셔요!",Toast.LENGTH_SHORT).show();
                }
                else
                {
//                    int n1 = Integer.parseInt(str1);
//                    int n2 = Integer.parseInt(str2);
//                    int n3 = n1 + n2;

                    double d1 = Double.parseDouble(str1);
                    double d2 = Double.parseDouble(str2);
                    double d3 = d1 + d2;

                    textResult.setText("결과는: "+d3);
                }
                return false;
            }
        });

        btnSub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                String str1 = edit1.getText().toString();
                String str2 = edit2.getText().toString();

                if(str1.equals("") || str2.equals(""))
                {
                    Toast.makeText(MainActivity.this,"값을 입력해주셔요!",Toast.LENGTH_SHORT).show();
                }
                else
                {
//                    int n1 = Integer.parseInt(str1);
//                    int n2 = Integer.parseInt(str2);
//                    int n3 = n1 - n2;


                    double d1 = Double.parseDouble(str1);
                    double d2 = Double.parseDouble(str2);
                    double d3 = d1 - d2;

                    textResult.setText("결과는: "+d3);
                }
                return false;
            }
        });

        btnMul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                String str1 = edit1.getText().toString();
                String str2 = edit2.getText().toString();

                if(str1.equals("") || str2.equals(""))
                {
                    Toast.makeText(MainActivity.this,"값을 입력해주셔요!",Toast.LENGTH_SHORT).show();
                }
                else
                {
//                    int n1 = Integer.parseInt(str1);
//                    int n2 = Integer.parseInt(str2);
//                    int n3 = n1 * n2;

//                    tv1.setText("결과는: " + n3);

                    double d1 = Double.parseDouble(str1);
                    double d2 = Double.parseDouble(str2);
                    double d3 = d1 * d2;

                    textResult.setText("결과는: "+d3);
                }
                return false;
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = edit1.getText().toString();
                String str2 = edit2.getText().toString();

                if(str1.equals("") || str2.equals(""))
                {
                    Toast.makeText(MainActivity.this,"값을 입력해주셔요!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(str2.equals("0"))
                    {
                        Toast.makeText(MainActivity.this,"0으로 나눌순 없어요!",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        //                    int n1 = Integer.parseInt(str1);
//                    int n2 = Integer.parseInt(str2);
//                    int n3 = n1 / n2;
//
//                    tv1.setText("결과는: " + n3);
                        double d1 = Double.parseDouble(str1);
                        double d2 = Double.parseDouble(str2);
                        double d3 = d1 / d2;
                        d3 = (int)(d3*100)/100.0;

                        textResult.setText("결과는: "+d3);
                    }
                }
            }
        });







//
//        //5-2. 이벤트 처리
//        btnNum0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(edit1.isFocused())
//                {
//                    String str1 = edit1.getText().toString() + "0";
//                    edit1.setText(str1);
//                }
//                else if(edit2.isFocused()){
//                    String str1 = edit2.getText().toString() + "0";
//                    edit1.setText(str1);
//
//                }
//                else{
//                    Toast.makeText(getApplicationContext(),
//                            "에디트를 선택해주세요.",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        btnNum1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(edit1.isFocused())
//                {
//                    String str1 = edit1.getText().toString() + "1";
//                    edit1.setText(str1);
//                }
//                else if(edit2.isFocused()){
//                    String str1 = edit2.getText().toString() + "1";
//                    edit1.setText(str1);
//
//                }
//                else{
//                    Toast.makeText(getApplicationContext(),
//                            "에디트를 선택해주세요.",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        btnNum2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(edit1.isFocused())
//                {
//                    String str1 = edit1.getText().toString() + "2";
//                    edit1.setText(str1);
//                }
//                else if(edit2.isFocused()){
//                    String str1 = edit2.getText().toString() + "2";
//                    edit1.setText(str1);
//
//                }
//                else{
//                    Toast.makeText(getApplicationContext(),
//                            "에디트를 선택해주세요.",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        btnNum3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(edit1.isFocused())
//                {
//                    String str1 = edit1.getText().toString() + "3";
//                    edit1.setText(str1);
//                }
//                else if(edit2.isFocused()){
//                    String str1 = edit2.getText().toString() + "3";
//                    edit1.setText(str1);
//
//                }
//                else{
//                    Toast.makeText(getApplicationContext(),
//                            "에디트를 선택해주세요.",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        btnNum4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(edit1.isFocused())
//                {
//                    String str1 = edit1.getText().toString() + "4";
//                    edit1.setText(str1);
//                }
//                else if(edit2.isFocused()){
//                    String str1 = edit2.getText().toString() + "4";
//                    edit1.setText(str1);
//
//                }
//                else{
//                    Toast.makeText(getApplicationContext(),
//                            "에디트를 선택해주세요.",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        btnNum5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(edit1.isFocused())
//                {
//                    String str1 = edit1.getText().toString() + "5";
//                    edit1.setText(str1);
//                }
//                else if(edit2.isFocused()){
//                    String str1 = edit2.getText().toString() + "5";
//                    edit1.setText(str1);
//
//                }
//                else{
//                    Toast.makeText(getApplicationContext(),
//                            "에디트를 선택해주세요.",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        btnNum6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(edit1.isFocused())
//                {
//                    String str1 = edit1.getText().toString() + "6";
//                    edit1.setText(str1);
//                }
//                else if(edit2.isFocused()){
//                    String str1 = edit2.getText().toString() + "6";
//                    edit1.setText(str1);
//
//                }
//                else{
//                    Toast.makeText(getApplicationContext(),
//                            "에디트를 선택해주세요.",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        btnNum7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(edit1.isFocused())
//                {
//                    String str1 = edit1.getText().toString() + "7";
//                    edit1.setText(str1);
//                }
//                else if(edit2.isFocused()){
//                    String str1 = edit2.getText().toString() + "7";
//                    edit1.setText(str1);
//
//                }
//                else{
//                    Toast.makeText(getApplicationContext(),
//                            "에디트를 선택해주세요.",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        btnNum8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(edit1.isFocused())
//                {
//                    String str1 = edit1.getText().toString() + "8";
//                    edit1.setText(str1);
//                }
//                else if(edit2.isFocused()){
//                    String str1 = edit2.getText().toString() + "8";
//                    edit1.setText(str1);
//
//                }
//                else{
//                    Toast.makeText(getApplicationContext(),
//                            "에디트를 선택해주세요.",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        btnNum9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(edit1.isFocused())
//                {
//                    String str1 = edit1.getText().toString() + "9";
//                    edit1.setText(str1);
//                }
//                else if(edit2.isFocused()){
//                    String str1 = edit2.getText().toString() + "9";
//                    edit1.setText(str1);
//
//                }
//                else{
//                    Toast.makeText(getApplicationContext(),
//                            "에디트를 선택해주세요.",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });













    }
}