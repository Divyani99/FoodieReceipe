package com.example.homep1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

public class PaneerCornChapataSalad extends AppCompatActivity {

    TextView t5,t55;
    ViewPager viewPager;
    PageChangeChapataSalad PaneerCornChapata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paneer__corn__chapata__salad);

        t5=(TextView)findViewById(R.id.t5) ;
        t55=(TextView)findViewById(R.id.t55) ;
//give reference to view pager
        viewPager=(ViewPager)findViewById(R.id.viewPagerChapata);
        //Give Refence to Class
        PaneerCornChapata = new PageChangeChapataSalad(getSupportFragmentManager());
        viewPager.setAdapter(PaneerCornChapata);
//add Listener to button like textview(1st Button)
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });

//2nd Button
        t55.setOnClickListener(new View.OnClickListener() {
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
            t5.setTextSize(25);

            t55.setTextSize(20);



        }
        if(position==1)
        {
            t5.setTextSize(25);
            t55.setTextSize(20);



        }

    }
}
