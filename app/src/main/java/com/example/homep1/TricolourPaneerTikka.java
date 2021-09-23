package com.example.homep1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

public class TricolourPaneerTikka extends AppCompatActivity {

    TextView t1,t2;
    ViewPager viewPager;
    PageChangeTriPaneer TricolourPaneerTikka;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tricolour_paneer_tikka);

        t1=(TextView)findViewById(R.id.t1) ;
        t2=(TextView)findViewById(R.id.t2) ;
//give reference to view pager
        viewPager=(ViewPager)findViewById(R.id.viewPagertricolour);
        //Give Refence to Class
       TricolourPaneerTikka = new PageChangeTriPaneer(getSupportFragmentManager());
        viewPager.setAdapter(TricolourPaneerTikka);
//add Listener to button like textview(1st Button)
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });

//2nd Button
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });
//add listener to view pager
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                onChangeTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
    private void onChangeTab(int position)
    {

//add positions of button  and et text and background color
        if(position==0)
        {
            t1.setTextSize(25);

            t2.setTextSize(20);



        }
        if(position==  1)
        {
            t2.setTextSize(25);
            t1.setTextSize(20);



        }

    }
}
