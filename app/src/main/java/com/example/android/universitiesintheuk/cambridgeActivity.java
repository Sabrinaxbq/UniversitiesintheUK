package com.example.android.universitiesintheuk;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class cambridgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambridge);
    }

    public void location(View view) {

    }
    public void back(View view) {
        Intent intro = new Intent(this, MainActivity.class);
        startActivity(intro);
    }

    public void knowmore(View view) {
        Uri webpage = Uri.parse("https://www.cam.ac.uk/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
