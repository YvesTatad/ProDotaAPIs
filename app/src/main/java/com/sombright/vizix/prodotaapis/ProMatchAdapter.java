package com.sombright.vizix.prodotaapis;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.sql.Time;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class ProMatchAdapter extends ArrayAdapter<ProMatchGsonViewer> {

    public ProMatchAdapter(Context context, List<ProMatchGsonViewer> matches){
        super(context, 0, matches);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.pro_match_list_item, parent, false);
        }

        ProMatchGsonViewer currentMatch = getItem(position);

        CardView matchContainer = listItemView.findViewById(R.id.MainDisplayCard);
        ImageView mainDisplayBackground = listItemView.findViewById(R.id.MainDisplayBackground);
        ImageView radiantDisplayBackground = listItemView.findViewById(R.id.RadiantDisplayBackground);
        ImageView direDisplayBackground = listItemView.findViewById(R.id.RadiantDisplayBackground);

        TextView radiantView = listItemView.findViewById(R.id.radiantText);
        TextView direView = listItemView.findViewById(R.id.direText);
        TextView vsView = listItemView.findViewById(R.id.vsText);

        TextView matchIdView = (TextView) listItemView.findViewById(R.id.match_idText);
        matchIdView.setText("Match ID: " + currentMatch.getMatchId().toString());

//        DecimalFormat df = new DecimalFormat("##,##");
        Integer durationInSecs = (currentMatch.getDuration());
        Integer durationInMillis = durationInSecs * 1000;
        Time durationObject = new Time(durationInMillis);
        String formattedDurationTime = formatDuration(durationObject);
        TextView durationView = (TextView) listItemView.findViewById(R.id.durationText);
//        durationView.setText("Duration: " + formattedDurationTime);
        durationView.setText("Duration: " + formattedDurationTime);

        Long date = new Long(currentMatch.getStartTime());
        Long properDate = (date * 1000);
        Date dateObject = new Date(properDate);
        String formattedDate = formatDate(dateObject);
        TextView startTimeView = (TextView) listItemView.findViewById(R.id.start_timeText);
//        Time startTimeObject = new Time(currentMatch.getStartTime());
//        String formattedStartTime = formatTime(startTimeObject);
        // Display the date of the current earthquake in that TextView
//        startTimeView.setText(formattedDate);

//        startTimeView.setText("Start Time: " + currentMatch.getStartTime().toString());
        startTimeView.setText("Start Time: " + formattedDate);

        String radiantName = currentMatch.getRadiantName();
        String direName = currentMatch.getDireName();

        TextView radiantNameView = (TextView) listItemView.findViewById(R.id.radiant_team_nameText);
        if(null == radiantName){
            radiantNameView.setText("Team Name Unavailable");
        }
        else{
            radiantNameView.setText(radiantName);
        }


        TextView direNameView = (TextView) listItemView.findViewById(R.id.dire_team_nameText);
        if(null == direName){
            direNameView.setText("Name Unavailable");
        }
        else{
            direNameView.setText(direName);
        }
        TextView leagueIdView = (TextView) listItemView.findViewById(R.id.league_idText);
        leagueIdView.setText("League ID: " + currentMatch.getLeagueid());

        TextView leagueNameView = (TextView) listItemView.findViewById(R.id.league_nameText);
        leagueNameView.setText("League Name: " + currentMatch.getLeagueName());

        TextView seriesIdView = (TextView) listItemView.findViewById(R.id.series_idText);
        seriesIdView.setText("Series ID: " + currentMatch.getSeriesId());

        TextView seriesTypeView = (TextView) listItemView.findViewById(R.id.series_typeText);
        seriesTypeView.setText("Series Type: " + currentMatch.getSeriesType());

        TextView radiantScoreView = (TextView) listItemView.findViewById(R.id.radiant_killsText);
        radiantScoreView.setText("Kills: " + currentMatch.getRadiantScore().toString());

        TextView direScoreView = (TextView) listItemView.findViewById(R.id.dire_killsText);
        direScoreView.setText("Kills: " + currentMatch.getDireScore().toString());

        TextView winResultView = (TextView) listItemView.findViewById(R.id.victory_resultText);
        boolean victoryResult = currentMatch.getRadiantWin();

        if (victoryResult){
            winResultView.setText("RADIANT VICTORY!");

            Picasso.get()
                    .load(R.drawable.radiant_icon2)
                    .fit()
                    .centerCrop()
                    .into(mainDisplayBackground);

//            Picasso.get()
//                    .load(R.drawable.radiant_icon)
//                    .resize(150, 90)
//                    .centerCrop()
//                    .into(radiantDisplayBackground);

            matchIdView.setTextColor(Color.parseColor("#000000"));
            durationView.setTextColor(Color.parseColor("#000000"));
            startTimeView.setTextColor(Color.parseColor("#000000"));
            radiantNameView.setTextColor(Color.parseColor("#000000"));
            direNameView.setTextColor(Color.parseColor("#000000"));
            leagueIdView.setTextColor(Color.parseColor("#000000"));
            leagueNameView.setTextColor(Color.parseColor("#000000"));
            seriesIdView.setTextColor(Color.parseColor("#000000"));
            seriesTypeView.setTextColor(Color.parseColor("#000000"));
            radiantScoreView.setTextColor(Color.parseColor("#000000"));
            direScoreView.setTextColor(Color.parseColor("#000000"));
            winResultView.setTextColor(Color.parseColor("#000000"));
            direView.setTextColor(Color.parseColor("#000000"));
            radiantView.setTextColor(Color.parseColor("#000000"));
            vsView.setTextColor(Color.parseColor("#000000"));
        }

        else if (!victoryResult){
            winResultView.setText("DIRE VICTORY!");
            Picasso.get()
                    .load(R.drawable.dire_icon2)
                    .fit()
                    .centerCrop()
                    .into(mainDisplayBackground);

//            Picasso.get()
//                    .load(R.drawable.dire_icon)
//                    .resize(150, 90)
//                    .centerCrop()
//                    .into(direDisplayBackground);

            matchIdView.setTextColor(Color.parseColor("#FFFFFF"));
            durationView.setTextColor(Color.parseColor("#FFFFFF"));
            startTimeView.setTextColor(Color.parseColor("#FFFFFF"));
            radiantNameView.setTextColor(Color.parseColor("#FFFFFF"));
            direNameView.setTextColor(Color.parseColor("#FFFFFF"));
            leagueIdView.setTextColor(Color.parseColor("#FFFFFF"));
            leagueNameView.setTextColor(Color.parseColor("#FFFFFF"));
            seriesIdView.setTextColor(Color.parseColor("#FFFFFF"));
            seriesTypeView.setTextColor(Color.parseColor("#FFFFFF"));
            radiantScoreView.setTextColor(Color.parseColor("#FFFFFF"));
            direScoreView.setTextColor(Color.parseColor("#FFFFFF"));
            winResultView.setTextColor(Color.parseColor("#FFFFFF"));
            direView.setTextColor(Color.parseColor("#FFFFFF"));
            radiantView.setTextColor(Color.parseColor("#FFFFFF"));
            vsView.setTextColor(Color.parseColor("#FFFFFF"));
        }

        return listItemView;
    }

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy, HH:mm");
        return dateFormat.format(dateObject);
    }

    private String formatTime(Time timeObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        return timeFormat.format(timeObject);
    }

//    private String formatDuration (Time durationObject){
//        DecimalFormat df = new DecimalFormat("##:##");
//        return df.format(durationObject);
//    }

    private String formatDuration(Time durationObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("mm:ss");
        return timeFormat.format(durationObject);
    }

//    public static float convertPixelsToDp(float px, Context context){
//        Resources resources = context.getResources();
//        DisplayMetrics metrics = resources.getDisplayMetrics();
//        float dp = px / ((float)metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
//        return dp;
//    }

}
