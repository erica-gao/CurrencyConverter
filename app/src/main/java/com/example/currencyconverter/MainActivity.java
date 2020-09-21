package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClick(View view){
        Log.i("info", "button pressed");
        EditText euro = (EditText)findViewById(R.id.editText);
        String euro_string = euro.getText().toString();
        double euro_double = Double.parseDouble(euro_string);
        double dollar = euro_double*1.19;
        String dollar_string = Double.toString(dollar);

        String toast = "€"+euro_string+" "+"is "+"$"+dollar_string;

        Toast.makeText(this, toast, Toast.LENGTH_SHORT ).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}