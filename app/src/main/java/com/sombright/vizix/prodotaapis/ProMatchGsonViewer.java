
package com.sombright.vizix.prodotaapis;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProMatchGsonViewer {

    @SerializedName("match_id")
    @Expose
    private Long matchId;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("start_time")
    @Expose
    private Integer startTime;
    @SerializedName("radiant_team_id")
    @Expose
    private Integer radiantTeamId;
    @SerializedName("radiant_name")
    @Expose
    private String radiantName;
    @SerializedName("dire_team_id")
    @Expose
    private Integer direTeamId;
    @SerializedName("dire_name")
    @Expose
    private String direName;
    @SerializedName("leagueid")
    @Expose
    private Integer leagueid;
    @SerializedName("league_name")
    @Expose
    private String leagueName;
    @SerializedName("series_id")
    @Expose
    private Integer seriesId;
    @SerializedName("series_type")
    @Expose
    private Integer seriesType;
    @SerializedName("radiant_score")
    @Expose
    private Integer radiantScore;
    @SerializedName("dire_score")
    @Expose
    private Integer direScore;
    @SerializedName("radiant_win")
    @Expose
    private Boolean radiantWin;

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getRadiantTeamId() {
        return radiantTeamId;
    }

    public void setRadiantTeamId(Integer radiantTeamId) {
        this.radiantTeamId = radiantTeamId;
    }

    public String getRadiantName() {
        return radiantName;
    }

    public void setRadiantName(String radiantName) {
        this.radiantName = radiantName;
    }

    public Integer getDireTeamId() {
        return direTeamId;
    }

    public void setDireTeamId(Integer direTeamId) {
        this.direTeamId = direTeamId;
    }

    public String getDireName() {
        return direName;
    }

    public void setDireName(String direName) {
        this.direName = direName;
    }

    public Integer getLeagueid() {
        return leagueid;
    }

    public void setLeagueid(Integer leagueid) {
        this.leagueid = leagueid;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public Integer getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    public Integer getSeriesType() {
        return seriesType;
    }

    public void setSeriesType(Integer seriesType) {
        this.seriesType = seriesType;
    }

    public Integer getRadiantScore() {
        return radiantScore;
    }

    public void setRadiantScore(Integer radiantScore) {
        this.radiantScore = radiantScore;
    }

    public Integer getDireScore() {
        return direScore;
    }

    public void setDireScore(Integer direScore) {
        this.direScore = direScore;
    }

    public Boolean getRadiantWin() {
        return radiantWin;
    }

    public void setRadiantWin(Boolean radiantWin) {
        this.radiantWin = radiantWin;
    }

}
