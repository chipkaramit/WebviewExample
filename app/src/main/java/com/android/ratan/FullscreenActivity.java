package com.android.ratan;

import android.annotation.SuppressLint;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class FullscreenActivity extends AppCompatActivity {
ImageView ivSplash;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);
        ivSplash = findViewById(R.id.iv_splash);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
       new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                // This method will be executed once the timer is over
//                Animation aniFade = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
//                ivSplash.startAnimation(aniFade);
                    Intent i = new Intent(FullscreenActivity.this, MainActivity.class);
                    startActivity(i);
                    finish();

            }
        }, 2000);
    }
}