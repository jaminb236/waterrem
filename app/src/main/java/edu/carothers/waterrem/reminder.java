package edu.carothers.waterrem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class reminder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);

    }
    /** Called when the user taps the settings button */
    public void settings(View view) {
        Intent intent = new Intent(this, settings.class);
        startActivity(intent);
    }

    /**
     * Called when the user taps the home button
     */
    public void home(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }


}