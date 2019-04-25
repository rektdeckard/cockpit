package com.tobiasfried.cockpiticons.activities;

import android.support.annotation.NonNull;

import com.dm.material.dashboard.candybar.activities.CandyBarMuzeiActivity;
import com.tobiasfried.cockpiticons.services.MuzeiService;

public class MuzeiActivity extends CandyBarMuzeiActivity {

    @NonNull
    @Override
    public Class<?> onInit() {
        return MuzeiService.class;
    }
}
