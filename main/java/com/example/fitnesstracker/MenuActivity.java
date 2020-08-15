package com.example.fitnesstracker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.io.File;
import java.util.Scanner;
import static com.example.fitnesstracker.CreateAccountActivity.FILE_NAME;

/*
 * Created/Updated by: Kensal J Ramos
 *
 * Name: MenuActivity
 *
 * Description: This is the main menu activity. Links to Begin Workout, Progress, Motivation,
 * and Your Account are included here. Additionally, a "Welcome <username>" string is located
 * at the bottom.
 *
 * As expected, every TextView has an OnClick action that leads to the corresponding activity.
 *
 *
 *
 */

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Work our way up sending in the same Bundle
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        setWelcomeString(this);
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

        // Change class
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);

    }

    /*
     * Name: setWelcomeString
     */
    private void setWelcomeString(Context context) {

        Scanner scanner;
        String filePath = context.getFilesDir().getPath().toString() + "/" + FILE_NAME;
        TextView welcomeText = (TextView) findViewById(R.id.welcomeUserText);
        String welcomeUser = "";
        String userName = "";

        // Attempt to create scanner...
        try {
            scanner = new Scanner(new File(filePath));
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        // Take the first line of the file
        if (scanner.hasNext()) {
            userName = scanner.nextLine();
            userName = userName.substring(0, 1).toUpperCase() + userName.substring(1);
            welcomeUser = getString(R.string.welcome_user, userName);
        }
        else {
            welcomeUser = "Welcome User";
        }


        welcomeText.setText(welcomeUser);
    }

}
