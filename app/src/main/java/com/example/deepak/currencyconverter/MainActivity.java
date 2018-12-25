package com.example.deepak.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){

        Log.i("Info","Button Pressed");

        EditText editText = (EditText)findViewById(R.id.editText);
        String amtInDollars = editText.getText().toString();
        double amtInRupees = (Double.parseDouble(amtInDollars)) * 77;
        String amtInRupeesStr = Double.toString(amtInRupees);

        Toast.makeText(this," $ " + amtInDollars + " is " +amtInRupeesStr + " Rupees " ,Toast.LENGTH_LONG).show();

        Log.i("Info",editText.getText().toString());

    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
