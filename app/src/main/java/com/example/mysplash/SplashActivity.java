package com.example.mysplash;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

public class MySplashActivity extends Activity {

    // Время в милесекундах, в течение которого будет отображаться Splash Screen
    private final int SPLASH_DISPLAY_LENGTH = 2000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_may_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // По истечении времени, запускаем главный активити, а Splash Screen закрываем
                Intent mainIntent = new Intent(MySplashActivity.this, MainActivity.class);
                MySplashActivity.this.startActivity(mainIntent);
                MySplashActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}