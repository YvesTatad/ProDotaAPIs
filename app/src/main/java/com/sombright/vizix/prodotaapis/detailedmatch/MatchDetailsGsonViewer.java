
package com.sombright.vizix.prodotaapis.detailedmatch;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MatchDetailsGsonViewer {

    @SerializedName("match_id")
    @Expose
    private Long matchId;
    @SerializedName("barracks_status_dire")
    @Expose
    private Long barracksStatusDire;
    @SerializedName("barracks_status_radiant")
    @Expose
    private Long barracksStatusRadiant;
    @SerializedName("chat")
    @Expose
    private List<Chat> chat = new ArrayList<>();
    @SerializedName("cluster")
    @Expose
    private Long cluster;
    @SerializedName("cosmetics")
    @Expose
    private Cosmetics cosmetics;
    @SerializedName("dire_score")
    @Expose
    private Long direScore;
    @SerializedName("draft_timings")
    @Expose
    private List<DraftTiming> draftTimings = new ArrayList<>();
    @SerializedName("duration")
    @Expose
    private Long duration;
    @SerializedName("engine")
    @Expose
    private Long engine;
    @SerializedName("first_blood_time")
    @Expose
    private Long firstBloodTime;
    @SerializedName("game_mode")
    @Expose
    private Long gameMode;
    @SerializedName("human_players")
    @Expose
    private Long humanPlayers;
    @SerializedName("leagueid")
    @Expose
    private Long leagueid;
    @SerializedName("lobby_type")
    @Expose
    private Long lobbyType;
    @SerializedName("match_seq_num")
    @Expose
    private Long matchSeqNum;
    @SerializedName("negative_votes")
    @Expose
    private Long negativeVotes;
    @SerializedName("objectives")
    @Expose
    private List<Objectives> objectives = new ArrayList<>();
    @SerializedName("picks_bans")
    @Expose
    private List<PicksBans> picksBans;
    @SerializedName("positive_votes")
    @Expose
    private Long positiveVotes;
    @SerializedName("radiant_gold_adv")
    @Expose
    private List<Integer> radiantGoldAdv;
    @SerializedName("radiant_score")
    @Expose
    private Long radiantScore;
    @SerializedName("radiant_win")
    @Expose
    private Boolean radiantWin;
    @SerializedName("radiant_xp_adv")
    @Expose
    private List<Integer> radiantXpAdv;
    @SerializedName("start_time")
    @Expose
    private Long startTime;
    @SerializedName("teamfights")
    @Expose
    private List<Teamfights> teamfights;
    @SerializedName("tower_status_dire")
    @Expose
    private Long towerStatusDire;
    @SerializedName("tower_status_radiant")
    @Expose
    private Long towerStatusRadiant;
    @SerializedName("version")
    @Expose
    private Long version;
    @SerializedName("replay_salt")
    @Expose
    private Long replaySalt;
    @SerializedName("series_id")
    @Expose
    private Long seriesId;
    @SerializedName("series_type")
    @Expose
    private Long seriesType;
    @SerializedName("radiant_team")
    @Expose
    private RadiantTeam radiantTeam;
    @SerializedName("dire_team")
    @Expose
    private DireTeam direTeam;
    @SerializedName("league")
    @Expose
    private League league;
    @SerializedName("skill")
    @Expose
    private Long skill;
    @SerializedName("players")
    @Expose
    private List<Player> players = new ArrayList<>();
    @SerializedName("patch")
    @Expose
    private Long patch;
    @SerializedName("region")
    @Expose
    private Long region;
    @SerializedName("all_word_counts")
    @Expose
    private AllWordCounts allWordCounts;
    @SerializedName("my_word_counts")
    @Expose
    private MyWordCounts myWordCounts;
    @SerializedName("throw")
    @Expose
    private Long _throw;
    @SerializedName("loss")
    @Expose
    private Long loss;
    @SerializedName("replay_url")
    @Expose
    private String replayUrl;

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public Long getBarracksStatusDire() {
        return barracksStatusDire;
    }

    public void setBarracksStatusDire(Long barracksStatusDire) {
        this.barracksStatusDire = barracksStatusDire;
    }

    public Long getBarracksStatusRadiant() {
        return barracksStatusRadiant;
    }

    public void setBarracksStatusRadiant(Long barracksStatusRadiant) {
        this.barracksStatusRadiant = barracksStatusRadiant;
    }

    public List<Chat> getChat() {
        return chat;
    }

    public void setChat(List<Chat> chat) {
        this.chat = chat;
    }

    public Long getCluster() {
        return cluster;
    }

    public void setCluster(Long cluster) {
        this.cluster = cluster;
    }

    public Cosmetics getCosmetics() {
        return cosmetics;
    }

    public void setCosmetics(Cosmetics cosmetics) {
        this.cosmetics = cosmetics;
    }

    public Long getDireScore() {
        return direScore;
    }

    public void setDireScore(Long direScore) {
        this.direScore = direScore;
    }

    public List<DraftTiming> getDraftTimings() {
        return draftTimings;
    }

    public void setDraftTimings(List<DraftTiming> draftTimings) {
        this.draftTimings = draftTimings;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Long getEngine() {
        return engine;
    }

    public void setEngine(Long engine) {
        this.engine = engine;
    }

    public Long getFirstBloodTime() {
        return firstBloodTime;
    }

    public void setFirstBloodTime(Long firstBloodTime) {
        this.firstBloodTime = firstBloodTime;
    }

    public Long getGameMode() {
        return gameMode;
    }

    public void setGameMode(Long gameMode) {
        this.gameMode = gameMode;
    }

    public Long getHumanPlayers() {
        return humanPlayers;
    }

    public void setHumanPlayers(Long humanPlayers) {
        this.humanPlayers = humanPlayers;
    }

    public Long getLeagueid() {
        return leagueid;
    }

    public void setLeagueid(Long leagueid) {
        this.leagueid = leagueid;
    }

    public Long getLobbyType() {
        return lobbyType;
    }

    public void setLobbyType(Long lobbyType) {
        this.lobbyType = lobbyType;
    }

    public Long getMatchSeqNum() {
        return matchSeqNum;
    }

    public void setMatchSeqNum(Long matchSeqNum) {
        this.matchSeqNum = matchSeqNum;
    }

    public Long getNegativeVotes() {
        return negativeVotes;
    }

    public void setNegativeVotes(Long negativeVotes) {
        this.negativeVotes = negativeVotes;
    }

    public List<Objectives> getObjectives() {
        return objectives;
    }

    public void setObjectives(List<Objectives> objectives) {
        this.objectives = objectives;
    }

    public List<PicksBans> getPicksBans() {
        return picksBans;
    }

    public void setPicksBans(List<PicksBans> picksBans) {
        this.picksBans = picksBans;
    }

    public Long getPositiveVotes() {
        return positiveVotes;
    }

    public void setPositiveVotes(Long positiveVotes) {
        this.positiveVotes = positiveVotes;
    }

    public List<Integer> getRadiantGoldAdv() {
        return radiantGoldAdv;
    }

    public void setRadiantGoldAdv(List<Integer> radiantGoldAdv) {
        this.radiantGoldAdv = radiantGoldAdv;
    }

    public Long getRadiantScore() {
        return radiantScore;
    }

    public void setRadiantScore(Long radiantScore) {
        this.radiantScore = radiantScore;
    }

    public Boolean getRadiantWin() {
        return radiantWin;
    }

    public void setRadiantWin(Boolean radiantWin) {
        this.radiantWin = radiantWin;
    }

    public List<Integer> getRadiantXpAdv() {
        return radiantXpAdv;
    }

    public void setRadiantXpAdv(List<Integer> radiantXpAdv) {
        this.radiantXpAdv = radiantXpAdv;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public List<Teamfights> getTeamfights() {
        return teamfights;
    }

    public void setTeamfights(List<Teamfights> teamfights) {
        this.teamfights = teamfights;
    }

    public Long getTowerStatusDire() {
        return towerStatusDire;
    }

    public void setTowerStatusDire(Long towerStatusDire) {
        this.towerStatusDire = towerStatusDire;
    }

    public Long getTowerStatusRadiant() {
        return towerStatusRadiant;
    }

    public void setTowerStatusRadiant(Long towerStatusRadiant) {
        this.towerStatusRadiant = towerStatusRadiant;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getReplaySalt() {
        return replaySalt;
    }

    public void setReplaySalt(Long replaySalt) {
        this.replaySalt = replaySalt;
    }

    public Long getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Long seriesId) {
        this.seriesId = seriesId;
    }

    public Long getSeriesType() {
        return seriesType;
    }

    public void setSeriesType(Long seriesType) {
        this.seriesType = seriesType;
    }

    public RadiantTeam getRadiantTeam() {
        return radiantTeam;
    }

    public void setRadiantTeam(RadiantTeam radiantTeam) {
        this.radiantTeam = radiantTeam;
    }

    public DireTeam getDireTeam() {
        return direTeam;
    }

    public void setDireTeam(DireTeam direTeam) {
        this.direTeam = direTeam;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public Long getSkill() {
        return skill;
    }

    public void setSkill(Long skill) {
        this.skill = skill;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Long getPatch() {
        return patch;
    }

    public void setPatch(Long patch) {
        this.patch = patch;
    }

    public Long getRegion() {
        return region;
    }

    public void setRegion(Long region) {
        this.region = region;
    }

    public AllWordCounts getAllWordCounts() {
        return allWordCounts;
    }

    public void setAllWordCounts(AllWordCounts allWordCounts) {
        this.allWordCounts = allWordCounts;
    }

    public MyWordCounts getMyWordCounts() {
        return myWordCounts;
    }

    public void setMyWordCounts(MyWordCounts myWordCounts) {
        this.myWordCounts = myWordCounts;
    }

    public Long getThrow() {
        return _throw;
    }

    public void setThrow(Long _throw) {
        this._throw = _throw;
    }

    public Long getLoss() {
        return loss;
    }

    public void setLoss(Long loss) {
        this.loss = loss;
    }

    public String getReplayUrl() {
        return replayUrl;
    }

    public void setReplayUrl(String replayUrl) {
        this.replayUrl = replayUrl;
    }

}
