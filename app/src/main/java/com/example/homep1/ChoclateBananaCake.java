package com.example.homep1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.icu.text.RelativeDateTimeFormatter;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChoclateBananaCake extends AppCompatActivity {
    TextView l1,l2;
    ViewPager viewPager;
    PGChocBnanaCake bananacake;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choclate_banana_cake);
        l1=(TextView)findViewById(R.id.bi) ;
        l2=(TextView)findViewById(R.id.bd) ;
//give reference to view pager
        viewPager=(ViewPager)findViewById(R.id.vpchoclate);
        //Give Refence to Class
        bananacake= new PGChocBnanaCake(getSupportFragmentManager());
        viewPager.setAdapter(bananacake);
//add Listener to button like textview(1st Button)
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });

//2nd Button
        l2.setOnClickListener(new View.OnClickListener() {
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
            l1.setTextSize(25);

            l2.setTextSize(20);



        }
        if(position==  1)
        {
            l2.setTextSize(25);
            l1.setTextSize(20);



        }

    }
}
