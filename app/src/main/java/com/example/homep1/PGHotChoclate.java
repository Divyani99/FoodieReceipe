package com.example.homep1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PGHotChoclate extends FragmentPagerAdapter
{
    public PGHotChoclate(@NonNull FragmentManager fragmentManager)
    {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position)
        {
            case 0:
                fragment= new IngreHotChoclate();
                break;
            case 1:
                fragment=new DirecHotChoclate();
                break;

        }
        return  fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
}

