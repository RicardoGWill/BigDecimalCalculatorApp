package com.ricardogwill.bigdecimalcalculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;

public class UnusedActivity extends AppCompatActivity {

    TextView ioTextView;
    Button submitButton, buttonDecimal, button0, buttonClear, button1, button2, button3, button4,
            button5, button6, button7, button8, button9, openParenthesisButton, closeParenthesisButton,
            addButton, subtractButton, multiplyButton, divideButton;
    String ioTextViewString = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unused);

        viewSetup();
        onClickListenerSetup();
    }

    public void viewSetup() {
        ioTextView = findViewById(R.id.io_textView);
        submitButton = findViewById(R.id.submit_button);
        buttonDecimal = findViewById(R.id.decimal_button);
        button0 = findViewById(R.id.zero_button);
        buttonClear = findViewById(R.id.clear_button);
        button1 = findViewById(R.id.one_button);
        button2 = findViewById(R.id.two_button);
        button3 = findViewById(R.id.three_button);
        button4 = findViewById(R.id.four_button);
        button5 = findViewById(R.id.five_button);
        button6 = findViewById(R.id.six_button);
        button7 = findViewById(R.id.seven_button);
        button8 = findViewById(R.id.eight_button);
        button9 = findViewById(R.id.nine_button);
        openParenthesisButton = findViewById(R.id.open_parenthesis_button);
        closeParenthesisButton = findViewById(R.id.close_parenthesis_button);
        addButton = findViewById(R.id.add_button);
        subtractButton = findViewById(R.id.subtract_button);
        multiplyButton = findViewById(R.id.multiply_button);
        divideButton = findViewById(R.id.divide_button);
    }

    public void onClickListenerSetup() {

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioTextViewString = ioTextView.getText().toString();




                BigDecimal bigDecimal = new BigDecimal(ioTextViewString);
                ioTextView.setText(bigDecimal.toString());


            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioTextViewString = ioTextView.getText().toString();
                ioTextViewString = ioTextViewString + "0";
                ioTextView.setText(ioTextViewString);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioTextViewString = ioTextView.getText().toString();
                ioTextViewString = ioTextViewString + "1";
                ioTextView.setText(ioTextViewString);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioTextViewString = ioTextView.getText().toString();
                ioTextViewString = ioTextViewString + "2";
                ioTextView.setText(ioTextViewString);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioTextViewString = ioTextView.getText().toString();
                ioTextViewString = ioTextViewString + "3";
                ioTextView.setText(ioTextViewString);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioTextViewString = ioTextView.getText().toString();
                ioTextViewString = ioTextViewString + "4";
                ioTextView.setText(ioTextViewString);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioTextViewString = ioTextView.getText().toString();
                ioTextViewString = ioTextViewString + "5";
                ioTextView.setText(ioTextViewString);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioTextViewString = ioTextView.getText().toString();
                ioTextViewString = ioTextViewString + "6";
                ioTextView.setText(ioTextViewString);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioTextViewString = ioTextView.getText().toString();
                ioTextViewString = ioTextViewString + "7";
                ioTextView.setText(ioTextViewString);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioTextViewString = ioTextView.getText().toString();
                ioTextViewString = ioTextViewString + "8";
                ioTextView.setText(ioTextViewString);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioTextViewString = ioTextView.getText().toString();
                ioTextViewString = ioTextViewString + "9";
                ioTextView.setText(ioTextViewString);
            }
        });

        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioTextViewString = ioTextView.getText().toString();
                ioTextViewString = ioTextViewString + ".";
                ioTextView.setText(ioTextViewString);
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioTextView.setText("");
            }
        });

        openParenthesisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioTextViewString = ioTextView.getText().toString();
                ioTextViewString = ioTextViewString + "(";
                ioTextView.setText(ioTextViewString);
            }
        });

        closeParenthesisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioTextViewString = ioTextView.getText().toString();
                ioTextViewString = ioTextViewString + ")";
                ioTextView.setText(ioTextViewString);
            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioTextViewString = ioTextView.getText().toString();
                ioTextViewString = ioTextViewString + "+";
                ioTextView.setText(ioTextViewString);
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioTextViewString = ioTextView.getText().toString();
                ioTextViewString = ioTextViewString + "-";
                ioTextView.setText(ioTextViewString);
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioTextViewString = ioTextView.getText().toString();
                ioTextViewString = ioTextViewString + "*";
                ioTextView.setText(ioTextViewString);
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioTextViewString = ioTextView.getText().toString();
                ioTextViewString = ioTextViewString + "/";
                ioTextView.setText(ioTextViewString);
            }
        });

    }

}
