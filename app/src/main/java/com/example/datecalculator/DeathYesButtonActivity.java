package com.example.datecalculator;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DeathYesButtonActivity extends AppCompatActivity {

    Date d;

    EditText enterDeathDate;
    Button enter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_death_yes_button);

        //I got help from a youtube tutorial done by "John's Android Studio Tutorials"

        enterDeathDate = (EditText) findViewById(R.id.enterDeathDate);
        enter = (Button) findViewById(R.id.button2);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String death = (String) enterDeathDate.getText().toString();
                SimpleDateFormat newFormat = new SimpleDateFormat("MM-dd-yyyy");

                d = null;
                if(death != null) {
                    try {
                        d = newFormat.parse(death);
                    } catch (ParseException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                } else {
                    d = null;
                }


            }

        });

    }

    public void deathDateEnterButton(View view){
        Intent startNewActivity = new Intent(this, DoYouKnowHowLongLived.class);
        startActivity(startNewActivity);
    }

    public Date getDeathDate(){
        return d;
    }

}
