package com.ricardogwill.bigdecimalcalculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //  Note that the first commit on GitHub was on Tuesday, 10/16/2018 (before 11:00pm), not on 10/17/2018.

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
