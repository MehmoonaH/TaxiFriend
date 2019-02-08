package com.example.u1763238.fnalovo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);


        Button lineUp = (Button) findViewById(R.id.lineUp);
        lineUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(MainMenuActivity.this,LineUpActivity.class);
                startActivity(startIntent);
            }
        });
        Button eventinfo = (Button) findViewById(R.id.eventInfo);
        eventinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(MainMenuActivity.this,EventInfoActivity.class);
                startActivity(startIntent);
            }
        });

        Button location = (Button) findViewById(R.id.location);
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String google = "https://www.google.co.uk/maps/place/Budweiser+Stage/@43.6292498,-79.417428,17z/data=!3m1!4b1!4m5!3m4!1s0x882b35108670b76b:0x88eb02c63d5c5f51!8m2!3d43.6292459!4d-79.4152393";
                Uri website = Uri.parse(google);

                Intent gotgoogle= new Intent(Intent.ACTION_VIEW, website);
                if(gotgoogle.resolveActivity(getPackageManager())!= null){
                    startActivity((gotgoogle));
                }
            }
        });

        Button ticketBtn = (Button) findViewById(R.id.tickets);
        ticketBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String search = "https://www.ticketmaster.com/OVO-Fest-tickets/artist/1875898";
                Uri webaddress = Uri.parse(search);

                Intent gotosite= new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotosite.resolveActivity(getPackageManager())!= null){
                    startActivity((gotosite));
                }
            }
        });}
}
