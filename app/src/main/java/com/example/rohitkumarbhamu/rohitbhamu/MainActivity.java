package com.example.rohitkumarbhamu.rohitbhamu;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


import com.example.rohitkumarbhamu.rohitbhamu.controller.DevPagerAdapter;

public class MainActivity extends AppCompatActivity  {
    public RelativeLayout call_me;
    private ViewPager viewPager;
   //Button call_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RelativeLayout call_me = (RelativeLayout) findViewById(R.id.call_me);
        //call_button = (Button) findViewById(R.id.callButton);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new DevPagerAdapter(getSupportFragmentManager()));
        TabLayout tabs = findViewById(R.id.tabLayoutId);
        tabs.setupWithViewPager(viewPager);
        tabs.setTabTextColors(Color.GRAY, Color.parseColor("white"));
        //
        // call_me.setOnClickListener(this);
    }
/*
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.call_me:
                startActivity(new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+918353064425")));
        }
    }*/
}