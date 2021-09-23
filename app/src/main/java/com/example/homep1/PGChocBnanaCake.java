
package com.example.homep1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.os.Bundle;

public class PGChocBnanaCake extends FragmentPagerAdapter
{
    public PGChocBnanaCake(@NonNull FragmentManager fragmentManager){super(fragmentManager);}

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position)
        {
            case 0:
                fragment= new IngreChocBananaCake();
                break;
            case 1:
                fragment=new DirectChocBananaCake();
                break;

        }
        return  fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
