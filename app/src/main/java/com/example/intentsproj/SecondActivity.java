package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText enum1;
    EditText enum2;
    String number1;
    String number2;

    TextView lblSum;

    int n1, n2;


    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        enum1 = findViewById(R.id.etnum1);
        enum2 = findViewById(R.id.etnum2);
        lblSum =findViewById(R.id.lblSum);

        Intent intent =getIntent();
        number1 = intent.getStringExtra("n1");
        number2 = intent.getStringExtra("n2");

        enum1.setText(number1);
        enum2.setText(number2);

        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);
    }

    public void add(View view){
        lblSum.setText(number1 + "+" + number2 + "=" + (n1 + n2));
    }

    public void substract(View view){
        lblSum.setText(number1 + "-" + number2 + "=" + (n1 - n2));
    }

    public void multiply(View view){
        lblSum.setText(number1 + "*" + number2 + "=" + (n1 * n2));
    }

    public void divide(View view){
        lblSum.setText(number1 + "/" + number2 + "=" + (n1 / n2));
    }


}