package com.talhadroidlab.homework232;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SquareNumber extends AppCompatActivity {

    EditText edInput;
    Button submitButton;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square_number);

        edInput = findViewById(R.id.edInput);
        submitButton = findViewById(R.id.submitButton);
        tvDisplay = findViewById(R.id.tvDisplay);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                squareNaturalNumber();
            }
        });

    }

    public void squareNaturalNumber(){
        String fEdInput = edInput.getText().toString();

        if (fEdInput.isEmpty()){
            edInput.setError("Enter Number");
            return;
        }
        int takeEdInput = Integer.parseInt(fEdInput);
        int mult = 1;
        int sum = 0;
        StringBuilder result = new StringBuilder("The square natural  terms are: \n");
        StringBuilder result2 = new StringBuilder("The Sum of Square Natural Number terms: \n");
        for (int number = 1; number<=takeEdInput; number++){
            mult = number*number;
            sum =sum+mult;
            result.append(" "+mult);

        }
        result.append("\n");
        result2.append(" "+sum);
        tvDisplay.setText(result.toString() + result2.toString());

    }


}