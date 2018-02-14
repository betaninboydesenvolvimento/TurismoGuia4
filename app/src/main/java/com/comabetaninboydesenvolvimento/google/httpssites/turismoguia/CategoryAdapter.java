package com.comabetaninboydesenvolvimento.google.httpssites.turismoguia;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by lucas on 26/01/2018.
 */
class CategoryAdapter extends FragmentPagerAdapter {

    private final Context mContext;

    CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new SightFragment();
        } else
            return new NightFragment();
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.sight_tab_name);
            case 1:
                return mContext.getString(R.string.night_tab_name);
        }
        return mContext.getString(R.string.sight_tab_name);
    }
}