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
import android.widget.Button;
import android.widget.TextView;

import com.sombright.vizix.prodotaapis.detailedmatch.MatchDetailsGsonViewer;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MatchDetailsActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<MatchDetailsGsonViewer>{

    private static final int MATCH_DETAIL_LOADER_ID = 1;
    public static final String LOG_TAG = MatchDetailsActivity.class.getName();
    private static final String MATCH_DETAIL_API_BASE_URL = "https://api.opendota.com/api/matches/";
    private TextView mEmptyStateTextView;
    private String matchDetailApiNewUrl;
    private TextView matchResultView;
    private TextView matchIdView;
    private TextView gameModeView;
    private TextView dateView;
    private TextView regionView;
    private TextView durationView;
    private TextView firstBloodTimeView;
    private TextView leagueView;
    private TextView replayUrlView;
    private String matchIDToPass;
    private Button matchSummaryButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_detail);
        //TODO: Re-implement the following when I learn more about fragments
        //TODO: (3) Check for where to place Loader methods, etc.
        //TODO: (2) Check for where to place URL, Intent from match List Item, and for how to receive the intent for both tabs
        //TODO: (1) Replace if/else with switch/case for Game Mode and Region
//        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
//        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());
//        viewPager.setAdapter(adapter);
//        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(viewPager);

        matchSummaryButton = (Button) findViewById(R.id.summaryButton);
        matchSummaryButton.setVisibility(View.GONE);
        matchSummaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent summaryIntent = new Intent(MatchDetailsActivity.this, MatchSummaryActivity.class);
                summaryIntent.putExtra("matchIdPass", matchIDToPass);
                startActivity(summaryIntent);
            }
        });

        mEmptyStateTextView = (TextView) findViewById(R.id.empty_view);

        String matchId = getIntent().getStringExtra("matchIdPass");

        matchDetailApiNewUrl = MATCH_DETAIL_API_BASE_URL + matchId;

        matchResultView = (TextView) findViewById(R.id.matchResultDataText);
        matchIdView = (TextView) findViewById(R.id.matchIdDataText);
        gameModeView = (TextView) findViewById(R.id.gameModeDataText);
        dateView = (TextView) findViewById(R.id.dateDataText);
        regionView = (TextView) findViewById(R.id.regionDataText);
        durationView = (TextView) findViewById(R.id.durationDataText);
        firstBloodTimeView = (TextView) findViewById(R.id.firstBloodTimeDataText);
        leagueView = (TextView) findViewById(R.id.leagueDataText);
        replayUrlView = (TextView) findViewById(R.id.replayUrlDataText);

        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);

        // Get details on the currently active default data network
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
        // Hide loading indicator because the data has been loaded
        View loadingIndicator = findViewById(R.id.loading_indicator);
        loadingIndicator.setVisibility(View.GONE);

        mEmptyStateTextView.setText("No Matches Details Found");

        Boolean matchResult = matchDetails.getRadiantWin();
        String matchId = matchDetails.getMatchId().toString();
        Long gameMode = matchDetails.getGameMode();
        matchIDToPass = matchId;
        Long date = matchDetails.getStartTime();
        Long properDate = date * 1000;
        Date dateObject = new Date(properDate);
        String formattedDate = formatDate(dateObject);

        Long region = matchDetails.getRegion();

        Long durationInSecs = (matchDetails.getDuration());
        Long durationInMillis = durationInSecs * 1000;
        Time durationObject = new Time(durationInMillis);
        String formattedDurationTime = formatDuration(durationObject);

        Long firstBloodTimeInSecs = (matchDetails.getFirstBloodTime());
        Long firstBloodTimeInMillis = firstBloodTimeInSecs * 1000;
        Time firstBloodTimeObject = new Time(firstBloodTimeInMillis);
        String formattedFirstBloodTime = formatDuration(firstBloodTimeObject);

        String league_name = matchDetails.getLeague().getName();

        String replayUrl = matchDetails.getReplayUrl();

        if(matchResult){
            matchResultView.setText("Radiant Victory!");
        }
        else{
            matchResultView.setText("Dire Victory!");
        }


        matchIdView.setText(matchId);


        if(gameMode == 1){
            gameModeView.setText("All Pick");
        }
        else if(gameMode == 2){
            gameModeView.setText("Captains Mode");
        }
        else if(gameMode == 3){
            gameModeView.setText("Random Draft");
        }
        else if(gameMode == 4){
            gameModeView.setText("Single Draft");
        }
        else if(gameMode == 5){
            gameModeView.setText("All Random");
        }
        else if(gameMode == 6){
            gameModeView.setText("Intro");
        }
        else if(gameMode == 7){
            gameModeView.setText("Diretide");
        }
        else if(gameMode == 8){
            gameModeView.setText("Reverse Captains Mode");
        }
        else if(gameMode == 9){
            gameModeView.setText("Greeviling");
        }
        else if(gameMode == 10){
            gameModeView.setText("Tutorial");
        }
        else if(gameMode == 11){
            gameModeView.setText("Mid Only");
        }
        else if(gameMode == 12){
            gameModeView.setText("Least Played");
        }
        else if(gameMode == 13){
            gameModeView.setText("Limited Heroes");
        }
        else if(gameMode == 14){
            gameModeView.setText("Compendium Matchmaking");
        }
        else if(gameMode == 15){
            gameModeView.setText("Custom");
        }
        else if(gameMode == 16){
            gameModeView.setText("Captains Draft");
        }
        else if(gameMode == 17){
            gameModeView.setText("Balanced Draft");
        }
        else if(gameMode == 18){
            gameModeView.setText("Ability Draft");
        }
        else if(gameMode == 19){
            gameModeView.setText("Event");
        }
        else if(gameMode == 20){
            gameModeView.setText("All Random Death Match");
        }
        else if(gameMode == 21){
            gameModeView.setText("1v1 Mid");
        }
        else if(gameMode == 22){
            gameModeView.setText("All Draft");
        }
        else if(gameMode == 23){
            gameModeView.setText("Turbo");
        }
        else if(gameMode == 24){
            gameModeView.setText("Mutation");
        }
        else{
            gameModeView.setText("Unknown");
        }


        dateView.setText(formattedDate);



        if(region == 0){
            regionView.setText("US West");
        }
        else if(region == 1){
            regionView.setText("US East");
        }
        else if(region == 2){
            regionView.setText("Europe West");
        }
        else if(region == 3){
            regionView.setText("Europe East");
        }
        else if(region == 4){
            regionView.setText("Russia");
        }
        else if(region == 5){
            regionView.setText("SE Asia");
        }
        else if(region == 6){
            regionView.setText("Australia");
        }
        else if(region == 7){
            regionView.setText("South America");
        }
        else if(region == 8){
            regionView.setText("Dubai");
        }
        else if(region == 9){
            regionView.setText("Chile");
        }
        else if(region == 10){
            regionView.setText("Peru");
        }
        else if(region == 11){
            regionView.setText("South Africa");
        }
        else if(region == 12){
            regionView.setText("India");
        }
        else if(region == 13){
            regionView.setText("Japan");
        }
        else if(region == 14){
            regionView.setText("China UC");
        }
        else if(region == 15){
            regionView.setText("China UC 2");
        }
        else if(region == 16){
            regionView.setText("China TC Shanghai");
        }
        else if(region == 17){
            regionView.setText("China TC Zhejiang");
        }
        else if(region == 18){
            regionView.setText("China TC Wuhan");
        }
        else{
            regionView.setText("Unknown");
        }

        durationView.setText(formattedDurationTime);

        firstBloodTimeView.setText(formattedFirstBloodTime);

        leagueView.setText(league_name);

        replayUrlView.setText(replayUrl);

        matchSummaryButton.setVisibility(View.VISIBLE);
//        if (matchDetails != null) {
//
//        }
    }

    @Override
    public void onLoaderReset(Loader<MatchDetailsGsonViewer> loader) {
    }

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy, HH:mm");
        return dateFormat.format(dateObject);
    }

    private String formatDuration(Time durationObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("mm:ss");
        return timeFormat.format(durationObject);
    }

}
