package com.mcwilliams.template;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by joshuamcwilliams on 1/6/15.
 */
public class WeeklyAd extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.weekly_ad, null, false);
        Drawer.addView(contentView, 0);
    }
}
