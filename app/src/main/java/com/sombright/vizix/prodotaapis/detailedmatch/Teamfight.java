
package com.sombright.vizix.prodotaapis.detailedmatch;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Teamfight {

    @SerializedName("start")
    @Expose
    private Long start;
    @SerializedName("end")
    @Expose
    private Long end;
    @SerializedName("last_death")
    @Expose
    private Long lastDeath;
    @SerializedName("deaths")
    @Expose
    private Long deaths;
    @SerializedName("players")
    @Expose
    private List<Player> players = null;

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Long getEnd() {
        return end;
    }

    public void setEnd(Long end) {
        this.end = end;
    }

    public Long getLastDeath() {
        return lastDeath;
    }

    public void setLastDeath(Long lastDeath) {
        this.lastDeath = lastDeath;
    }

    public Long getDeaths() {
        return deaths;
    }

    public void setDeaths(Long deaths) {
        this.deaths = deaths;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

}
