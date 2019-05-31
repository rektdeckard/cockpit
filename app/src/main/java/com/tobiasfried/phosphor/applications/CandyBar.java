package com.tobiasfried.phosphor.applications;

import android.support.annotation.NonNull;

import com.dm.material.dashboard.candybar.applications.CandyBarApplication;

public class CandyBar extends CandyBarApplication {
    
    @NonNull
    @Override
    public Configuration onInit() {
        //Sample configuration
        Configuration configuration = new Configuration();

        configuration.setGenerateAppFilter(true);
        configuration.setGenerateAppMap(true);
        configuration.setGenerateThemeResources(true);
        configuration.setDashboardThemingEnabled(false);
        configuration.setHomeGridStyle(GridStyle.FLAT);
        configuration.setApplyGridStyle(GridStyle.FLAT);
        configuration.setWallpapersGridStyle(GridStyle.FLAT);
        configuration.setNavigationViewHeaderStyle(NavigationViewHeader.NONE);
        configuration.setShowTabAllIcons(true);
        configuration.setTabAllIconsTitle("All");


        return configuration;
    }
}
