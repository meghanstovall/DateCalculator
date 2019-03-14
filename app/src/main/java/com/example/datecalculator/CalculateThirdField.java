package com.example.datecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CalculateThirdField extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_third_field);
    }

    /**

    TextView message = (TextView) findViewById(R.id.calculatedMessage);

    public TextView printMessage(TimeUnit timeUnit) {
        Date birthDate = BirthdateYesButtonActivity.getBirthDate();
        Date deathDate = DeathYesButtonActivity.getDeathDate();
        int longLivedYears = HowLongLivedQ.getNumYears();
        int longLivedMonths = HowLongLivedQ.getNumMonths();
        int longLivedDays = HowLongLivedQ.getNumDays();

        if (birthDate == null && deathDate == null
                && longLivedYears == 0 && longLivedMonths == 0 &&longLivedDays == 0) {

            message.setText("We're sorry, you did not enter two of the three fields. Please try again and enter answers for two of the questions.");
        }

         if(birthDate == null){


         } else if(deathDate == null){


         } else {

         long diffInMillies = deathDate.getTime() - birthDate.getTime();
         long date = timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS);
         //message = "they lived for " + date + timeUnit;

         }
        return message;
    }

     */

}


