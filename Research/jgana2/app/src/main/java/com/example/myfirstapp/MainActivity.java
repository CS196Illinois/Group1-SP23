package com.example.myfirstapp;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myfirstapp.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int water = 12;
    int exercise = 30;
    int calories = 500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t1 = findViewById(R.id.counterTxt);
        Button p1 = findViewById(R.id.plus);
        Button m1 = findViewById(R.id.minus);


        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                water++;
                t1.setText(Integer.toString(water) + " cups");
            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                water--;
                t1.setText(Integer.toString(water) + " cups");
            }
        });

        TextView t2 = findViewById(R.id.counterTxtExercise);
        Button p2 = findViewById(R.id.plusEx);
        Button m2 = findViewById(R.id.minusEx);


        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exercise+= 5;
                t2.setText(Integer.toString(exercise) + " minutes");
            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exercise-= 5;
                t2.setText(Integer.toString(exercise) + " minutes");
            }
        });

        TextView t3 = findViewById(R.id.counterTxtCalories);
        Button p3 = findViewById(R.id.plus3);
        Button m3 = findViewById(R.id.minus3);


        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calories+= 25;
                t3.setText(Integer.toString(calories) + " burned");
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calories-= 25;
                t3.setText(Integer.toString(calories) + " burned");
            }
        });
    }
}