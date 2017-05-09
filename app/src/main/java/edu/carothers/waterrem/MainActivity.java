package edu.carothers.waterrem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.GridView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public int mygetgoal;
    int remainder = (mygetgoal - R.id.custom);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println(drinks[0].getName());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView) findViewById(R.id.gridview);
        DrinksAdapter drinksAdapter = new DrinksAdapter(this, drinks);
        gridView.setAdapter(drinksAdapter);

// Stuff below this line relates to the update button and goals





        MyGlobalClass globalVariable = (MyGlobalClass) getApplicationContext();
        mygetgoal = globalVariable.getmygoal();





        Button ounces = (Button) findViewById(R.id.update);
        ounces.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            /** Called when the user taps the update button */
            result.setText("You Still have " + remainder + "OZ to go");
        }
        final TextView result = ((TextView) findViewById(R.id.output));
        });
    }





    /** Called when the user taps the settings button */
    public void settings(View view) {
        Intent intent = new Intent(this, settings.class);
        startActivity(intent);
    }


    /** Called when the user taps the reminder button */
    public void reminder(View view) {
        Intent intent = new Intent(this, reminder.class);
        startActivity(intent);
    }




// the below is my array,need to come
// up with a way for the user to add to this array and delete from the array.
// ..but not delete the defualt from the array....
    //make two arrays!

    private Drink[] drinks = {


            new Drink("Small Water",8),
            new Drink("Med Water",12),
            new Drink("Lrg Water", 24),
            new Drink("Small soda", 8),
            new Drink("Med soda", 12),
            new Drink("Lrg Soda", 24),
            new Drink("Small Coffe", 8),
            new Drink("Med Coffe", 12),
            new Drink("Lrg Coffe", 24)

    };

    }
