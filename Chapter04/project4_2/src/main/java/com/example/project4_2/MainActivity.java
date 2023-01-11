package com.example.project4_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("애완 동물 사진 보기");

        TextView text1 = findViewById(R.id.tv1);
        TextView text2 = findViewById(R.id.tv2);
        CheckBox chkAgree =  findViewById(R.id.checkbox);
        RadioGroup rGroup1 = findViewById(R.id.rg1);
        RadioButton rdoDog = findViewById(R.id.rbDog);
        RadioButton rdoCat =  findViewById(R.id.rbCat);
        RadioButton rdoRabbit = findViewById(R.id.rbRabbit);

        Button btnOk = findViewById(R.id.btn1);
        ImageView imgPet = findViewById(R.id.imgPet);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chkAgree.isChecked()) //체크가 된 상태로 끝
                {
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btnOk.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                }
                else{
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    btnOk.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }
        });



        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(rGroup1.getCheckedRadioButtonId())
                {
                    case R.id.rbDog:
                        imgPet.setImageResource(R.drawable.dog2);
                        break;
                    case R.id.rbCat:
                        imgPet.setImageResource(R.drawable.cat);
                        break;
                    case R.id.rbRabbit:
                        imgPet.setImageResource(R.drawable.rabbit);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"동물 선택해주세요",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}