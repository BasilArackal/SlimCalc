package com.example.basilarackal.slimcalc;

import com.example.basilarackal.slimcalc.util.SystemUiHider;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.OrientationEventListener;
import android.view.View;
import android.widget.Toast;


public class FullscreenActivity extends Activity {
    Context con;
    public int n = 19;
    private Toast t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getApplicationContext(), "/ * F i n d  T h e  E a s t e r  E g g ! * /\nHint: Developer Options :P", Toast.LENGTH_LONG).show();
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_fullscreen);
        t = Toast.makeText(this, "", Toast.LENGTH_SHORT);
    }

    public void callMe(View view){
        if(n<2){
            Intent intent = new Intent(this, HappyBirthdayLivinTheLivingLegend.class);
            startActivity(intent);
        }
        else {
            n--;
            String s = "You are " + n + " step away from being a Developer";
            t.setText(s);
            t.show();
        }
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }


}


