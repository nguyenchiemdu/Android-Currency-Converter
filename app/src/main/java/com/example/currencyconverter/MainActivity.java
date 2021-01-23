package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Convert(View view){
        EditText Money = (EditText) findViewById(R.id.Money);
        double VND = Double.parseDouble(Money.getText().toString())*23000;
        String result = String.format("%.2f",VND);
        Toast.makeText( this,  result+ " VND", Toast.LENGTH_LONG).show();
    }
}