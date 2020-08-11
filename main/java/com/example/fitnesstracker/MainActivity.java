package com.example.fitnesstracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import java.io.File;

/*
 *
 * Name: Kensal J Ramos
 *
 * Created on 08/03/2020 (MM/DD/YYYY)
 *
 * Description: This is the welcome screen that is displayed only once per instance.
 * Nothing much here besides an image and a TextView.
 *
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Work our way up sending in the same Bundle
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        // Read from text file to try and initialize user account
        // If unsuccessful, we will initiate the createAccountActivity instead of the MenuActivity

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mainLinearLayout);

        linearLayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent;
                String filePath = MainActivity.this.getFilesDir().getPath().toString() + "/" + CreateAccountActivity.FILE_NAME;
                File file = new File(filePath);

                // if (userInfo.txt is not empty) open menu activity
                // else open create account activity
                if (file.exists() && file.length() != 0) {
                    intent = new Intent(MainActivity.this, MenuActivity.class);
                }
                else {
                    intent = new Intent(MainActivity.this, CreateAccountActivity.class);
                }
                startActivity(intent);
                finishAffinity();
            }
        });

    }


}
