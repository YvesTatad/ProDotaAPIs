package com.sombright.vizix.prodotaapis;

import android.app.LoaderManager;
import android.content.Context;
import android.content.Loader;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.sombright.vizix.prodotaapis.detailedmatch.MatchDetailsGsonViewer;
import com.sombright.vizix.prodotaapis.detailedmatch.Player;
import com.squareup.picasso.Picasso;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class MatchSummaryActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<MatchDetailsGsonViewer> {

    private static final int MATCH_DETAIL_LOADER_ID = 1;
//    private DireHeroAdapter dHAdapter;
    private PlayerHeroAdapter rHAdapter;
    public static final String LOG_TAG = MatchSummaryActivity.class.getName();
    private static final String MATCH_DETAIL_API_BASE_URL = "https://api.opendota.com/api/matches/";
    private TextView mEmptyStateTextView;
    private String matchDetailApiNewUrl;
    private TextView resultTextView;
    private TextView lobbyAndGameModeTextView;
    private ImageView winningBanner;
    private TextView teamKillsAndDurationTextView;
    private TextView direTeamAndNameView;
    private TextView radiantTeamAndNameView;
    private RelativeLayout bannerOutlineView;
    private ListView playerListView;
//    private ListView direPlayerListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_summary);

        mEmptyStateTextView = (TextView) findViewById(R.id.empty_view);

        String matchId = getIntent().getStringExtra("matchIdPass");

        matchDetailApiNewUrl = MATCH_DETAIL_API_BASE_URL + matchId;

        bannerOutlineView = findViewById(R.id.bannerOutline);
        bannerOutlineView.setVisibility(View.INVISIBLE);
        resultTextView = findViewById(R.id.matchResultText);
        lobbyAndGameModeTextView = findViewById(R.id.lobbyAndGameModeText);
        winningBanner = findViewById(R.id.victoryBanner);
        teamKillsAndDurationTextView = findViewById(R.id.killsAndDurationText);
        direTeamAndNameView = findViewById(R.id.direTeamAndName);
        radiantTeamAndNameView = findViewById(R.id.radiantTeamAndName);

        direTeamAndNameView.setVisibility(View.INVISIBLE);
        radiantTeamAndNameView.setVisibility(View.INVISIBLE);

        playerListView = (ListView) findViewById(R.id.radiant_list);
        rHAdapter = new PlayerHeroAdapter(this, new ArrayList<Player>());
        playerListView.setEmptyView(mEmptyStateTextView);
        playerListView.setAdapter(rHAdapter);

//        direPlayerListView = (ListView) findViewById(R.id.dire_list);
//        dHAdapter = new DireHeroAdapter(this, new ArrayList<Player>());
//        direPlayerListView.setEmptyView(mEmptyStateTextView);
//        direPlayerListView.setAdapter(dHAdapter);

        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();

        if (networkInfo != null && networkInfo.isConnected()) {
            LoaderManager loaderManager = getLoaderManager();

            loaderManager.initLoader(MATCH_DETAIL_LOADER_ID, null, this);
        } else {
            View loadingIndicator = findViewById(R.id.loading_indicator);
            loadingIndicator.setVisibility(View.GONE);
            mEmptyStateTextView.setText("No Internet Connection");
        }
    }

    @Override
    public Loader<MatchDetailsGsonViewer> onCreateLoader(int i, Bundle bundle) {

        Uri baseUri = Uri.parse(matchDetailApiNewUrl);

        return new MatchDetailsLoader(this, baseUri.toString());
    }

    @Override
    public void onLoadFinished(Loader<MatchDetailsGsonViewer> loader, MatchDetailsGsonViewer matchDetails) {
        View loadingIndicator = findViewById(R.id.loading_indicator);
        loadingIndicator.setVisibility(View.GONE);

        Boolean matchResult = matchDetails.getRadiantWin();

        Long lobbyType = matchDetails.getLobbyType();
        Long gameMode = matchDetails.getGameMode();

        //region LobbyValue
        String lobbyValue;
        if (lobbyType == 0) {
            lobbyValue = "Normal";
        } else if (lobbyType == 1) {
            lobbyValue = "Practice";
        } else if (lobbyType == 2) {
            lobbyValue = "Tournament";
        } else if (lobbyType == 3) {
            lobbyValue = "Tutorial";
        } else if (lobbyType == 4) {
            lobbyValue = "Coop Bots";
        } else if (lobbyType == 5) {
            lobbyValue = "Ranked Team MM";
        } else if (lobbyType == 6) {
            lobbyValue = "Ranked Solo MM";
        } else if (lobbyType == 7) {
            lobbyValue = "Ranked";
        } else if (lobbyType == 8) {
            lobbyValue = "1v1 Mid";
        } else if (lobbyType == 9) {
            lobbyValue = "Battle Cup";
        } else {
            lobbyValue = "Unknown";
        }
//endregion
        //region GameModeValue

        String gameModeValue;
        if (gameMode == 1) {
            gameModeValue = "All Pick";
        } else if (gameMode == 2) {
            gameModeValue = "Captains Mode";
        } else if (gameMode == 3) {
            gameModeValue = "Random Draft";
        } else if (gameMode == 4) {
            gameModeValue = "Single Draft";
        } else if (gameMode == 5) {
            gameModeValue = "All Random";
        } else if (gameMode == 6) {
            gameModeValue = "Intro";
        } else if (gameMode == 7) {
            gameModeValue = "Diretide";
        } else if (gameMode == 8) {
            gameModeValue = "Reverse Captains Mode";
        } else if (gameMode == 9) {
            gameModeValue = "Greeviling";
        } else if (gameMode == 10) {
            gameModeValue = "Tutorial";
        } else if (gameMode == 11) {
            gameModeValue = "Mid Only";
        } else if (gameMode == 12) {
            gameModeValue = "Least Played";
        } else if (gameMode == 13) {
            gameModeValue = "Limited Heroes";
        } else if (gameMode == 14) {
            gameModeValue = "Compendium Matchmaking";
        } else if (gameMode == 15) {
            gameModeValue = "Custom";
        } else if (gameMode == 16) {
            gameModeValue = "Captains Draft";
        } else if (gameMode == 17) {
            gameModeValue = "Balanced Draft";
        } else if (gameMode == 18) {
            gameModeValue = "Ability Draft";
        } else if (gameMode == 19) {
            gameModeValue = "Event";
        } else if (gameMode == 20) {
            gameModeValue = "All Random Death Match";
        } else if (gameMode == 21) {
            gameModeValue = "1v1 Mid";
        } else if (gameMode == 22) {
            gameModeValue = "All Draft";
        } else if (gameMode == 23) {
            gameModeValue = "Turbo";
        } else if (gameMode == 24) {
            gameModeValue = "Mutation";
        } else {
            gameModeValue = "Unknown";
        }
//endregion

        String radiantKills = matchDetails.getRadiantScore().toString();
        String direKills = matchDetails.getDireScore().toString();
        Long durationInSecs = (matchDetails.getDuration());
        Long durationInMillis = durationInSecs * 1000;
        Time durationObject = new Time(durationInMillis);
        String formattedDurationTime = formatDuration(durationObject);
        String radiantTeamName = matchDetails.getRadiantTeam().getName();
        String direTeamName = matchDetails.getDireTeam().getName();

        bannerOutlineView.setVisibility(View.VISIBLE);
        if (matchResult) {
            resultTextView.setText("RADIANT VICTORY!");
            Picasso.get()
                    .load(R.drawable.radiant_icon2)
                    .fit()
                    .centerCrop()
                    .into(winningBanner);
        } else if (!matchResult) {
            resultTextView.setText("DIRE VICTORY!");
            Picasso.get()
                    .load(R.drawable.dire_icon2)
                    .fit()
                    .centerCrop()
                    .into(winningBanner);
        }

        lobbyAndGameModeTextView.setText(lobbyValue + ", " + gameModeValue);

        teamKillsAndDurationTextView.setText(radiantKills + " - " + direKills + " / " + formattedDurationTime);

        direTeamAndNameView.setText("The Dire - " + direTeamName);
        radiantTeamAndNameView.setText("The Radiant - " + radiantTeamName);
        mEmptyStateTextView.setText("No Match Data Found");

        direTeamAndNameView.setVisibility(View.VISIBLE);
        radiantTeamAndNameView.setVisibility(View.VISIBLE);

//        dHAdapter.clear();
        rHAdapter.clear();

        if (matchDetails.getPlayers() != null && !matchDetails.getPlayers().isEmpty()) {
//            dHAdapter.addAll(matchDetails.getPlayers());
//            dHAdapter.notifyDataSetChanged();
            rHAdapter.addAll(matchDetails.getPlayers());
            rHAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onLoaderReset(Loader<MatchDetailsGsonViewer> loader) {
//        dHAdapter.clear();
        rHAdapter.clear();
    }

//    private String formatDate(Date dateObject) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy, HH:mm");
//        return dateFormat.format(dateObject);
//    }

    private String formatDuration(Time durationObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("mm:ss");
        return timeFormat.format(durationObject);
    }
}
