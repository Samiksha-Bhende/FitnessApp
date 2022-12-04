package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.material.textfield.TextInputEditText;

public class ThirdPage extends AppCompatActivity {

    private TextInputEditText heightET;
    private TextInputEditText weightET;
    private Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_calculator);

        calculateButton = findViewById(R.id.calculateButton);
        heightET = findViewById(R.id.heightInput);
        weightET = findViewById(R.id.weightInput);
    }

    public void viewCalculate(View view){
        String ageStr = getIntent().getStringExtra("age");
        String genderStr = getIntent().getStringExtra("gender");
        String heightStr = heightET.
    }


}