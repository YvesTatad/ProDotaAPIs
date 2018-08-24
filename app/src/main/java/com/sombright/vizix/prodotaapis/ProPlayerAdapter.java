package com.sombright.vizix.prodotaapis;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.Date;
import java.util.List;

public class ProPlayerAdapter extends ArrayAdapter<ProPlayerGsonViewer> {

    public ProPlayerAdapter(Context context, List<ProPlayerGsonViewer> players){
        super(context, 0, players);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.pro_player_list_item, parent, false);
        }

        ProPlayerGsonViewer currentPlayer = getItem(position);

        ImageView avatarImage = (ImageView) listItemView.findViewById(R.id.avatar_image);

        String playerAvatar = currentPlayer.getAvatarfull();

        if (null == playerAvatar){
        Picasso.get()
                .load(R.drawable.default_avatar)
                .fit()
                .centerCrop()
                .into(avatarImage);}
        else{
            Picasso.get()
                    .load(playerAvatar)
                    .fit()
                    .centerCrop()
                    .into(avatarImage);}

        CardView playerContainer = listItemView.findViewById(R.id.MainDisplayCard);
        boolean isPlayerPro = currentPlayer.getIsPro();

        if (isPlayerPro){
            playerContainer.setVisibility(View.VISIBLE);
        }
        else if (!isPlayerPro){
            playerContainer.setVisibility(View.GONE);
        }

        String steamName = currentPlayer.getPersonaname();
        TextView personaNameView = (TextView) listItemView.findViewById(R.id.personanameText);
        if (null == steamName){
            personaNameView.setText("Steam Name Invalid");
        }

        else{
            personaNameView.setText(steamName);
        }

        TextView accountIdView = (TextView) listItemView.findViewById(R.id.account_idText);
        accountIdView.setText("Account ID: " + currentPlayer.getAccountId().toString());

        String steamId = currentPlayer.getSteamid();
        TextView steamIdView = (TextView) listItemView.findViewById(R.id.steamidText);
        if (null == steamId){
            steamIdView.setText("Steam ID Invalid");
        }

        else{
            steamIdView.setText("Steam ID: " + steamId);
        }

        String profileURL = currentPlayer.getProfileurl();
        TextView profileUrlView = (TextView) listItemView.findViewById(R.id.profileurlText);
        if (null == profileURL){
            profileUrlView.setText("Profile URL: Unknown");
        }

        else{
            profileUrlView.setText("Profile URL: " + profileURL);
        }

        TextView nameView = (TextView) listItemView.findViewById(R.id.verifiednameText);
        nameView.setText("Verified Name: " + currentPlayer.getName());

        String locationCountryCode = currentPlayer.getLoccountrycode();
        TextView locCountryCodeView = (TextView) listItemView.findViewById(R.id.loccountrycodeText);
        if (null == locationCountryCode){
            locCountryCodeView.setText("Location Country Code: Unknown");
        }

        else{
            locCountryCodeView.setText("Location Country Code: " + locationCountryCode);
        }

        String teamName = currentPlayer.getTeamName();
        TextView teamNameView = (TextView) listItemView.findViewById(R.id.team_nameText);
        if(null == teamName){
            teamNameView.setText("Player has no Team associated to them");
            teamNameView.setTextColor(Color.parseColor("#ef0b0b"));
        }
        else{
            teamNameView.setText("Team Name: " + teamName);
            teamNameView.setTextColor(Color.parseColor("#222222"));
        }

        String teamTag = currentPlayer.getTeamTag();
        TextView teamTagView = (TextView) listItemView.findViewById(R.id.team_tagText);

        if(null == teamTag){
            teamTagView.setText("No Team Tag");
            teamTagView.setTextColor(Color.parseColor("#ef0b0b"));
        }
        else{
            teamTagView.setText("Tag: " + teamTag);
            teamTagView.setTextColor(Color.parseColor("#222222"));
        }

        Integer teamId = currentPlayer.getTeamId();
        TextView teamIdView = (TextView) listItemView.findViewById(R.id.team_idText);
        if(teamId == 0){
            teamIdView.setText(" | No Team ID");
            teamIdView.setTextColor(Color.parseColor("#ef0b0b"));
        }
        else{
            teamIdView.setText(" | Team ID: " + teamId.toString());
            teamIdView.setTextColor(Color.parseColor("#222222"));
        }

        int playerRole = currentPlayer.getFantasyRole();
        TextView fantasyRoleView = (TextView) listItemView.findViewById(R.id.fantasy_roleText);

        if (playerRole == 1) {
            fantasyRoleView.setText("Role: Core");
        }

        if (playerRole == 2) {
            fantasyRoleView.setText("Role: Support");
        }

        if (playerRole == 0) {
            fantasyRoleView.setText("Role: Unknown");
        }

        TextView cheeseView = (TextView) listItemView.findViewById(R.id.cheeseText);
        cheeseView.setText("Donated to OpenDota: " + currentPlayer.getCheese());

        return listItemView;
    }
}
