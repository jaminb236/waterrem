package edu.carothers.waterrem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Context;
import android.widget.Button;

import static edu.carothers.waterrem.R.id.overridegoal;


public class settings extends AppCompatActivity {
    public Context _context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        _context = getApplicationContext();

        Button save = (Button)findViewById(R.id.Save);


        final MyGlobalClass globalVariable = (MyGlobalClass) getApplicationContext();


        save.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                globalVariable.setmygoal(overridegoal);
            }

            /** Called when the user taps the home button */

                                    public void reminder(View view) {

                                    }
                                });}


    /**
     * Called when the user taps the home button
     */
    public void home(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        /** use the code below to retreive the goal
         //    MyGlobalClass globalVariable = (MyGlobalClass) getApplicationContext();
         //        globalVariable.setMyString("AN THE RAW ID");
*/
         }
            /** Called when the user taps the reminder button */
            public void reminder(View view) {
                Intent intent = new Intent(this, reminder.class);
                startActivity(intent);
            }

}




