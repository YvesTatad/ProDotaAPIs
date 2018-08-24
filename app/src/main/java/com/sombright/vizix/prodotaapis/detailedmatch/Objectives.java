package com.sombright.vizix.prodotaapis.detailedmatch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Objectives {

    @SerializedName("time")
    @Expose
    private Long time;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("slot")
    @Expose
    private Long slot;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("player_slot")
    @Expose
    private Long playerSlot;
    @SerializedName("unit")
    @Expose
    private String unit;
    @SerializedName("team")
    @Expose
    private Long team;

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getSlot() {
        return slot;
    }

    public void setSlot(Long slot) {
        this.slot = slot;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Long getPlayerSlot() {
        return playerSlot;
    }

    public void setPlayerSlot(Long playerSlot) {
        this.playerSlot = playerSlot;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Long getTeam() {
        return team;
    }

    public void setTeam(Long team) {
        this.team = team;
    }

}