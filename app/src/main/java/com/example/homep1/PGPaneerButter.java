package com.example.homep1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PGPaneerButter extends FragmentPagerAdapter
{
    public PGPaneerButter(@NonNull FragmentManager fragmentManager)
    {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position)
        {
            case 0:
                fragment= new IngrePaneerButter();
                break;
            case 1:
                fragment=new DirecPaneerButter();
                break;

        }
        return  fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
}