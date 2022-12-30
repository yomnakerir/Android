package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView name, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        name = findViewById(R.id.nameReceive);
        password = findViewById(R.id.passReceive);
        Bundle bundle = getIntent().getExtras();
        String readName = bundle.getString("name");
        String readPassword = bundle.getString("pass");
        name.setText(readName);
        password.setText(readPassword);

    }
}