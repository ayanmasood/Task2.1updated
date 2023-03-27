package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

EditText mText;
Button mButton;
Spinner spinner;
Spinner spinner2;
EditText oText;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText mText= findViewById(R.id.textView);
        Button mButton= findViewById(R.id.button);
        Spinner spinner= findViewById(R.id.spinner1);
        Spinner spinner1=findViewById(R.id.spinner);
        EditText oText=findViewById(R.id.textView2);

        //Linking array with spinner
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this, R.array.sWeights, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence> adapter2= ArrayAdapter.createFromResource(this, R.array.dWeights, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner1.setAdapter(adapter2);
        //making items clickable
        spinner.setOnItemSelectedListener(this);
        spinner1.setOnItemSelectedListener(this);



        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(spinner1.getSelectedItem().toString().equals("pound") && spinner.getSelectedItem().toString().equals("ounce")){

                    double result= Double.parseDouble(mText.getText().toString()) * 16;
                    String output = String.valueOf(result);
                    oText.setText(output);


                }
                if(spinner1.getSelectedItem().toString().equals("pound") && spinner.getSelectedItem().toString().equals("ton")){

                    double result= Double.parseDouble(mText.getText().toString()) / 2000;
                    String output = String.valueOf(result);
                    oText.setText(output);


                }
                if(spinner1.getSelectedItem().toString().equals("pound") && spinner.getSelectedItem().toString().equals("pound")){

                    double result= Double.parseDouble(mText.getText().toString()) * 1;
                    String output = String.valueOf(result);
                    oText.setText(output);


                }
                if(spinner1.getSelectedItem().toString().equals("ounce") && spinner.getSelectedItem().toString().equals("ounce")){

                    double result= Double.parseDouble(mText.getText().toString()) * 1;
                    String output = String.valueOf(result);
                    oText.setText(output);


                }
                if(spinner1.getSelectedItem().toString().equals("ton") && spinner.getSelectedItem().toString().equals("ton")){

                    double result= Double.parseDouble(mText.getText().toString()) * 1;
                    String output = String.valueOf(result);
                    oText.setText(output);


                }
                if(spinner1.getSelectedItem().toString().equals("ounce") && spinner.getSelectedItem().toString().equals("pound")){

                    double result= Double.parseDouble(mText.getText().toString()) / 16;
                    String output = String.valueOf(result);
                    oText.setText(output);


                }
                if(spinner1.getSelectedItem().toString().equals("ounce") && spinner.getSelectedItem().toString().equals("ton")){

                    double result= Double.parseDouble(mText.getText().toString()) / 32000;
                    String output = String.valueOf(result);
                    oText.setText(output);


                }
                if(spinner1.getSelectedItem().toString().equals("ton") && spinner.getSelectedItem().toString().equals("ounce")){

                    double result= Double.parseDouble(mText.getText().toString()) * 32000;
                    String output = String.valueOf(result);
                    oText.setText(output);


                }
                if(spinner1.getSelectedItem().toString().equals("ton") && spinner.getSelectedItem().toString().equals("pound")){

                    double result= Double.parseDouble(mText.getText().toString()) * 2000;
                    String output = String.valueOf(result);
                    oText.setText(output);


                }


            }
        });



    }
    private void poundConvertor(){

        double result= Double.parseDouble(mText.getText().toString()) * 16;
        Toast.makeText(MainActivity.this, "" + result, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {



    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}