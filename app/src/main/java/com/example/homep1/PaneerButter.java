package com.example.homep1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.icu.text.RelativeDateTimeFormatter;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PaneerButter extends AppCompatActivity {
    TextView cvi,cvd;
    ViewPager viewPager1;
    PGPaneerButter paneerButter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paneer_butter);
        cvi=(TextView)findViewById(R.id.pbi) ;
        cvd=(TextView)findViewById(R.id.pbd) ;
//give reference to view pager
        viewPager1=(ViewPager)findViewById(R.id.viewPagerpaneerbutter);
        //Give Refence to Class
        paneerButter= new PGPaneerButter(getSupportFragmentManager());
        viewPager1.setAdapter(paneerButter);
//add Listener to button like textview(1st Button)
        cvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager1.setCurrentItem(0);
            }
        });

//2nd Button
        cvd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager1.setCurrentItem(1);
            }
        });
//add listener to view pager
        viewPager1.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
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
            cvi.setTextSize(25);

            cvd.setTextSize(20);



        }
        if(position==  1)
        {
            cvd.setTextSize(25);
            cvi.setTextSize(20);



        }

    }
}
