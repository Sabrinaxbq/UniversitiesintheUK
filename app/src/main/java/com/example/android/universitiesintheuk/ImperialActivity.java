package com.example.android.universitiesintheuk;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class ImperialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        WebView webImp;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imperial);
        webImp =(WebView)findViewById(R.id.web_imperial);
        String text = "<html><body>" + "<p align=\"justify\">" + getString(R.string.imperial_text) + "</p> " + "</body></html>";
        webImp.loadData(text, "text/html", "utf-8");
        webImp.setBackgroundColor(0);
    }

    public void location(View view) {
        Uri webpage = Uri.parse("https://www.google.com.hk/maps/place/Imperial+College/@51.498803,-0.1770659,17z/data=!3m1!4b1!4m5!3m4!1s0x48760567da220a01:0x31911b371c692e86!8m2!3d51.4987997!4d-0.1748772");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void back(View view) {
        Intent intro = new Intent(this, MainActivity.class);
        startActivity(intro);
    }

    public void knowmore(View view) {
        Uri webpage = Uri.parse("http://www.imperial.ac.uk/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
