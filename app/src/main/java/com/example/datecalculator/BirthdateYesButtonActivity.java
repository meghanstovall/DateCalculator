package com.example.datecalculator;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class BirthdateYesButtonActivity extends AppCompatActivity {

    Date d;

    EditText enterBirthDate;

    Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthdate_yes_button);

        //I got help from a youtube tutorial done by "John's Android Studio Tutorials"

        enterBirthDate = (EditText) findViewById(R.id.enterBirthDate);
        enter = (Button) findViewById(R.id.enterBirthDateButton);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String death = (String) enterBirthDate.getText().toString();
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

    public void birthDateEnterButton(View view){
        Intent startNewActivity = new Intent(this, DoYouKnowHowLongLived.class);
        startActivity(startNewActivity);
    }

    public Date getBirthDate(){
        return d;
    }

}
