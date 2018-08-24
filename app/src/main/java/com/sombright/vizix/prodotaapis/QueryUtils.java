package com.sombright.vizix.prodotaapis;

import android.text.TextUtils;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static com.sombright.vizix.prodotaapis.ProPlayerActivity.LOG_TAG;

public final class QueryUtils {

    private QueryUtils() {
    }

    private static List<ProPlayerGsonViewer> extractPlayerFromJson(String playerJSON) {

//        if (TextUtils.isEmpty(playerJSON)) {
//            return null;
//        }
//
//
//        List<ProPlayers> players = new ArrayList<>();
//
//        try {
//
////            JSONObject baseJsonResponse = new JSONObject(playerJSON);
//
//            JSONArray playerArray = new JSONArray(playerJSON);
//
//            for (int i = 0; i < playerArray.length(); i++) {
//
//                JSONObject currentPlayer = playerArray.getJSONObject(i);
//
////                JSONObject properties = currentEarthquake.getJSONObject("properties");
//
//                int accountId = currentPlayer.getInt("account_id");
//                String steamId = currentPlayer.getString("steamid");
//                String avatar = currentPlayer.getString("avatar");
//                String avatarMedium = currentPlayer.getString("avatarmedium");
//                String avatarFull = currentPlayer.getString("avatarfull");
//                String profileUrl = currentPlayer.getString("profileurl");
//                String personaName = currentPlayer.getString("personaname");
//                String lastLogin = currentPlayer.getString("last_login");
//                String fullHistoryTime = currentPlayer.getString("full_history_time");
//                int cheese = currentPlayer.optInt("cheese");
//                Boolean fhUnavailable = currentPlayer.optBoolean("fh_unavailable");
//                String locCountryCode = currentPlayer.getString("loccountrycode");
//                String lastMatchTime = currentPlayer.getString("last_match_time");
//                String name = currentPlayer.getString("name");
//                String countryCode = currentPlayer.getString("country_code");
//                int fantasyRole = currentPlayer.getInt("fantasy_role");
//                int teamId = currentPlayer.optInt("team_id");
//                String teamName = currentPlayer.getString("team_name");
//                String teamTag = currentPlayer.getString("team_tag");
//                Boolean isLocked = currentPlayer.getBoolean("is_locked");
//                Boolean isPro = currentPlayer.getBoolean("is_pro");
//                int lockedUntil = currentPlayer.optInt("locked_until");
//
//                ProPlayers player = new ProPlayers(accountId, steamId, avatar, avatarMedium, avatarFull
//                , profileUrl, personaName, lastLogin, fullHistoryTime
//                        , cheese
//                        , fhUnavailable
//                        , locCountryCode
//                , lastMatchTime
//                        , name, countryCode
//                        , fantasyRole, teamId
//                        , teamName, teamTag
//                        , isLocked, isPro, lockedUntil
//                );
//
//                players.add(player);
//            }
//
//        } catch (JSONException e) {
//            // If an error is thrown when executing any of the above statements in the "try" block,
//            // catch the exception here, so the app doesn't crash. Print a log message
//            // with the message from the exception.
//            Log.e("QueryUtils", "Problem parsing the Pro Player JSON results", e);
//        }
        Gson gson = new Gson();
        gson.fromJson(playerJSON, new TypeToken<List<ProPlayerGsonViewer>>(){}.getType());
        List<ProPlayerGsonViewer> players = gson.fromJson(playerJSON, new TypeToken<List<ProPlayerGsonViewer>>(){}.getType());
        return players;
    }
    /**
     * Returns new URL object from the given string URL.
     */
    private static URL createPlayerUrl(String stringUrl) {
        URL url = null;
        try {
            url = new URL(stringUrl);
        } catch (MalformedURLException e) {
            Log.e(LOG_TAG, "Problem building the URL ", e);
        }
        return url;
    }

    /**
     * Make an HTTP request to the given URL and return a String as the response.
     */
    private static String makeHttpRequest(URL url) throws IOException {
        String jsonResponse = "";

        // If the URL is null, then return early.
        if (url == null) {
            return jsonResponse;
        }

        HttpURLConnection urlConnection = null;
        InputStream inputStream = null;
        try {
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000 /* milliseconds */);
            urlConnection.setConnectTimeout(15000 /* milliseconds */);
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            // If the request was successful (response code 200),
            // then read the input stream and parse the response.
            if (urlConnection.getResponseCode() == 200) {
                inputStream = urlConnection.getInputStream();
                jsonResponse = readFromStream(inputStream);
            } else {
                Log.e(LOG_TAG, "Error response code: " + urlConnection.getResponseCode());
            }
        } catch (IOException e) {
            Log.e(LOG_TAG, "Problem retrieving the player JSON results.", e);
        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
            if (inputStream != null) {
                // Closing the input stream could throw an IOException, which is why
                // the makeHttpRequest(URL url) method signature specifies than an IOException
                // could be thrown.
                inputStream.close();
            }
        }
        return jsonResponse;
    }

    /**
     * Convert the {@link InputStream} into a String which contains the
     * whole JSON response from the server.
     */
    private static String readFromStream(InputStream inputStream) throws IOException {
        StringBuilder output = new StringBuilder();
        if (inputStream != null) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line = reader.readLine();
            while (line != null) {
                output.append(line);
                line = reader.readLine();
            }
        }
        return output.toString();
    }

    public static List<ProPlayerGsonViewer> fetchPlayerData(String requestUrl) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Create URL object
        URL url = createPlayerUrl(requestUrl);

        // Perform HTTP request to the URL and receive a JSON response back
        String jsonResponse = null;
        try {
            jsonResponse = makeHttpRequest(url);
        } catch (IOException e) {
            Log.e(LOG_TAG, "Problem making the HTTP request.", e);
        }

        // Extract relevant fields from the JSON response and create a list of {@link Earthquake}s
        List<ProPlayerGsonViewer> players = extractPlayerFromJson(jsonResponse);

        // Return the list of {@link Earthquake}s
        return players;
    }
}