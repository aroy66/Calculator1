package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button number0, number1, number2, number3, number4, number5, number6,
            number7, number8, number9,  division,
            multiply, add, minus, equal,dot,clear;
    EditText crucifyEditText;
    float mValueOne, mValueTwo;
    boolean crucifyAddition, mSubtract, crucifyMultiplication, crucifyDivision;



    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number0 = (Button) findViewById(R.id.number0);
        number1 = (Button) findViewById(R.id.number1);
        number2 = (Button) findViewById(R.id.number2);
        number3 = (Button) findViewById(R.id.number3);
        number4 = (Button) findViewById(R.id.number4);
        number5 = (Button) findViewById(R.id.number5);
        number6 = (Button) findViewById(R.id.number6);
        number7 = (Button) findViewById(R.id.number7);
        number8 = (Button) findViewById(R.id.number8);
        number9 = (Button) findViewById(R.id.number9);
        dot = (Button) findViewById(R.id.dot);
        add = (Button) findViewById(R.id.add);
        minus = (Button) findViewById(R.id.minus);
        multiply = (Button) findViewById(R.id.multiply);
        division = (Button) findViewById(R.id.division);
        clear = (Button) findViewById(R.id.clear);
        equal = (Button) findViewById(R.id.equal);

        crucifyEditText = (EditText) findViewById(R.id.edt1);

        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crucifyEditText.setText(crucifyEditText.getText() + "1");
            }
        });

        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crucifyEditText.setText(crucifyEditText.getText() + "2");
            }
        });

        number3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crucifyEditText.setText(crucifyEditText.getText() + "3");
            }
        });

        number4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crucifyEditText.setText(crucifyEditText.getText() + "4");
            }
        });

        number5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crucifyEditText.setText(crucifyEditText.getText() + "5");
            }
        });

        number6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crucifyEditText.setText(crucifyEditText.getText() + "6");
            }
        });

        number7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crucifyEditText.setText(crucifyEditText.getText() + "7");
            }
        });

        number8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crucifyEditText.setText(crucifyEditText.getText() + "8");
            }
        });

        number9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crucifyEditText.setText(crucifyEditText.getText() + "9");
            }
        });

        number0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crucifyEditText.setText(crucifyEditText.getText() + "0");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (crucifyEditText == null) {
                    crucifyEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(crucifyEditText.getText() + "");
                    crucifyAddition = true;
                    crucifyEditText.setText(null);
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crucifyEditText.getText() + "");
                mSubtract = true;
                crucifyEditText.setText(null);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crucifyEditText.getText() + "");
                crucifyMultiplication = true;
                crucifyEditText.setText(null);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crucifyEditText.getText() + "");
                crucifyDivision = true;
                crucifyEditText.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(crucifyEditText.getText() + "");

                if (crucifyAddition == true) {
                    crucifyEditText.setText(mValueOne + mValueTwo + "");
                    crucifyAddition = false;
                }

                if (mSubtract == true) {
                    crucifyEditText.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (crucifyMultiplication == true) {
                    crucifyEditText.setText(mValueOne * mValueTwo + "");
                    crucifyMultiplication = false;
                }

                if (crucifyDivision == true) {
                    crucifyEditText.setText(mValueOne / mValueTwo + "");
                    crucifyDivision = false;
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crucifyEditText.setText("");
            }
        });





        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crucifyEditText.setText(crucifyEditText.getText() + ".");
            }
        });
    }
}
