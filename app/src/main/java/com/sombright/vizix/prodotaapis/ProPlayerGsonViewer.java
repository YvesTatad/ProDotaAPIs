
package com.sombright.vizix.prodotaapis;

import android.support.annotation.Nullable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProPlayerGsonViewer {

    @SerializedName("account_id")
    @Expose
    private Integer accountId;
    @SerializedName("steamid")
    @Expose
    private String steamid;
    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("avatarmedium")
    @Expose
    private String avatarmedium;
    @SerializedName("avatarfull")
    @Expose
    private String avatarfull;
    @SerializedName("profileurl")
    @Expose
    private String profileurl;
    @SerializedName("personaname")
    @Expose
    private String personaname;
    @SerializedName("last_login")
    @Expose
    private String lastLogin;
    @SerializedName("full_history_time")
    @Expose
    private String fullHistoryTime;
    @SerializedName("cheese")
    @Expose
    private Integer cheese;
    @SerializedName("fh_unavailable")
    @Expose
    private Boolean fhUnavailable;
    @SerializedName("loccountrycode")
    @Expose
    private String loccountrycode;
    @SerializedName("last_match_time")
    @Expose
    private String lastMatchTime;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("fantasy_role")
    @Expose
    private Integer fantasyRole;
    @SerializedName("team_id")
    @Expose
    private Integer teamId;
    @SerializedName("team_name")
    @Expose
    private String teamName;
    @SerializedName("team_tag")
    @Expose
    private String teamTag;
    @SerializedName("is_locked")
    @Expose
    private Boolean isLocked;
    @SerializedName("is_pro")
    @Expose
    private Boolean isPro;
    @SerializedName("locked_until")
    @Expose
    private Integer lockedUntil;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getSteamid() {
        return steamid;
    }

    public void setSteamid(String steamid) {
        this.steamid = steamid;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAvatarmedium() {
        return avatarmedium;
    }

    public void setAvatarmedium(String avatarmedium) {
        this.avatarmedium = avatarmedium;
    }

    public String getAvatarfull() {
        return avatarfull;
    }

    public void setAvatarfull(String avatarfull) {
        this.avatarfull = avatarfull;
    }

    public String getProfileurl() {
        return profileurl;
    }

    public void setProfileurl(String profileurl) {
        this.profileurl = profileurl;
    }

    public String getPersonaname() {
        return personaname;
    }

    public void setPersonaname(String personaname) {
        this.personaname = personaname;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getFullHistoryTime() {
        return fullHistoryTime;
    }

    public void setFullHistoryTime(String fullHistoryTime) {
        this.fullHistoryTime = fullHistoryTime;
    }

    public Integer getCheese() {
        return cheese;
    }

    public void setCheese(Integer cheese) {
        this.cheese = cheese;
    }

    public Boolean getFhUnavailable() {
        return fhUnavailable;
    }

    public void setFhUnavailable(Boolean fhUnavailable) {
        this.fhUnavailable = fhUnavailable;
    }

    public String getLoccountrycode() {
        return loccountrycode;
    }

    public void setLoccountrycode(String loccountrycode) {
        this.loccountrycode = loccountrycode;
    }

    public String getLastMatchTime() {
        return lastMatchTime;
    }

    public void setLastMatchTime(String lastMatchTime) {
        this.lastMatchTime = lastMatchTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getFantasyRole() {
        return fantasyRole;
    }

    public void setFantasyRole(Integer fantasyRole) {
        this.fantasyRole = fantasyRole;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamTag() {
        return teamTag;
    }

    public void setTeamTag(String teamTag) {
        this.teamTag = teamTag;
    }

    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public Boolean getIsPro() {
        return isPro;
    }

    public void setIsPro(Boolean isPro) {
        this.isPro = isPro;
    }

    public Integer getLockedUntil() {
        return lockedUntil;
    }

    public void setLockedUntil(Integer lockedUntil) {
        this.lockedUntil = lockedUntil;
    }

}
