package com.example.android.universitiesintheuk;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OxfordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oxford);
    }
    public void location(View view) {
        Uri webpage = Uri.parse("https://www.google.com.hk/maps/place/%E7%89%9B%E6%B4%A5%E5%A4%A7%E5%AD%B8/@51.7566374,-1.2568924,17z/data=!3m1!4b1!4m5!3m4!1s0x4876c6a9ef8c485b:0xd2ff1883a001afed!8m2!3d51.7566341!4d-1.2547037");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null)
        {
            startActivity(intent);
        }
    }
    public void back(View view) {
        Intent intro = new Intent(this, MainActivity.class);
        startActivity(intro);
    }

    public void knowmore(View view) {
        Uri webpage = Uri.parse("http://www.ox.ac.uk/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null)
        {
            startActivity(intent);
        }
    }


}
