package com.cs407.calculatoractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity(double s, boolean error){
        Intent intent = new Intent(this, MainActivity2.class);
        String str = Double.toString(s);
        if (error){
            str = "ERROR: Division by 0";
        }
        intent.putExtra("number", str);
        startActivity(intent);
    }

    public void addition(View view) {
        EditText number1 = (EditText) findViewById(R.id.editTextNumber);
        EditText number2 = (EditText) findViewById(R.id.editTextNumber2);
        double sum = Integer.parseInt(number1.getText().toString()) + Integer.parseInt(number2.getText().toString());
        goToActivity(sum, false);
    }

    public void subtraction(View view) {
        EditText number1 = (EditText) findViewById(R.id.editTextNumber);
        EditText number2 = (EditText) findViewById(R.id.editTextNumber2);
        double sum = Integer.parseInt(number1.getText().toString()) - Integer.parseInt(number2.getText().toString());
        goToActivity(sum, false);
    }
    public void multiplicaion(View view) {
        EditText number1 = (EditText) findViewById(R.id.editTextNumber);
        EditText number2 = (EditText) findViewById(R.id.editTextNumber2);
        double sum = Integer.parseInt(number1.getText().toString()) * Integer.parseInt(number2.getText().toString());
        goToActivity(sum, false);
    }
    public void division(View view) {
        EditText number1 = (EditText) findViewById(R.id.editTextNumber);
        EditText number2 = (EditText) findViewById(R.id.editTextNumber2);
        if (number2.getText().toString().equals("0")){
            goToActivity(0, true);
        } else {
            double sum = Integer.parseInt(number1.getText().toString()) / Integer.parseInt(number2.getText().toString());
            goToActivity(sum, false);
        }
    }
}