package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.material.textfield.TextInputEditText;

public class SecondPage extends AppCompatActivity {

    private RadioGroup genderRG;
    private RadioButton selectedGenderButton;
    private Button nextButton;
    private TextInputEditText ageET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_login);

        genderRG = findViewById(R.id.genderGroup);
        ageET = findViewById(R.id.ageET);

        genderRG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selectedGenderButton = findViewById( checkedId);
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ThirdPage.class);
                intent.putExtra( "gender", selectedGenderButton.getText().toString());
                intent.putExtra( "age", ageET.getText().toString());
                startActivity(intent);
            }
        });
    }


}