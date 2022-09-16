package com.db.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convertAmount(View view){
        EditText amountValue = findViewById(R.id.amount_value);
        String value = amountValue.getText().toString();
        String conversionToast = "$"+value+" is Rs." + (Double.parseDouble(value)*79.97);
        Toast.makeText(this, conversionToast , Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}