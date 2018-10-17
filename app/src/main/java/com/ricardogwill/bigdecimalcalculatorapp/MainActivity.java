package com.ricardogwill.bigdecimalcalculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //  Interestingly, GitHub changed the commit time of this to 10/16/2018 from the wrong date of 10/17/2018.

    TextView inputTextView, outputTextView;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputTextView = findViewById(R.id.input_textView);
        outputTextView = findViewById(R.id.output_textView);
        submitButton = findViewById(R.id.submit_button);

    }
}
