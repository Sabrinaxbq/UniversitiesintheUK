package com.example.android.universitiesintheuk;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;

public class cambridgeActivity extends AppCompatActivity {
    WebView webCam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambridge);
        webCam =(WebView)findViewById(R.id.web_cambridge);
        String text = "<html><body>" + "<p align=\"justify\">" + getString(R.string.cambridge_text) + "</p> " + "</body></html>";
        webCam.loadData(text, "text/html" ,"utf-8");
        webCam.setBackgroundColor(0);
    }

    public void location(View view) {
        Uri webpage = Uri.parse("https://www.google.com.hk/maps/place/University+Of+Cambridge,+Cambridge,+%E8%8B%B1%E5%9C%8B/@52.2016188,0.1157007,17z/data=!3m1!4b1!4m5!3m4!1s0x47d870a2d48a2fa9:0xbc7c6de4280c4af4!8m2!3d52.2016671!4d0.1177882");
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
        Uri webpage = Uri.parse("https://www.cam.ac.uk/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null)
        {
            startActivity(intent);
        }
    }




}
