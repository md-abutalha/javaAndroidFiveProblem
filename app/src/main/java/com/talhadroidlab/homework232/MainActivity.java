package com.talhadroidlab.homework232;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView multiplicationTable,evenNumber;
    Button sumOfSeries,pilandromeButton,squareNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        multiplicationTable = findViewById(R.id.multiplicationTable);
        evenNumber = findViewById(R.id.evenNumber);
        sumOfSeries = findViewById(R.id.sumOfSeries);
        pilandromeButton = findViewById(R.id.pilandromeButton);
        squareNumber = findViewById(R.id.squareNumber);


        multiplicationTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, MultiplicationTable.class);
                startActivity(myIntent);
            }
        });

        evenNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent2 = new Intent(MainActivity.this, EvenNumber.class);
                startActivity(myIntent2);
            }
        });

        sumOfSeries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent3 = new Intent(MainActivity.this, SomeOftheSeries.class);
                startActivity(myIntent3);
            }
        });



        pilandromeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent4 = new Intent(MainActivity.this, PalindromeNumber.class);
                startActivity(myIntent4);
            }
        });


        squareNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent5 = new Intent(MainActivity.this, SquareNumber.class);
                startActivity(myIntent5);
            }
        });





    }
}