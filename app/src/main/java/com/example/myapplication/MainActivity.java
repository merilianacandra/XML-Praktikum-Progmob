package com.example.myapplication;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout) findViewById(R.id.table_layout);
        viewPager = (ViewPager) findViewById(R.id.view_paper);
        ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager());

        adapter.AddFragments(new FragmentDashboard(), "Dashboard");
        adapter.AddFragments(new FragmentAddEvent(), "AddEvent");
        adapter.AddFragments(new FragmentNotification(), "Notification");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
