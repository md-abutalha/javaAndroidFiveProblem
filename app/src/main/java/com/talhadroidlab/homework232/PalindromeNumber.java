package com.talhadroidlab.homework232;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PalindromeNumber extends AppCompatActivity {
   EditText edInput;
   Button submitButton;
   TextView tvDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome_number);
        edInput = findViewById(R.id.edInput);
        submitButton = findViewById(R.id.submitButton);
        tvDisplay = findViewById(R.id.tvDisplay);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pilandromeNumber();
            }
        });


    }

    public void pilandromeNumber(){
        String fEdInput = edInput.getText().toString();
        if (fEdInput.isEmpty()){
            edInput.setError("Enter Input");
            return;
        }
        int takeEdInput = Integer.parseInt(fEdInput);

        String str = String.valueOf(takeEdInput);
        StringBuilder result = new StringBuilder();
        for (int i= str.length()-1; i>=0; i--){
            result.append(str.charAt(i));
        }
//        tvDisplay.setText(result.toString());

        String reverseStr = result.toString();

        if (str.equals(reverseStr)){
            tvDisplay.setText(reverseStr+" is palindrome");
        }else {
            tvDisplay.setText(takeEdInput+" Not Pilandrome Number");
        }


    }

}