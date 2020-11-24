package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void currencyConvert(View view) {
        EditText editTextCurrency = findViewById(R.id.editTextCurrency);

        Log.i("info", "button pressed!");

        if (!editTextCurrency.getText().toString().matches("")) {
            String amountInDollars = editTextCurrency.getText().toString();
            Log.i("amount in dollars", amountInDollars);

            double amountInDollarsDouble = Double.parseDouble(amountInDollars);
            double amountInEGPDouble = amountInDollarsDouble * 15.65;

            String amountInEGP = String.format("%.2f", amountInEGPDouble);
            Log.i("amount in EGP", amountInEGP);

            Toast.makeText(this,
                    editTextCurrency.getText().toString() + "$ is " + amountInEGP + " EGP",
                    Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}