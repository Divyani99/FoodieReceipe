package com.example.homep1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class MyPagerAdapter extends PagerAdapter {
    private LayoutInflater inflater;
    private int[] layout;
    private Context context;

    public MyPagerAdapter(int[] layout, Context context) {
        this.layout = layout;
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService((Context.LAYOUT_INFLATER_SERVICE));


    }

    @Override
    public int getCount() {
        return layout.length;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View v = inflater.inflate(layout[position], container, false);
        container.addView(v);
        return (v);

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        View v = (View) object;
        container.removeView(v);

    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object
            object) {
        return view == object;
    }
}