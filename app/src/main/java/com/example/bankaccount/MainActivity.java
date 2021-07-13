package com.example.bankaccount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etPrint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPrint = findViewById(R.id.etPrint);


        BankAccount bankAccount = new BankAccount(" S1_290",50,100);
        etPrint.setText(""+bankAccount.getTotal());
    }
}