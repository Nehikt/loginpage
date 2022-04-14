package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    FloatingActionButton fb,google,t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tab_layout);
        viewPager=findViewById(R.id.view_pager);
        fb=findViewById(R.id.fab_fb);
        google=findViewById(R.id.fab_google);
        t=findViewById(R.id.fab_twitter);
        tabLayout.addTab(tabLayout.newTab().setText("login"));
        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);
    }
}