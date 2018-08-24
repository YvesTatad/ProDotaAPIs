
package com.sombright.vizix.prodotaapis.detailedmatch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DraftTiming {

    @SerializedName("order")
    @Expose
    private Long order;
    @SerializedName("pick")
    @Expose
    private Boolean pick;
    @SerializedName("active_team")
    @Expose
    private Long activeTeam;
    @SerializedName("hero_id")
    @Expose
    private Long heroId;
    @SerializedName("player_slot")
    @Expose
    private Long playerSlot;
    @SerializedName("extra_time")
    @Expose
    private Long extraTime;
    @SerializedName("total_time_taken")
    @Expose
    private Long totalTimeTaken;

    public Long getOrder() {
        return order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }

    public Boolean getPick() {
        return pick;
    }

    public void setPick(Boolean pick) {
        this.pick = pick;
    }

    public Long getActiveTeam() {
        return activeTeam;
    }

    public void setActiveTeam(Long activeTeam) {
        this.activeTeam = activeTeam;
    }

    public Long getHeroId() {
        return heroId;
    }

    public void setHeroId(Long heroId) {
        this.heroId = heroId;
    }

    public Long getPlayerSlot() {
        return playerSlot;
    }

    public void setPlayerSlot(Long playerSlot) {
        this.playerSlot = playerSlot;
    }

    public Long getExtraTime() {
        return extraTime;
    }

    public void setExtraTime(Long extraTime) {
        this.extraTime = extraTime;
    }

    public Long getTotalTimeTaken() {
        return totalTimeTaken;
    }

    public void setTotalTimeTaken(Long totalTimeTaken) {
        this.totalTimeTaken = totalTimeTaken;
    }

}
