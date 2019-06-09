/**
 * Create a calculator app to perform all the standard calculator operations like addition,
 * subtraction, multiplication, divide etc.
 *  -No edittexts
 *  -Changing the orientation to landscape(layout qualifier) will display now functionality
 * Scientific calculator)
 *  Hint: Create all buttons using Relative/Grid Layout and append the values to the TextView.
 * Show the result in a separate TextView.
 *
 * Md Rahman
 */

package com.example.week1daily4_hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Two textviews to display the resulting calculation and the user input
    TextView tvResult;
    TextView tvTemp;

    // The list of all the buttons our calculator will have.
    Button btClear;
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

    // a Stringbuilder to hold info of everything the user clicks on
    StringBuilder currentNum = new StringBuilder();

    // String to hold result of our calculation.
    String resultString = new String("0");

    int count = 0; // necessary for calculation later on

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // attach each view and button to their appropriate ID
        tvTemp = findViewById(R.id.tvTemp);
        tvResult = findViewById(R.id.tvResult);
        btClear = findViewById(R.id.btClearAll);
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

        // attach on onClickListener to each button
        btClear.setOnClickListener(this);
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
    } // end onCreate

    // method that takes two strings that are numbers,
    // converts to double, adds, then converts back to a string and returns.
    private String addNumbers(String num1, String num2) {
        final double numOne = Double.parseDouble(num1);
        final double numTwo = Double.parseDouble(num2);
        double result = numOne + numTwo;
        return String.valueOf(result);
    }

    // method that takes two strings that are numbers,
    // converts to double, subtracts, then converts back to a string and returns.
    private String subNumbers(String num1, String num2) {
        final double numOne = Double.parseDouble(num1);
        final double numTwo = Double.parseDouble(num2);
        double result = numOne - numTwo;
        return String.valueOf(result);
    }

    // method that takes two strings that are numbers,
    // converts to double, divides, then converts back to a string and returns.
    private String divNumbers(String num1, String num2) {
        final double numOne = Double.parseDouble(num1);
        final double numTwo = Double.parseDouble(num2);
        double result = numOne / numTwo;
        return String.valueOf(result);
    }

    // method that takes two strings that are numbers,
    // converts to double, multiplies, then converts back to a string and returns.
    private String multNumbers(String num1, String num2) {
        final double numOne = Double.parseDouble(num1);
        final double numTwo = Double.parseDouble(num2);
        double result = numOne * numTwo;
        return String.valueOf(result);
    }

    // Whatever button user clicks, get that text and append to currentNum stringbuilder.
    // Append that text to the input view (tvTemp).
    @Override
    public void onClick(View v){
            switch (v.getId()) {

                // clear the result and temp textviews, set resultString and currentNum back to 0
                case R.id.btClearAll:
                    currentNum.setLength(0);
                    resultString = "0";
                    count = 0;   // This is necessary so our calculations in the btEquals case works
                    tvTemp.setText("");
                    tvResult.setText("");
                    break;
                case R.id.btAdd:
                    tvTemp.append("+");
                    currentNum.append("+");
                    break;
                case R.id.btSub:
                    tvTemp.append("-");
                    currentNum.append("-");
                    break;
                case R.id.btMult:
                    tvTemp.append("*");
                    currentNum.append("*");
                    break;
                case R.id.btDivide:
                    tvTemp.append("/");
                    currentNum.append("/");
                    break;
                case R.id.btNine:
                    currentNum.append("9");
                    tvTemp.setText(currentNum);
                    break;
                case R.id.btEight:
                    currentNum.append("8");
                    tvTemp.setText(currentNum);
                    break;
                case R.id.btSeven:
                    currentNum.append("7");
                    tvTemp.setText(currentNum);
                    break;
                case R.id.btSix:
                    currentNum.append("6");
                    tvTemp.setText(currentNum);
                    break;
                case R.id.btFive:
                    currentNum.append("5");
                    tvTemp.setText(currentNum);
                    break;
                case R.id.btFour:
                    currentNum.append("4");
                    tvTemp.setText(currentNum);
                    break;
                case R.id.btThree:
                    currentNum.append("3");
                    tvTemp.setText(currentNum);
                    break;
                case R.id.btTwo:
                    currentNum.append("2");
                    tvTemp.setText(currentNum);
                    break;
                case R.id.btOne:
                    currentNum.append("1");
                    tvTemp.setText(currentNum);
                    break;
                case R.id.btZero:
                    currentNum.append("0");
                    tvTemp.setText(currentNum);
                    break;
                case R.id.btDecimal:
                    currentNum.append(".");
                    tvTemp.setText(currentNum);
                    break;
                case R.id.btEqual:

                    // if we already have a result from a previous calculation, append that result
                    // to the beginning of our currentNum.
                    if(count >= 1)
                        currentNum.insert(0, resultString);

                    // convert currentNum (a stringbuilder) to a regular string so we can split
                    String s = currentNum.toString();

                    // take s and split using regex. The regex will split the digits from the non-digits,
                    // and store each element in an array. Taken from:
                    // https://stackoverflow.com/questions/27808112/java-splitting-with-math-expression
                    String[] split = s.split(("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)"));

                    // if this is the first time we're running our calculator (or if the user has hit
                    // clear all), result string will be empty. For the following while loop to work,
                    // set result string to the first value in split[]
                    if(count == 0) {
                        resultString = split[0];
                    }

                    int i = 0; // counter variable

                    // the first position of the split[] holds a number. The second position split[i+1]
                    // holds an operator. Depending on the operator, do the appropriate calculation.
                    // split[i+2] holds the second number
                    while (i < split.length - 1) {
                        if (split[i + 1].equals("+")) {
                            resultString = addNumbers(resultString, split[i + 2]);
                        } else if (split[i + 1].equals("-")) {
                            resultString = subNumbers(resultString, split[i + 2]);
                        } else if (split[i + 1].equals("/")) {
                            resultString = divNumbers(resultString, split[i + 2]);
                        } else if (split[i + 1].equals("*")) {
                            resultString = multNumbers(resultString, split[i + 2]);
                        } else
                            System.out.println();
                        i += 2; // increment i so we restart our calculation with the next operand
                    } // end while

                    // clear the text of the temp textview, set result textview to the resulting
                    // string, and clear currentNum.
                    tvTemp.setText("");
                    tvResult.setText(resultString);
                    currentNum.setLength(0);

                    // increment because now we have a result in resultstring.
                    // Count (and thus resultstring) will be reset to 0 if user hits clearAll
                    count = 1;
                    break;
            } // end switch
    } // end onClick
} // end class
