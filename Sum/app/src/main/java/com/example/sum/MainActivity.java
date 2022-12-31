package com.example.sum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   EditText num1, num2;
   TextView result;
   Button sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.fnumFiled);
        num2 = findViewById(R.id.snumFiled);
        result = findViewById(R.id.resultFiled);
        sum = findViewById(R.id.sumBtn);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int fnum = Integer.parseInt(num1.getText().toString());
                int snum = Integer.parseInt(num2.getText().toString());
                result.setText(String.valueOf(fnum+snum));
            }
        });
    }
}