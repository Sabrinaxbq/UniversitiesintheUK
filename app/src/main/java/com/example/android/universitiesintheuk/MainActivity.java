package com.example.android.universitiesintheuk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goCambrdige(View view) {
        Intent goCam = new Intent(this, cambridgeActivity.class);
        startActivity(goCam);
    }

    public void goOxford(View view) {
        Intent goOxf = new Intent(this, OxfordActivity.class);
        startActivity(goOxf);
    }

    public void goImperial(View view) {
        Intent goImp = new Intent(this, ImperialActivity.class);
        startActivity(goImp);
    }

    public void goCollege(View view) {
        Intent goCol = new Intent(this, CollegeActivity.class);
        startActivity(goCol);
    }
}
