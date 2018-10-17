package com.ricardogwill.bigdecimalcalculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewSetup();
        onClickListenerSetup();
    }

    EditText firstNumberEditText, secondNumberEditText;
    TextView resultTextView;
    Button addButton, subtractButton, multiplyButton, divideButton, clearButton;
    BigDecimal bigDecimalOne, bigDecimalTwo, bigDecimalResult;

    public void viewSetup() {
        firstNumberEditText = findViewById(R.id.first_number_editText);
        secondNumberEditText = findViewById(R.id.second_number_editText);
        resultTextView = findViewById(R.id.result_textView);
        addButton = findViewById(R.id.add_button);
        subtractButton = findViewById(R.id.subtract_button);
        multiplyButton = findViewById(R.id.multiply_button);
        divideButton = findViewById(R.id.divide_button);
        clearButton = findViewById(R.id.clear_button);
    }

    public void onClickListenerSetup() {
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bigDecimalOne = new BigDecimal(firstNumberEditText.getText().toString());
                bigDecimalTwo = new BigDecimal(secondNumberEditText.getText().toString());
                bigDecimalResult = bigDecimalOne.add(bigDecimalTwo);
                resultTextView.setText(bigDecimalResult.toString());
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bigDecimalOne = new BigDecimal(firstNumberEditText.getText().toString());
                bigDecimalTwo = new BigDecimal(secondNumberEditText.getText().toString());
                bigDecimalResult = bigDecimalOne.subtract(bigDecimalTwo);
                resultTextView.setText(bigDecimalResult.toString());
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bigDecimalOne = new BigDecimal(firstNumberEditText.getText().toString());
                bigDecimalTwo = new BigDecimal(secondNumberEditText.getText().toString());
                bigDecimalResult = bigDecimalOne.multiply(bigDecimalTwo);
                resultTextView.setText(bigDecimalResult.toString());
            }
        });

        // I need "scale" and "RoundingMode" particularly with division to get decimals to work.
        // Note that there are two decimal places in the result, no matter if the value is a whole number or not.
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bigDecimalOne = new BigDecimal(firstNumberEditText.getText().toString());
                bigDecimalTwo = new BigDecimal(secondNumberEditText.getText().toString());
                if (bigDecimalTwo.toString() != "0") {
                    bigDecimalResult = bigDecimalOne.divide(bigDecimalTwo, 2, RoundingMode.HALF_UP);
                    resultTextView.setText(bigDecimalResult.toString());
                } else {
                    resultTextView.setText("∞");
                }

            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumberEditText.setText("");
                secondNumberEditText.setText("");
                resultTextView.setText("");
            }
        });

    }



}
