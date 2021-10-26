package com.example.tutorial03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt_no1,edt_no2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_no1 = findViewById(R.id.edt_no1);
        edt_no2 = findViewById(R.id.edt_no2);
    }

    public void openSecond(View view){
        Intent intent = new Intent(this,SecondActivity.class);

        String no1 = edt_no1.getText().toString();
        String no2 = edt_no2.getText().toString();

        intent.putExtra("n1",no1);
        intent.putExtra("n2",no2);

        LayoutInflater L1 = getLayoutInflater();
        View Layout = L1.inflate(R.layout.custom_toast,findViewById(R.id.tv_toast));

        Toast toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM,0,0);
        toast.setView(Layout);
        toast.show();

        startActivity(intent);
    }
}