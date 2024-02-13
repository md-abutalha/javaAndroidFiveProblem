package com.talhadroidlab.homework232;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SomeOftheSeries extends AppCompatActivity {
    EditText edInput;
    Button submitButton;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_some_ofthe_series);

        edInput = findViewById(R.id.edInput);
        submitButton = findViewById(R.id.submitButton);
        tvDisplay = findViewById(R.id.tvDisplay);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateSum();
            }
        });
    }

    public void generateSum(){
        String takeEdInput = edInput.getText().toString();

        if (takeEdInput.isEmpty()) {
            edInput.setError("Enter number");
            return;
        }

        int finalEdInput = Integer.parseInt(takeEdInput);

        long t = 9;
        int sum = 0;
        StringBuilder result = new StringBuilder("Expected Output :\n");
        StringBuilder result1 = new StringBuilder("The sum of the series:");
        for (int number = 1; number <= finalEdInput; number++){
            t = t * 10 + 9;
            sum += t;
            result.append(" ").append(t);
        }
        result1.append(sum);
        tvDisplay.setText(result.toString() + "\n" + result1.toString());
    }
}
