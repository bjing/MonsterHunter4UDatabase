package com.daviancorp.android.ui.list;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Menu;

import com.daviancorp.android.mh4udatabase.R;
import com.daviancorp.android.ui.general.GenericActivity;
import com.daviancorp.android.ui.list.adapter.MenuSection;

public class WeaponSelectionListActivity extends GenericActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.weapons);

        // Enable drawer button instead of back button
        super.enableDrawerIndicator();
    }

    @Override
    protected MenuSection getSelectedSection() {
        return MenuSection.WEAPONS;
    }

    @Override
    protected Fragment createFragment() {
        super.detail = new WeaponSelectionListFragment();
        return super.detail;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        return true;
    }

}
