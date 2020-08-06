package com.example.fitnesstracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

/*
 *
 * Name: Kensal J Ramos
 *
 * Created on 08/03/2020 (MM/DD/YYYY)
 *
 * Description: This will be the main activity screen. Towards the end I would like this
 * activity screen to either log users into their accounts, or have them input new information.
 *
 * The sending of emails, etc will be dealt with much, much later. Initially I just want to get
 * the user's Name, DOB, Gender, Weight (optional) , Height(optional).
 *
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Work our way up sending in the same Bundle
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mainLinearLayout);
        linearLayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

    }


}
