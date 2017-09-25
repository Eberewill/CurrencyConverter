package com.wills.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public   void  converText(View view){

       // instance of getting  the edit text
        EditText dollarAmmount = (EditText) findViewById(R.id.dollar_editText);

        // create a double and convert the editText string to Double

        Double dollarAmmountDouble = Double.parseDouble(dollarAmmount.getText().toString());

        //create the variable that does the calculation (convertion) for you

        Double nairaAmount = dollarAmmountDouble * 350 ;

        //Toast the result in a formated string

        Toast.makeText(this, "Naira "+ String.format("%.2f",nairaAmount), Toast.LENGTH_SHORT).show();
        this.getSupportActionBar();


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
