package com.sombright.vizix.prodotaapis;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

public class ProPlayerLoader extends AsyncTaskLoader<List<ProPlayerGsonViewer>> {
    private static final String LOG_TAG = ProPlayerLoader.class.getName();
    private String mUrl;
    public ProPlayerLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<ProPlayerGsonViewer> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<ProPlayerGsonViewer> proPlayers = QueryUtils.fetchPlayerData(mUrl);
        return proPlayers;
    }
}
