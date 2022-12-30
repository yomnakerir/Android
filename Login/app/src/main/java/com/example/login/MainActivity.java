package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button login;
    EditText name;
    EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.loginBtn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             name = findViewById(R.id.nameField);
             pass = findViewById(R.id.passField);

             Intent intent = new Intent(MainActivity.this, SecondActivity.class);
             Bundle bundle = new Bundle();
                bundle.putString("name", name.getText().toString());
                bundle.putString("pass", pass.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}