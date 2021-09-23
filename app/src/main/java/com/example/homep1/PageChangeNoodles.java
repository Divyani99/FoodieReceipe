package com.example.homep1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

 public class PageChangeNoodles extends FragmentPagerAdapter
{
    public PageChangeNoodles(@NonNull FragmentManager fragmentManager)
    {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
       Fragment fragment=null;
        switch (position)
        {
            case 0:
                fragment= new IndredentsNoodles();
                break;
            case 1:
                fragment=new DirectionNoodles();
                break;

        }
        return  fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
}

