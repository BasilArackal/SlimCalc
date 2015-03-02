package com.example.basilarackal.slimcalc;

import com.example.basilarackal.slimcalc.util.SystemUiHider;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.Toast;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class HappyBirthdayLivinTheLivingLegend extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Context context = getApplicationContext();
        Vibrator mVibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        mVibrator.vibrate(650);
        Toast.makeText(context, "Achievement Unlocked: You're now Lv.19!", Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.a);
        mediaPlayer.start();
        setContentView(R.layout.activity_happy_birthday_livin_the_living_legend);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }


}
