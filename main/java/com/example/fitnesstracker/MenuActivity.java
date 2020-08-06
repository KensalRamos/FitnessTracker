package com.example.fitnesstracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Work our way up sending in the same Bundle
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);
    }

    /*
     * Handle the Begin Workout onClick action
     */
    public void workoutOnClick(View view) {

        Intent intent = new Intent(this, WorkoutActivity.class);
        startActivity(intent);

    }

    /*
     * Handle the Progress onClick action
     */
    public void progressOnClick(View view) {

        Intent intent = new Intent(this, ProgressActivity.class);
        startActivity(intent);

    }

    /*
     * Handle the Motivation onClick action
     */
    public void motivationOnClick(View view) {

        Intent intent = new Intent(this, MotivationActivity.class);
        startActivity(intent);

    }

    /*
     * Handle the Your Account onClick action
     */
    public void yourAccOnClick(View view) {

        Intent intent = new Intent(this, YourAccountActivity.class);
        startActivity(intent);

    }

}
