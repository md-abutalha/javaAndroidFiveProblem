package com.talhadroidlab.homework232;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MultiplicationTable extends AppCompatActivity {
    EditText edInput;
    Button submitButton;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication_table);

        edInput = findViewById(R.id.edInput);
        submitButton = findViewById(R.id.submitButton);
        tvDisplay = findViewById(R.id.tvDisplay);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateCalculation();
            }
        });

    }

    public void generateCalculation() {
        if (edInput.getText().toString().isEmpty()) {
            edInput.setError("Enter number");
            return;
        }

        int takeEdInput = Integer.parseInt(edInput.getText().toString());
        StringBuilder result = new StringBuilder("Input the number (Table to be calculated) : \n");
        for (int number = 1; number <= takeEdInput; number++) {
            result.append("").append(takeEdInput).append(" x ").append(number).append(" = ").append(takeEdInput * number).append("\n");
        }
        tvDisplay.setText(result.toString());
    }
}
