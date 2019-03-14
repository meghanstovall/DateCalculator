package com.example.datecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DoYouKnowDeathDate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_you_know_death_date);
    }

    public void deathYesButton(View view){
        Intent startNewActivity = new Intent(this, DeathYesButtonActivity.class);
        startActivity(startNewActivity);
    }

    public void deathNoButton(View view){
        Intent startNewActivity = new Intent(this, DoYouKnowHowLongLived.class);
        startActivity(startNewActivity);
    }

}
