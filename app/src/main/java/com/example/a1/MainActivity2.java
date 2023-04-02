package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

EditText uText2;
EditText oText2;
Button oButton2;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText uText2= findViewById(R.id.editTextTextPersonName2);
        EditText oText2= findViewById(R.id.editTextTextPersonName3);
        Button oButton2= findViewById(R.id.button5);



        oButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                {

                    double result= Double.parseDouble((uText2.getText().toString()))*1.8 + 32;
                    String output = String.valueOf(result);
                    oText2.setText(output);


                }
            }
        });







    }

}