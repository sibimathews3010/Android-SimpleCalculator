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

        // Creates an on click event for the addBtn
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = findViewById(R.id.FirstNumEditText);
                EditText secondNumEditText = findViewById(R.id.SecondNumEditText);
                TextView resultTextView = findViewById(R.id.ResultTextView);

                // Get value from Edit Text
                double num1 = Double.parseDouble(firstNumEditText.getText().toString());
                double num2 = Double.parseDouble(secondNumEditText.getText().toString());

                double result = num1 + num2;

                resultTextView.setText(String.valueOf(result));
            }
        });
    }
}
