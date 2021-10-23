package com.AiNotes.app.Activity.About;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.AiNotes.app.BuildConfig;
import com.AiNotes.app.Constant.Constant;
import com.AiNotes.app.R;
import com.AiNotes.app.SharedPref.Setting;

public class AboutActivity extends AppCompatActivity {

    private Toolbar toolbarAbout;
    private TextView company, email, website, contact;
    private LinearLayout ll_share, ll_rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (Setting.Dark_Mode) {
            setTheme(R.style.AppTheme2);
        } else {
            setTheme(R.style.AppTheme);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        toolbarAbout = findViewById(R.id.toolbar_ab);
        setSupportActionBar(toolbarAbout);
        setTitle(getResources().getString(R.string.about));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbarAbout.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        if (Setting.Dark_Mode) {
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_keyboard_backspace_black_24dp);
        } else {
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_keyboard_backspace_black_24dp2);
        }

        company = findViewById(R.id.company);
        email = findViewById(R.id.email);
        website = findViewById(R.id.website);

        company.setText(Constant.company);
        email.setText(Constant.email);
        website.setText(Constant.website);


        ll_share  = findViewById(R.id.ll_share);
        ll_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String appName = getPackageName();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=7914023640674141967" + appName)));
            }
        });

        ll_rate  = findViewById(R.id.ll_rate);
        ll_rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String appName = getPackageName();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=7914023640674141967" + appName)));
            }
        });

        TextView version = findViewById(R.id.version);
        version.setText(BuildConfig.VERSION_NAME);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}