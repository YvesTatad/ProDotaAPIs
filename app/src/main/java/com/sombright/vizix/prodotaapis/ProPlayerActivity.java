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

public class ProPlayerActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<ProPlayerGsonViewer>> {
    private static final int PLAYER_LOADER_ID = 1;
    private ProPlayerAdapter mAdapter;
    public static final String LOG_TAG = ProPlayerActivity.class.getName();
    private static final String PRO_PLAYER_API_URL = "https://api.opendota.com/api/proPlayers";
    private TextView mEmptyStateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro_player);

        ListView playerListView = (ListView) findViewById(R.id.list);

        mAdapter = new ProPlayerAdapter(this, new ArrayList<ProPlayerGsonViewer>());
        mEmptyStateTextView = (TextView) findViewById(R.id.empty_view);
        playerListView.setEmptyView(mEmptyStateTextView);
        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        playerListView.setAdapter(mAdapter);

//        playerListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                // Find the current earthquake that was clicked on
//                ProPlayers currentPlayer = mAdapter.getItem(position);
//
//                // Convert the String URL into a URI object (to pass into the Intent constructor)
//                Uri playerUri = Uri.parse(currentPlayer.getUrl());
//
//                // Create a new intent to view the earthquake URI
//                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, playerUri);
//
//                // Send the intent to launch a new activity
//                startActivity(websiteIntent);
//            }
//        });

        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);

        // Get details on the currently active default data network
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();

        if (networkInfo != null && networkInfo.isConnected()) {
            LoaderManager loaderManager = getLoaderManager();

            loaderManager.initLoader(PLAYER_LOADER_ID, null, this);
        } else {
            View loadingIndicator = findViewById(R.id.loading_indicator);
            loadingIndicator.setVisibility(View.GONE);
            mEmptyStateTextView.setText("No Internet Connection");
        }
    }

    @Override
    public Loader<List<ProPlayerGsonViewer>> onCreateLoader(int i, Bundle bundle) {

        Uri baseUri = Uri.parse(PRO_PLAYER_API_URL);
//        Uri.Builder uriBuilder = baseUri.buildUpon();

//        uriBuilder.appendQueryParameter("format", "geojson");
//        uriBuilder.appendQueryParameter("limit", "10");
//        uriBuilder.appendQueryParameter("minmag", minMagnitude);
//        uriBuilder.appendQueryParameter("orderby", orderBy);

        return new ProPlayerLoader(this, baseUri.toString());
    }

    @Override
    public void onLoadFinished(Loader<List<ProPlayerGsonViewer>> loader, List<ProPlayerGsonViewer> players) {
        // Hide loading indicator because the data has been loaded
        View loadingIndicator = findViewById(R.id.loading_indicator);
        loadingIndicator.setVisibility(View.GONE);

        // Set empty state text to display "No earthquakes found."
        mEmptyStateTextView.setText("No Players Found");

        // Clear the adapter of previous earthquake data
        mAdapter.clear();

        if (players != null && !players.isEmpty()) {
            mAdapter.addAll(players);
        }
    }

    @Override
    public void onLoaderReset(Loader<List<ProPlayerGsonViewer>> loader) {
        // Loader reset, so we can clear out our existing data.
        mAdapter.clear();
    }

}
