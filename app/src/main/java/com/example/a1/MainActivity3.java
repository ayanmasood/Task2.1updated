package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {



    EditText uText3;
    EditText oText3;
    Button oButton3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        EditText uText3= findViewById(R.id.editTextTextPersonName);
        EditText oText3= findViewById(R.id.editTextTextPersonName4);
        Button oButton3= findViewById(R.id.button4);



        oButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                {

                    double result= Double.parseDouble((uText3.getText().toString()))*2.54;
                    String output = String.valueOf(result);
                    oText3.setText(output);


                }
            }
        });







    }
}