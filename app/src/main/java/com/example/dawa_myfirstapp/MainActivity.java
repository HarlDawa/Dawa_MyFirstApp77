package com.example.dawa_myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView name;
    TextView myName;
    TextView myDisplay;
    Button myButton;
    Button myClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (TextView) findViewById(R.id.txtName);
        myName = (TextView) findViewById(R.id.txtMyName);
        myDisplay = (TextView) findViewById(R.id.txtDisplay);
        myButton = (Button) findViewById(R.id.btnClick);
        myClear = (Button) findViewById(R.id.btnClear);

        //myDisplay.setText("Hello Harl!");

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDisplay.setText("Hello Harl!");
            }
        });

        myClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             myDisplay.setText("Hello!");
            }
        });
    }}
