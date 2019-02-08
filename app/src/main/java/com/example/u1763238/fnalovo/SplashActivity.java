package com.example.u1763238.fnalovo;

        import android.content.Intent;
                import android.os.Handler;
                import android.support.v7.app.AppCompatActivity;
                import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        int secondsDelayed = 5;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(SplashActivity.this, loginActivity.class));
                finish();
            }
        }, secondsDelayed * 1000);
    }
}
