package com.example.homep1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PGAlooBhindi extends FragmentPagerAdapter
{
    public PGAlooBhindi(@NonNull FragmentManager fragmentManager)
    {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position)
        {
            case 0:
                fragment= new IngreAlooBhindi();
                break;
            case 1:
                fragment=new DirecAlooBhindi();
                break;
            case 2:
                fragment= new AlooBhindiVideo();

        }
        return  fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
