package com.example.datecalculator;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class HowLongLivedQ extends AppCompatActivity {

    int years;
    int months;
    int days;

    EditText howManyYears;
    EditText howManyMonths;
    EditText howManyDays;

    Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_long_lived_q);

        howManyYears = (EditText) findViewById(R.id.howManyYears);
        howManyMonths = (EditText) findViewById(R.id.howManyMonths);
        howManyDays = (EditText) findViewById(R.id.howManyDays);

        enter = (Button) findViewById(R.id.enterYearsDaysLived);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                years = Integer.valueOf(howManyYears.getText().toString());
                months = Integer.valueOf(howManyMonths.getText().toString());
                days = Integer.valueOf(howManyDays.getText().toString());

            }

        });

    }

    public void enterYearsDaysButton(View view){
        Intent startNewActivity = new Intent(this, DoYouKnowHowLongLived.class);
        startActivity(startNewActivity);
    }

    public int getNumYears(){
        return years;
    }

    public int getNumMonths(){
        return months;
    }

    public int getNumDays(){
        return days;
    }

}
