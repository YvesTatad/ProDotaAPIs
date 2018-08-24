package com.sombright.vizix.prodotaapis.detailedmatch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class League {

    @SerializedName("leagueid")
    @Expose
    private Long leagueid;
    @SerializedName("ticket")
    @Expose
    private String ticket;
    @SerializedName("banner")
    @Expose
    private String banner;
    @SerializedName("tier")
    @Expose
    private String tier;
    @SerializedName("name")
    @Expose
    private String name;

    public Long getLeagueid() {
        return leagueid;
    }

    public void setLeagueid(Long leagueid) {
        this.leagueid = leagueid;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}