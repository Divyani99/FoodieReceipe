package com.example.homep1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.icu.text.RelativeDateTimeFormatter;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CholeBature extends AppCompatActivity {
    TextView cb1,cb2;
    ViewPager viewPager;
    PGCholeBhature CholeBhature;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chole_bature);
        cb1=(TextView)findViewById(R.id.cbb2) ;
        cb2=(TextView)findViewById(R.id.cbb1) ;
//give reference to view pager
viewPager=(ViewPager)findViewById(R.id.vpcholebhature);
        //Give Refence to Class
        CholeBhature= new PGCholeBhature(getSupportFragmentManager());
        viewPager.setAdapter(CholeBhature);
//add Listener to button like textview(1st Button)
        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });

//2nd Button
        cb2.setOnClickListener(new View.OnClickListener() {
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
            cb1.setTextSize(25);

            cb2.setTextSize(20);



        }
        if(position==  1)
        {
            cb2.setTextSize(25);
            cb1.setTextSize(20);



        }

    }
}
