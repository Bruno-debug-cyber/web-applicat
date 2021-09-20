/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  androidx.appcompat.app.AppCompatActivity
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.e.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import com.e.myapplication.MainActivity;

public class splashactivity
extends AppCompatActivity {
    private static int splash_time = 400;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131361821);
        new Handler().postDelayed(new Runnable(){

            public void run() {
                Intent intent = new Intent((Context)splashactivity.this, MainActivity.class);
                splashactivity.this.startActivity(intent);
            }
        }, (long)splash_time);
    }

}

