package com.talhadroidlab.homework232;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EvenNumber extends AppCompatActivity {

    EditText edInput;
    Button submitButton;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_even_number);

        edInput = findViewById(R.id.edInput);
        submitButton = findViewById(R.id.submitButton);
        tvDisplay = findViewById(R.id.tvDisplay);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                evenNumberList();
            }
        });

    }


    public void evenNumberList() {
        String input = edInput.getText().toString();

        if (input.isEmpty()) {
            edInput.setError("Enter input");
            return;
        }
        int finalEdInput = Integer.parseInt(input);
        StringBuilder result = new StringBuilder("The even numbers are : \n");
        StringBuilder resultSum = new StringBuilder(" The Sum of even Natural Number up to given terms : \n");
        int sum = 0;
        for (int number = 1; number <= finalEdInput; number++) {
            if (number % 2 == 0) {
                result.append(number).append(",");
                sum += number;
            }
        }
        resultSum.append(sum);
        tvDisplay.setText(result.toString() + resultSum.toString());

    }



}
