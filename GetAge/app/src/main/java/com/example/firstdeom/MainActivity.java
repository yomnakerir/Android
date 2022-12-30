package com.example.firstdeom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button getAgeBtn;
    EditText textAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void getAge (View view){
            textAge = findViewById(R.id.ageText);
            int yearOfBirth = Integer.parseInt(textAge.getText().toString());
            int age = 2022 - yearOfBirth;
            Toast.makeText(MainActivity.this, "age is: " + String.valueOf(age), Toast.LENGTH_SHORT).show();

        }
    }
