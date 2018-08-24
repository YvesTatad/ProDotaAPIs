package com.sombright.vizix.prodotaapis;

import android.content.AsyncTaskLoader;
import android.content.Context;

import com.sombright.vizix.prodotaapis.detailedmatch.MatchDetailsGsonViewer;

import java.util.List;

public class MatchDetailsLoader extends AsyncTaskLoader<MatchDetailsGsonViewer> {
    private static final String LOG_TAG = MatchDetailsLoader.class.getName();
    private String mUrl;
    public MatchDetailsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public MatchDetailsGsonViewer loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        MatchDetailsGsonViewer matchDetails = MatchDetailsQueryUtils.fetchMatchDetailsData(mUrl);
        return matchDetails;
    }
}
