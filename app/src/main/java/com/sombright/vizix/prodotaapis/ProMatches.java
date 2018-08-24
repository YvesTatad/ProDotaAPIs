package com.sombright.vizix.prodotaapis;

public class ProMatches {

    private Long matchId;
    private Integer duration;
    private Integer startTime;
    private Integer radiantTeamId;
    private String radiantName;
    private Integer direTeamId;
    private String direName;
    private Integer leagueid;
    private String leagueName;
    private Integer seriesId;
    private Integer seriesType;
    private Integer radiantScore;
    private Integer direScore;
    private Boolean radiantWin;

    public ProMatches(Long matchId,
            Integer duration,
            Integer startTime,
            Integer radiantTeamId,
            String radiantName,
            Integer direTeamId,
            String direName,
            Integer leagueid,
            String leagueName,
            Integer seriesId,
            Integer seriesType,
            Integer radiantScore,
            Integer direScore,
            Boolean radiantWin)
    {
        this.matchId = matchId;
        this.duration = duration;
        this.startTime = startTime;
        this.radiantTeamId = radiantTeamId;
        this.radiantName = radiantName;
        this.direTeamId = direTeamId;
        this.direName = direName;
        this.leagueid = leagueid;
        this.leagueName = leagueName;
        this.seriesId = seriesId;
        this.seriesType = seriesType;
        this.radiantScore = radiantScore;
        this.direScore = direScore;
        this.radiantWin = radiantWin;
    }

    public Long getMatchId() {
        return matchId;
    }

    public Integer getDuration() {
        return duration;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public Integer getRadiantTeamId() {
        return radiantTeamId;
    }

    public String getRadiantName() {
        return radiantName;
    }

    public Integer getDireTeamId() {
        return direTeamId;
    }

    public String getDireName() {
        return direName;
    }

    public Integer getLeagueid() {
        return leagueid;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public Integer getSeriesId() {
        return seriesId;
    }

    public Integer getSeriesType() {
        return seriesType;
    }

    public Integer getRadiantScore() {
        return radiantScore;
    }

    public Integer getDireScore() {
        return direScore;
    }

    public Boolean isRadiantWin() {
        return radiantWin;
    }
}
