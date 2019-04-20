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

    // Clears
    private Button btnClearAll;
    private Button btnClearLast;

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
                String curStr = resultDisplay.getText().toString();
                double curNum = Double.parseDouble(curStr);
                operationDisplay.setText(decimalFormat.format((curNum)));
                if(!isDecimal) {
                    resultDisplay.setText(resultDisplay.getText() + ".");
                    isDecimal = true;
                }
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String curStr = resultDisplay.getText().toString();
                double curNum = Double.parseDouble(curStr);
                operationDisplay.setText(decimalFormat.format((curNum)));
                if (curNum == 0) {
                    if(isDecimal)
                        resultDisplay.setText(curStr + "0");
                    else
                        resultDisplay.setText("0");
                } else
                    resultDisplay.setText(curStr + "0");
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String curStr = resultDisplay.getText().toString();
                double curNum = Double.parseDouble(curStr);
                operationDisplay.setText(decimalFormat.format((curNum)));
                if (curNum == 0) {
                    if (isDecimal)
                        resultDisplay.setText(curStr + "1");
                    else
                        resultDisplay.setText("1");
                } else
                    resultDisplay.setText(curStr + "1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String curStr = resultDisplay.getText().toString();
                double curNum = Double.parseDouble(curStr);
                operationDisplay.setText(decimalFormat.format((curNum)));
                if (curNum == 0) {
                    if (isDecimal)
                        resultDisplay.setText(curStr + "2");
                    else
                        resultDisplay.setText("2");
                } else
                    resultDisplay.setText(curStr + "2");

            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String curStr = resultDisplay.getText().toString();
                double curNum = Double.parseDouble((curStr));
                operationDisplay.setText(decimalFormat.format((curNum)));
                if (curNum == 0) {
                    if (isDecimal)
                        resultDisplay.setText(curStr + "3");
                    else
                        resultDisplay.setText("3");
                } else
                    resultDisplay.setText(curStr + "3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String curStr = resultDisplay.getText().toString();
                double curNum = Double.parseDouble(curStr);
                if (curNum == 0) {
                    if (isDecimal)
                        resultDisplay.setText(curStr + "4");
                    else
                        resultDisplay.setText("4");
                } else
                    resultDisplay.setText(curStr + "4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String curStr = resultDisplay.getText().toString();
                double curNum = Double.parseDouble(curStr);
                if (curNum == 0) {
                    if (isDecimal)
                        resultDisplay.setText(curStr + "5");
                    else
                        resultDisplay.setText("5");
                } else
                    resultDisplay.setText(curStr + "5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String curStr = resultDisplay.getText().toString();
                double curNum = Double.parseDouble(curStr);
                if (curNum == 0) {
                    if (isDecimal)
                        resultDisplay.setText(curStr + "6");
                    else
                        resultDisplay.setText("6");
                } else
                    resultDisplay.setText(curStr + "6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String curStr = resultDisplay.getText().toString();
                double curNum = Double.parseDouble(curStr);
                if (curNum == 0) {
                    if (isDecimal)
                        resultDisplay.setText(curStr + "7");
                    else
                        resultDisplay.setText("7");
                } else
                    resultDisplay.setText(curStr + "7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String curStr = resultDisplay.getText().toString();
                double curNum = Double.parseDouble(curStr);
                if (curNum == 0) {
                    if (isDecimal)
                        resultDisplay.setText(curStr + "8");
                    else
                        resultDisplay.setText("8");
                } else
                    resultDisplay.setText(curStr + "8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String curStr = resultDisplay.getText().toString();
                double curNum = Double.parseDouble(curStr);
                if (curNum == 0) {
                    if (isDecimal)
                        resultDisplay.setText(curStr + "9");
                    else
                        resultDisplay.setText("9");
                } else
                    resultDisplay.setText(curStr + "9");
            }
        });

        btnClearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultDisplay.setText("0");
                isDecimal = false;
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

        // Clears
        btnClearAll = findViewById(R.id.btnClearAll);
    }
}
