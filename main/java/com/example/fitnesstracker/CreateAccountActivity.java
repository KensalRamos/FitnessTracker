package com.example.fitnesstracker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * Description: This activity is opened in 2 cases during app run.
 * 1) After the title screen if the userInfo.txt is empty
 * 2) Whenever the user decides to update any of their information
 *
 * This will save user information in a text file. No personal information saved.
 */

public class CreateAccountActivity extends AppCompatActivity {

    static UserAccount userAcc;
    public static final String FILE_NAME = "userAccountInfo.txt";
    EditText fullNameInput;
    EditText dobInput;
    EditText weightInput;
    EditText heightInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account_activity);

        // Initialize EditTexts
        fullNameInput = (EditText) findViewById(R.id.fullNameInput);
        dobInput = (EditText) findViewById(R.id.dobInput);
        weightInput = (EditText) findViewById(R.id.weightInput);
        heightInput = (EditText) findViewById(R.id.heightInput);

        readFromFile(this);

    }

    /*
     * Handle submit button on-click
     */
    public void submitOnClick(View view) {

        Intent intent = new Intent(this, MenuActivity.class);

        // Convert EditText to strings
        String fullName = fullNameInput.getText().toString();
        int dob = Integer.parseInt(dobInput.getText().toString());
        int weight = Integer.parseInt(weightInput.getText().toString());
        int height = Integer.parseInt(heightInput.getText().toString());

        // Create the user account
        userAcc = new UserAccount(fullName, dob, weight, height);
        userAcc.getAccount();

        writeToFile(this);
        startActivity(intent);
        finishAffinity();
    }

    // Save to file
    private void writeToFile(Context context) {

        PrintWriter pw;
        String filePath = context.getFilesDir().getPath().toString() + "/" + FILE_NAME;

        try {

            pw = new PrintWriter(filePath);

        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        pw.println(userAcc.getFullName());
        pw.println(userAcc.getDob());
        pw.println(userAcc.getWeight());
        pw.println(userAcc.getHeight());

        pw.close();



    }

    // Read from file
    public void readFromFile(Context context) {

        Scanner scanner;
        String filePath = context.getFilesDir().getPath().toString() + "/" + FILE_NAME;

        try {
            scanner = new Scanner(new File(filePath));
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        if (scanner.hasNext())
            fullNameInput.setText(scanner.nextLine());
        if (scanner.hasNext())
            dobInput.setText(scanner.nextLine());
        if (scanner.hasNext())
            weightInput.setText(scanner.nextLine());
        if (scanner.hasNext())
            heightInput.setText(scanner.nextLine());

        scanner.close();


    }

}
