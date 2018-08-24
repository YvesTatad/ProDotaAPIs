//package com.sombright.vizix.prodotaapis;
//
//import android.content.Context;
//import android.net.Uri;
//import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import com.sombright.vizix.prodotaapis.detailedmatch.MatchDetailsGsonViewer;
//
//import java.sql.Time;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class MatchDetailsFragment extends Fragment {
//    private static final int MATCH_DETAIL_LOADER_ID = 1;
//    public static final String LOG_TAG = MatchDetailsFragment.class.getName();
//    private static final String MATCH_DETAIL_API_URL = "https://api.opendota.com/api/matches/4056022979";
//    private TextView mEmptyStateTextView;
//    public MatchDetailsFragment() {
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//
//        View rootView = inflater.inflate(R.layout.fragment_match_detail, container, false);
//
//        mEmptyStateTextView = (TextView) rootView.findViewById(R.id.empty_view);
//
//        MatchDetailsGsonViewer matchDetails = MatchDetailsQueryUtils.extractMatchDetailsFromJson(this);
//
//        TextView matchResultView = (TextView) rootView.findViewById(R.id.matchResultDataText);
//        TextView matchIdView = (TextView) rootView.findViewById(R.id.matchIdDataText);
//        TextView gameModeView = (TextView) rootView.findViewById(R.id.gameModeDataText);
//        TextView dateView = (TextView) rootView.findViewById(R.id.dateDataText);
//        TextView regionView = (TextView) rootView.findViewById(R.id.regionDataText);
//        TextView durationView = (TextView) rootView.findViewById(R.id.durationDataText);
//        TextView firstBloodTimeView = (TextView) rootView.findViewById(R.id.firstBloodTimeDataText);
//        TextView leagueView = (TextView) rootView.findViewById(R.id.leagueDataText);
//
//        Boolean matchResult = matchDetails.getRadiantWin();
//        if(matchResult){
//            matchResultView.setText("Radiant Victory!");
//        }
//        else{
//            matchResultView.setText("Dire Victory!");
//        }
//
//        matchIdView.setText(matchDetails.getMatchId().toString());
//        //TODO: (3) Check for where to place Loader methods, etc.
//        //TODO: (2) Check for where to place URL, Intent from match List Item, and for how to receive the intent for both tabs
//        //TODO: (1) Replace if/else with switch/case for Game Mode
//
//        Long gameMode = matchDetails.getGameMode();
//
//        if(gameMode == 1){
//            gameModeView.setText("All Pick");
//        }
//        else if(gameMode == 2){
//            gameModeView.setText("Captains Mode");
//        }
//        else if(gameMode == 3){
//            gameModeView.setText("Random Draft");
//        }
//        else if(gameMode == 4){
//            gameModeView.setText("Single Draft");
//        }
//        else if(gameMode == 5){
//            gameModeView.setText("All Random");
//        }
//        else if(gameMode == 6){
//            gameModeView.setText("Intro");
//        }
//        else if(gameMode == 7){
//            gameModeView.setText("Diretide");
//        }
//        else if(gameMode == 8){
//            gameModeView.setText("Reverse Captains Mode");
//        }
//        else if(gameMode == 9){
//            gameModeView.setText("Greeviling");
//        }
//        else if(gameMode == 10){
//            gameModeView.setText("Tutorial");
//        }
//        else if(gameMode == 11){
//            gameModeView.setText("Mid Only");
//        }
//        else if(gameMode == 12){
//            gameModeView.setText("Least Played");
//        }
//        else if(gameMode == 13){
//            gameModeView.setText("Limited Heroes");
//        }
//        else if(gameMode == 14){
//            gameModeView.setText("Compendium Matchmaking");
//        }
//        else if(gameMode == 15){
//            gameModeView.setText("Custom");
//        }
//        else if(gameMode == 16){
//            gameModeView.setText("Captains Draft");
//        }
//        else if(gameMode == 17){
//            gameModeView.setText("Balanced Draft");
//        }
//        else if(gameMode == 18){
//            gameModeView.setText("Ability Draft");
//        }
//        else if(gameMode == 19){
//            gameModeView.setText("Event");
//        }
//        else if(gameMode == 20){
//            gameModeView.setText("All Random Death Match");
//        }
//        else if(gameMode == 21){
//            gameModeView.setText("1v1 Mid");
//        }
//        else if(gameMode == 22){
//            gameModeView.setText("All Draft");
//        }
//        else if(gameMode == 23){
//            gameModeView.setText("Turbo");
//        }
//        else if(gameMode == 24){
//            gameModeView.setText("Mutation");
//        }
//        else{
//            gameModeView.setText("Unknown");
//        }
//
//        Long date = matchDetails.getStartTime();
//        Date dateObject = new Date(date);
//        String formattedDate = formatDate(dateObject);
//        dateView.setText("Start Time: " + formattedDate);
//
//        Long region = matchDetails.getRegion();
//
//        if(region == 0){
//            regionView.setText("US West");
//        }
//        else if(region == 1){
//            regionView.setText("US East");
//        }
//        else if(region == 2){
//            regionView.setText("Europe West");
//        }
//        else if(region == 3){
//            regionView.setText("Europe East");
//        }
//        else if(region == 4){
//            regionView.setText("Russia");
//        }
//        else if(region == 5){
//            regionView.setText("SE Asia");
//        }
//        else if(region == 6){
//            regionView.setText("Australia");
//        }
//        else if(region == 7){
//            regionView.setText("South America");
//        }
//        else if(region == 8){
//            regionView.setText("Dubai");
//        }
//        else if(region == 9){
//            regionView.setText("Chile");
//        }
//        else if(region == 10){
//            regionView.setText("Peru");
//        }
//        else if(region == 11){
//            regionView.setText("South Africa");
//        }
//        else if(region == 12){
//            regionView.setText("India");
//        }
//        else if(region == 13){
//            regionView.setText("Japan");
//        }
//        else if(region == 14){
//            regionView.setText("China UC");
//        }
//        else if(region == 15){
//            regionView.setText("China UC 2");
//        }
//        else if(region == 16){
//            regionView.setText("China TC Shanghai");
//        }
//        else if(region == 17){
//            regionView.setText("China TC Zhejiang");
//        }
//        else if(region == 18){
//            regionView.setText("China TC Wuhan");
//        }
//        else{
//            regionView.setText("Unknown");
//        }
//
//        Long durationInSecs = (matchDetails.getDuration());
//        Long durationInMillis = durationInSecs * 1000;
//        Time durationObject = new Time(durationInMillis);
//        String formattedDurationTime = formatDuration(durationObject);
//        durationView.setText("Duration: " + formattedDurationTime);
//
//        Long firstBloodTimeInSecs = (matchDetails.getFirstBloodTime());
//        Long firstBloodTimeInMillis = firstBloodTimeInSecs * 1000;
//        Time firstBloodTimeObject = new Time(firstBloodTimeInMillis);
//        String formattedFirstBloodTime = formatDuration(firstBloodTimeObject);
//        firstBloodTimeView.setText(formattedFirstBloodTime);
//
//        leagueView.setText(matchDetails.getLeague().getName());
//
//        return rootView;
//    }
//
//    private String formatDate(Date dateObject) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM DD, YYYY, HH:mm");
//        return dateFormat.format(dateObject);
//    }
//
//    private String formatDuration(Time durationObject) {
//        SimpleDateFormat timeFormat = new SimpleDateFormat("mm:ss");
//        return timeFormat.format(durationObject);
//    }
//
//
//}
