package com.example.simpleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = findViewById(R.id.AddBtn);
        Button subtractBtn = findViewById(R.id.SubtractBtn);
        Button multiplyBtn = findViewById(R.id.MultiplyBtn);


        // Creates an on click event for the addBtn
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = findViewById(R.id.FirstNumEditText);
                EditText secondNumEditText = findViewById(R.id.SecondNumEditText);
                TextView resultTextView = findViewById(R.id.ResultTextView);

                // Get value from Edit Text
                BigDecimal num1 = new BigDecimal(firstNumEditText.getText().toString());
                BigDecimal num2 = new BigDecimal(secondNumEditText.getText().toString());

                BigDecimal result = num1.add(num2);

                resultTextView.setText(String.valueOf(result));
            }
        });

        // Create an onclick event for the subtractBtn
        subtractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = findViewById(R.id.FirstNumEditText);
                EditText secondNumEditText = findViewById(R.id.SecondNumEditText);
                TextView resultTextView = findViewById(R.id.ResultTextView);

                BigDecimal num1 = new BigDecimal(firstNumEditText.getText().toString());
                BigDecimal num2 = new BigDecimal(secondNumEditText.getText().toString());

                BigDecimal result = num1.subtract(num2);

                resultTextView.setText(String.valueOf(result));
            }
        });


        // Create an onclick event for multiplication
        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = findViewById(R.id.FirstNumEditText);
                EditText secondNumEditText = findViewById(R.id.SecondNumEditText);
                TextView resultTextView = findViewById(R.id.ResultTextView);

                // Get value from Edit Text
                BigDecimal num1 = new BigDecimal(firstNumEditText.getText().toString());
                BigDecimal num2 = new BigDecimal(secondNumEditText.getText().toString());

                BigDecimal result = num1.multiply(num2);

                resultTextView.setText(String.valueOf(result));
            }
        });

    }
}
