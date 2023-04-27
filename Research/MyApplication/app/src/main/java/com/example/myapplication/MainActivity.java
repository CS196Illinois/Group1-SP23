package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count1 = 12;
    int count2 = 30;
    int count3 = 500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text1 = findViewById(R.id.counterTxt1);
        Button plus1 = findViewById(R.id.plus1);
        Button minus1 = findViewById(R.id.minus1);
        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1++;
                text1.setText(Integer.toString(count1) + " cups");
            }
        });
        minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1--;
                text1.setText(Integer.toString(count1) + " cups");
            }
        });
        TextView text2 = findViewById(R.id.counterTxt2);
        Button plus2 = findViewById(R.id.plus2);
        Button minus2 = findViewById(R.id.minus2);
        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count2 = count2 + 5;
                text2.setText(Integer.toString(count2) + " minutes");
            }
        });
        minus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count2 = count2 - 5;
                text2.setText(Integer.toString(count2) + " minutes");
            }
        });
        TextView text3 = findViewById(R.id.counterTxt3);
        Button plus3 = findViewById(R.id.plus3);
        Button minus3 = findViewById(R.id.minus3);
        plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count3 = count3 + 25;
                text3.setText(Integer.toString(count3) + " calories");
            }
        });
        minus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count3 = count3 - 25;
                text3.setText(Integer.toString(count3) + " calories");
            }
        });
    }
}