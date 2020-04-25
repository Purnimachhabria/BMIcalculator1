package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText weight,height,inch;
    TextView resulttext;
    String calculation,BMIresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight=findViewById(R.id.weight);
        height=findViewById(R.id.height);
        resulttext=findViewById(R.id.result);


    }

    public void calculateBMI(View view) {
        String s1=weight.getText().toString();
        String s2=height.getText().toString();



        float weightvalue=Float.parseFloat(s1);
        float heightvalue=Float.parseFloat(s2);


        float bmi= weightvalue/(heightvalue * heightvalue);

        if(bmi < 18.5)
        {

            BMIresult="Pounds is money, Get some!!";

        }
        else if (bmi>=18.5 && bmi<=24.9)
        {
            BMIresult="Hey,You are Pink in Health";

        }
        else if (bmi>=25 && bmi<=29.9)
        {
            BMIresult="Drop some weight";

        }
        else if (bmi>=30 && bmi<=34.9)
        {
            BMIresult="Obese level 1";

        }
        else if (bmi>=35 && bmi<=39.9)
        {
            BMIresult="Obese level 2";

        }
        else if (bmi>=40)
        {
            BMIresult="Super Obese";

        }
        calculation="\n"+ bmi+ "\n" + BMIresult;
        resulttext.setText(calculation);
    }
}
