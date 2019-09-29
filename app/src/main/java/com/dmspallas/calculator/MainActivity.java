package com.dmspallas.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText result;
    private EditText newNumber;
    private TextView displayOperation;

    private Double operand1 = null;
    private Double operand2 = null;
    private String pendingOperation = "=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
        newNumber = findViewById(R.id.newNumber);
        displayOperation = findViewById(R.id.displayOperation);
        Button number0 = findViewById(R.id.number0);
        Button number1 = findViewById(R.id.number1);
        Button number2 = findViewById(R.id.number2);
        Button number3 = findViewById(R.id.number3);
        Button number4 = findViewById(R.id.number4);
        Button number5 = findViewById(R.id.number5);
        Button number6 = findViewById(R.id.number6);
        Button number7 = findViewById(R.id.number7);
        Button number8 = findViewById(R.id.number8);
        Button number9 = findViewById(R.id.number9);
        Button point = findViewById(R.id.point);

        Button equals = findViewById(R.id.equals);
        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button divide = findViewById(R.id.divide);
        Button multiply = findViewById(R.id.multiply);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button = (Button) view;
                newNumber.append(button.getText().toString());
            }
        };
        number0.setOnClickListener(listener);
        number1.setOnClickListener(listener);
        number2.setOnClickListener(listener);
        number3.setOnClickListener(listener);
        number4.setOnClickListener(listener);
        number5.setOnClickListener(listener);
        number6.setOnClickListener(listener);
        number7.setOnClickListener(listener);
        number8.setOnClickListener(listener);
        number9.setOnClickListener(listener);
        point.setOnClickListener(listener);


        View.OnClickListener operationListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button = (Button) view;
                String operation = button.getText().toString();
                String value = newNumber.getText().toString();
                if (value.length() != 0) {
                    performOperation(value, operation);
                }
                pendingOperation = operation;
                displayOperation.setText(pendingOperation);
            }
        };
        equals.setOnClickListener(operationListener);
        plus.setOnClickListener(operationListener);
        minus.setOnClickListener(operationListener);
        divide.setOnClickListener(operationListener);
        multiply.setOnClickListener(operationListener);
    }


}
