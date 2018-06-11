package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Created by diegolopez on 11/27/17.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    private String url;

    public EarthquakeLoader(Context context, String url) {
        super(context);
        this.url = url;
    }

    @Override
    protected void onStartLoading() {
        Log.v("loader", "onStartLoading loader");
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        Log.v("loader", "loadInBackground loader");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return QueryUtils.fetchEarthquakeData(url);
    }
}
