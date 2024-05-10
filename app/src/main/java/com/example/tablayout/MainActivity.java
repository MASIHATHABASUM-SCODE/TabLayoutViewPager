package com.example.tablayout;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
        TabLayout tab;
        ViewPager vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        tab= findViewById(R.id.tab);
        vp = findViewById(R.id.vp);
        ViewPagerMessagerAdapter adapter= new ViewPagerMessagerAdapter(getSupportFragmentManager());
        vp.setAdapter(adapter);
        tab.setupWithViewPager(vp);// it is used to sync the tab and the view pager (if i slide into second fragment means the tab also changed into second )
    }
}