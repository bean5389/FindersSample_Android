package me.bean5389.finderssample;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

import me.bean5389.finderssample.base.BaseActivity;

public class IntroActivity extends BaseActivity {

    Timer mTimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }

    @Override
    protected void onResume() {
        super.onResume();

        this.goMain();
    }

    private void goMain(){

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(IntroActivity.this, MainActivity.class);
                IntroActivity.this.startActivity(intent);

                finish();
            }
        };

        this.mTimer = new Timer();
        this.mTimer.schedule(task, 5000);

    }
}
