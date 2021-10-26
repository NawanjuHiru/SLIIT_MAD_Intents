package com.example.tutorial03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText edt_no1,edt_no2;
    TextView tv_ans;
    Button btn_add,btn_minus,btn_multiply,btn_division;

    String number1, number2;
    int n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        edt_no1 = findViewById(R.id.edt_no1);
        edt_no2 = findViewById(R.id.edt_no2);
        tv_ans = findViewById(R.id.tv_ans);
        btn_add = findViewById(R.id.btn_add);
        btn_minus = findViewById(R.id.btn_minus);
        btn_multiply = findViewById(R.id.btn_multiply);
        btn_division = findViewById(R.id.btn_division);

        Intent intent = getIntent();
        number1 = intent.getStringExtra("n1");
        number2 = intent.getStringExtra("n2");

        edt_no1.setText(number1);
        edt_no2.setText(number2);

        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);
    }

    public void add(View view){
        tv_ans.setText(number1 + "+" + number2 + "=" + (n1+n2));
    }

    public void subtract(View view){
        tv_ans.setText(number1 + "-" + number2 + "=" + (n1-n2));
    }

    public void multiply(View view){
        tv_ans.setText(number1 + "*" + number2 + "=" + (n1*n2));
    }

    public void divide(View view){
        tv_ans.setText(number1 + "/" + number2 + "=" + (n1/n2));
    }
}