
package com.example.homep1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.os.Bundle;

public class PGCholeBhature extends FragmentPagerAdapter
{
    public PGCholeBhature(@NonNull FragmentManager fragmentManager){super(fragmentManager);}

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position)
        {
            case 0:
                fragment= new IngreCholeBhature();
                break;
            case 1:
                fragment=new DirecCholeBhature();
                break;

        }
        return  fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
