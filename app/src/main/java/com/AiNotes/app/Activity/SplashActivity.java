package com.AiNotes.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.AiNotes.app.Activity.LockScreen.LockScreenActivity;
import com.AiNotes.app.R;
import com.AiNotes.app.SharedPref.Setting;
import com.AiNotes.app.SharedPref.SharedPref;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 2000;
    private SharedPref sharedPref;
    private CardView Logo;
    private Animation animation;
    private TextView Logo_text;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

            this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN); //show the activity in full screen

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {


                    Intent i = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(i);
                    finish();
                }
            }, 3000);
        }




    }

