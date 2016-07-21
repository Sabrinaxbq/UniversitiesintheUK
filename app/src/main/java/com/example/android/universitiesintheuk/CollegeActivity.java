package com.example.android.universitiesintheuk;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class CollegeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        WebView webCol;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college);
        webCol =(WebView)findViewById(R.id.web_college);
        String text = "<html><body>" + "<p align=\"justify\">" + getString(R.string.college_text) + "</p> " + "</body></html>";
        webCol.loadData(text, "text/html", "utf-8");
        webCol.setBackgroundColor(0);
    }
    public void location(View view) {
        Uri webpage = Uri.parse("https://www.google.com.hk/maps/place/University+College+London,+Gower+St,+Kings+Cross,+London+WC1E+6BT%E8%8B%B1%E5%9C%8B/@51.5247096,-0.1357579,17z/data=!3m1!4b1!4m5!3m4!1s0x48761b2f689cbee3:0xcaea3652d652b39f!8m2!3d51.5247063!4d-0.1335692");
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
        Uri webpage = Uri.parse("http://www.ucl.ac.uk/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null)
        {
            startActivity(intent);
        }
    }


}
