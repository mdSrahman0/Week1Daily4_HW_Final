/**
 * Create a calculator app to perform all the standard calculator operations like addition,
 * subtraction, multiplication, divide etc.
 *  -No edittexts
 *  -Changing the orientation to landscape(layout qualifier) will display now functionality
 * Scientific calculator)
 *  Hint: Create all buttons using Relative/Grid Layout and append the values to the TextView.
 * Show the result in a separate TextView.
 */

package com.example.week1daily4_hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvResult;
    Button btClear;
    Button btDelete;
    Button btEquals;
    Button btDecimal;
    Button btAdd;
    Button btDivide;
    Button btSub;
    Button btMult;
    Button btNine;
    Button btEight;
    Button btSeven;
    Button btSix;
    Button btFive;
    Button btFour;
    Button btThree;
    Button btTwo;
    Button btOne;
    Button btZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tvResult);
        btClear = findViewById(R.id.btClear);
        btDelete = findViewById(R.id.btDelete);
        btEquals = findViewById(R.id.btEqual);
        btDecimal = findViewById(R.id.btDecimal);
        btAdd = findViewById(R.id.btAdd);
        btDivide = findViewById(R.id.btDivide);
        btSub = findViewById(R.id.btSub);
        btMult = findViewById(R.id.btMult);
        btNine = findViewById(R.id.btNine);
        btEight = findViewById(R.id.btEight);
        btSeven = findViewById(R.id.btSeven);
        btSix = findViewById(R.id.btSix);
        btFive = findViewById(R.id.btFive);
        btFour = findViewById(R.id.btFour);
        btThree = findViewById(R.id.btThree);
        btTwo = findViewById(R.id.btTwo);
        btOne = findViewById(R.id.btOne);
        btZero = findViewById(R.id.btZero);

        btClear.setOnClickListener(this);
        btDelete.setOnClickListener(this);
        btEquals.setOnClickListener(this);
        btDecimal.setOnClickListener(this);
        btAdd.setOnClickListener(this);
        btDivide.setOnClickListener(this);
        btSub.setOnClickListener(this);
        btMult.setOnClickListener(this);
        btNine.setOnClickListener(this);
        btEight.setOnClickListener(this);
        btSeven.setOnClickListener(this);
        btSix.setOnClickListener(this);
        btFive.setOnClickListener(this);
        btFour.setOnClickListener(this);
        btThree.setOnClickListener(this);
        btTwo.setOnClickListener(this);
        btOne.setOnClickListener(this);
        btZero.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        final String resultString = "";
        String getNums = "";
        switch (v.getId()){
            // if they press a number button, save it to a temp string then add it to
            // the final string, then clear the temp.
            // once they click on an operator,
        }
    }
}
