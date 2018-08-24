package com.sombright.vizix.prodotaapis;

import android.app.LoaderManager;
import android.content.Context;
import android.content.Intent;
import android.content.Loader;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ProMatchActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<ProMatchGsonViewer>> {

    private static final int MATCH_LOADER_ID = 1;
    private ProMatchAdapter mAdapter;
    public static final String LOG_TAG = ProMatchActivity.class.getName();
    private static final String PRO_MATCH_API_URL = "https://api.opendota.com/api/proMatches";
    private TextView mEmptyStateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro_match);

        ListView matchListView = (ListView) findViewById(R.id.list);

        mAdapter = new ProMatchAdapter(this, new ArrayList<ProMatchGsonViewer>());
        mEmptyStateTextView = (TextView) findViewById(R.id.empty_view);
        matchListView.setEmptyView(mEmptyStateTextView);
        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        matchListView.setAdapter(mAdapter);

        matchListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                ProMatchGsonViewer currentMatch = mAdapter.getItem(position);

                String matchIdString = currentMatch.getMatchId().toString();

                Intent matchIdIntent;
                matchIdIntent = new Intent(ProMatchActivity.this, MatchDetailsActivity.class);
                matchIdIntent.putExtra("matchIdPass", matchIdString);

                // Send the intent to launch a new activity
                startActivity(matchIdIntent);
            }
        });

        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);

        // Get details on the currently active default data network
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();

        if (networkInfo != null && networkInfo.isConnected()) {
            LoaderManager loaderManager = getLoaderManager();

            loaderManager.initLoader(MATCH_LOADER_ID, null, this);
        } else {
            View loadingIndicator = findViewById(R.id.loading_indicator);
            loadingIndicator.setVisibility(View.GONE);
            mEmptyStateTextView.setText("No Internet Connection");
        }
    }

    @Override
    public Loader<List<ProMatchGsonViewer>> onCreateLoader(int i, Bundle bundle) {

        Uri baseUri = Uri.parse(PRO_MATCH_API_URL);

        return new ProMatchLoader(this, baseUri.toString());
    }

    @Override
    public void onLoadFinished(Loader<List<ProMatchGsonViewer>> loader, List<ProMatchGsonViewer> matches) {
        // Hide loading indicator because the data has been loaded
        View loadingIndicator = findViewById(R.id.loading_indicator);
        loadingIndicator.setVisibility(View.GONE);

        // Set empty state text to display "No earthquakes found."
        mEmptyStateTextView.setText("No Matches Found");

        // Clear the adapter of previous earthquake data
        mAdapter.clear();

        // If there is a valid list of {@link Earthquake}s, then add them to the adapter's
        // data set. This will trigger the ListView to update.
        if (matches != null && !matches.isEmpty()) {
            mAdapter.addAll(matches);
        }
    }

    @Override
    public void onLoaderReset(Loader<List<ProMatchGsonViewer>> loader) {
        // Loader reset, so we can clear out our existing data.
        mAdapter.clear();
    }

}
