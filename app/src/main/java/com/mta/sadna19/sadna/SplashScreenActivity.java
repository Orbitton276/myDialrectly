package com.mta.sadna19.sadna;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    private static int SPLASH_TIME = 200; //This is 2 seconds
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Code to start timer and take action after the timer ends
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do any action here. Now we are moving to next page
                //Intent mySuperIntent = new Intent(SplashScreenActivity.this, MainActivity.class);
                //Intent mySuperIntent = new Intent(SplashScreenActivity.this, corridorActivity.class);
                Intent mySuperIntent = new Intent(SplashScreenActivity.this, MenuListActivity.class);
               startActivity(mySuperIntent);
                /* This 'finish()' is for exiting the app when back button pressed
                 *  from Home page which is ActivityHome
                 */
                finish();
            }
        }, SPLASH_TIME);

    }
}
