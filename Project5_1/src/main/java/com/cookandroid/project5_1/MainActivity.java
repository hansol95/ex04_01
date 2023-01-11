package com.cookandroid.project5_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //0.레이아웃 java 객체의 param(너비, 높이)
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        //1.레이아웃 java 객체 만들기
        LinearLayout baseLayout = new LinearLayout(this);

        //2.레이아웃 java 객체의 속성 설정(orientation, backgroundcolor)
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.rgb(0,255,0));

        //3.view java 객체 만들기(예, button, textview, editText)
        Button btn = new Button(this);

        //4. view 객체의 속성 설정(text, 배경색)
        btn.setText("버튼입니다.");
        btn.setBackgroundColor(Color.MAGENTA);

        //5.view 객체를 레이아웃 객체에 add한다.
        baseLayout.addView(btn);

        //5-1. 이벤트 처리
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),"코드로 생성한 버튼입니다.", Toast.LENGTH_SHORT).show();

            }
        });

        //6.레이아웃과 param을 setContentView한다.
        setContentView(baseLayout,params);





    }
}