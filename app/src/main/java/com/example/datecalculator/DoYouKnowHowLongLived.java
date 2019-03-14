package com.example.datecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DoYouKnowHowLongLived extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_you_know_how_long_lived);
    }

    public void longLivedYesButton(View view){
        Intent startNewActivity = new Intent(this, HowLongLivedQ.class);
        startActivity(startNewActivity);
    }

    public void longLivedNoButton(View view){
        Intent startNewActivity = new Intent(this, CalculateThirdField.class);
        startActivity(startNewActivity);
    }
}
