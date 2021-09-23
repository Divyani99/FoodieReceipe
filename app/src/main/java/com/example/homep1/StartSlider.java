package com.example.homep1;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

public class StartSlider extends AppCompatActivity implements View.OnClickListener
{

    private ViewPager viewPager;
    private LinearLayout layoutdot;
    private TextView[] dotstv;
    private int[] layout = {R.layout.sp1, R.layout.sp2, R.layout.sp3};

    private Button btnSkip;
    private Button btnNext;
    private MyPagerAdapter myPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


        if (Build.VERSION.SDK_INT >=19 )
        {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        }
        else
        {
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }

        setContentView(R.layout.activity_start_slider);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        layoutdot = (LinearLayout) findViewById(R.id.dotlayout);
        createDot(0);

        myPagerAdapter = new MyPagerAdapter(layout, this);
        viewPager.setAdapter(myPagerAdapter);
        viewPager.addOnPageChangeListener(viewPagerPageChangeListener);
        btnSkip = (Button) findViewById(R.id.btnskip);
        btnNext = (Button) findViewById(R.id.btnnext);

        btnNext.setOnClickListener(this);
        btnSkip.setOnClickListener(this);
    }
    private  void createDot(int current_pos)
    {
        if(layoutdot!=null)
        {
            layoutdot.removeAllViews();
        }
        ImageView[] dots = new ImageView[layout.length];
        for(int i=0;i<layout.length;i++)
        {
            dots[i]=new ImageView(this);
            if(i==current_pos)
            {
                dots[i].setImageDrawable(ContextCompat.getDrawable(this,R.drawable.active_dots));

            }
            else
            {
                dots[i].setImageDrawable(ContextCompat.getDrawable(this,R.drawable.default_dots));
            }
            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
            params.setMargins(4,0,4,0);
            layoutdot.addView(dots[i],params);

        }
    }


    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnnext:
                loadNextSlide();
                break;
            case R.id.btnskip:
                loadHome();
                new PreferenceManager(this).writePreference();
                break;
        }


    }

    private void loadHome()
    {
        startActivity(new Intent(this, LoginPage.class));
        finish();
    }

    public void loadNextSlide()
    {
        int next_slide = viewPager.getCurrentItem() + 1;
        if (next_slide < layout.length) {
            viewPager.setCurrentItem(next_slide);
        }
        else
        {

            Intent i = new Intent(StartSlider.this,LoginPage.class);
            startActivity(i);

        }


    }

    ViewPager.OnPageChangeListener viewPagerPageChangeListener = new ViewPager.OnPageChangeListener()
    {

        @Override
        public void onPageSelected(int position)
        {


            if (position == layout.length - 1) {
                createDot(position);
                btnNext.setText(getString(R.string.start));
                btnSkip.setVisibility(View.GONE);
            }
            else {
                createDot(position);
                btnNext.setText(getString(R.string.next));
                btnSkip.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {

        }

        @Override
        public void onPageScrollStateChanged(int arg0) {
        }
    };
}

