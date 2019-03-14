package com.example.datecalculator;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void yesButton(View view){
        Intent startNewActivity = new Intent(this, BirthdateYesButtonActivity.class);
        startActivity(startNewActivity);
    }

    public void noButton(View view){
        Intent startNewActivity = new Intent(this, DoYouKnowDeathDate.class);
        startActivity(startNewActivity);
    }

}
