package com.example.homep1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.icu.text.RelativeDateTimeFormatter;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class AlooBhindi extends AppCompatActivity {
    TextView l1,l2,vid;
    ViewPager viewPager;
    PGAlooBhindi alooBhindi;
    TextView txtTikka;
    WebView webView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aloo_bhindi);
        l1=(TextView)findViewById(R.id.abi) ;
        l2=(TextView)findViewById(R.id.abd);
        vid= (TextView) findViewById(R.id.video);
//give reference to view pager
        viewPager=(ViewPager)findViewById(R.id.viewPageraloobhindi);
        //Give Refence to Class
        alooBhindi= new PGAlooBhindi(getSupportFragmentManager());
        viewPager.setAdapter(alooBhindi);

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
        vid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
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
            l1.setTextSize(20);

            l2.setTextSize(15);
            vid.setTextSize(15);


        }
        if(position==1)
        {
            l2.setTextSize(20);
            l1.setTextSize(15);
            vid.setTextSize(15);

        }
        if(position==2)
        {
            vid.setTextSize(20);
            l2.setTextSize(15);
            l1.setTextSize(15);

        }

    }

}

