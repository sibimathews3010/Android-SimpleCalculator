package com.example.simpleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    // Numbers
    private Button btnZero;
    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;
    private Button btnFive;
    private Button btnSix;
    private Button btnSeven;
    private Button btnEight;
    private Button btnNine;

    // Operators
    private ImageButton btnAdd;
    private ImageButton btnSub;
    private ImageButton btnMultiply;
    private ImageButton btnDivide;
    private ImageButton btnEqual;
    private Button btnDot;

    // TextViews
    private TextView resultDisplay;
    private TextView operationDisplay;

    private boolean isDecimal = false;

    DecimalFormat decimalFormat = new DecimalFormat("#.##########");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setup View
        setupView();

        // Click Events for each number and display in TextView
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isDecimal) {
                    resultDisplay.setText(resultDisplay.getText() + ".");
                    isDecimal = true;
                }
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double curNum = Double.parseDouble(resultDisplay.getText().toString());
                String curStr = resultDisplay.getText().toString();
                operationDisplay.setText(decimalFormat.format((curNum)));
                if (curNum == 0) {
                    if(isDecimal)
                        resultDisplay.setText(curStr + "0");
                    else
                        resultDisplay.setText("0");
                } else {
                        resultDisplay.setText(curStr + "0");
                }
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double curNum = Double.parseDouble(resultDisplay.getText().toString());
                operationDisplay.setText(decimalFormat.format((curNum)));
                if (curNum == 0)
                    resultDisplay.setText("1");
                else
                    resultDisplay.setText(decimalFormat.format(curNum) + "1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double curNum = Double.parseDouble(resultDisplay.getText().toString());
                operationDisplay.setText(decimalFormat.format((curNum)));
                if (curNum == 0)
                    resultDisplay.setText("2");
                else
                    resultDisplay.setText(decimalFormat.format(curNum) + "2");

            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double curNum = Double.parseDouble(resultDisplay.getText().toString());
                operationDisplay.setText(decimalFormat.format((curNum)));
                if (curNum == 0)
                    resultDisplay.setText("3");
                else
                    resultDisplay.setText(decimalFormat.format(curNum) + "3");

            }
        });
    }

    private void setupView() {
        // Numbers
        btnZero = findViewById(R.id.btn0);
        btnOne = findViewById(R.id.btn1);
        btnTwo = findViewById(R.id.btn2);
        btnThree = findViewById(R.id.btn3);
        btnFour = findViewById(R.id.btn4);
        btnFive = findViewById(R.id.btn5);
        btnSix = findViewById(R.id.btn6);
        btnSeven = findViewById(R.id.btn7);
        btnEight = findViewById(R.id.btn8);
        btnNine = findViewById(R.id.btn9);

        // Operators
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnEqual = findViewById(R.id.btnEqual);
        btnDot = findViewById(R.id.btnDot);

        // TextViews
        resultDisplay = findViewById(R.id.text_display);
        operationDisplay = findViewById(R.id.operation_display);
    }
}
