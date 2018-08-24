package com.sombright.vizix.prodotaapis;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

public class ProMatchLoader extends AsyncTaskLoader<List<ProMatchGsonViewer>> {
    private static final String LOG_TAG = ProMatchLoader.class.getName();
    private String mUrl;
    public ProMatchLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<ProMatchGsonViewer> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<ProMatchGsonViewer> proMatches = MatchQueryUtils.fetchMatchData(mUrl);
        return proMatches;
    }
}
