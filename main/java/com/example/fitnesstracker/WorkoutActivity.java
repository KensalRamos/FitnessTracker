package com.example.fitnesstracker;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class WorkoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Work our way up sending in the same Bundle
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout_activity);
    }

}
