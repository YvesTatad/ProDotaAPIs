package com.sombright.vizix.prodotaapis;

public class ProPlayers {

    private Integer accountId;
    private String steamid;
    private String avatar;
    private String avatarmedium;
    private String avatarfull;
    private String profileurl;
    private String personaname;
    private String lastLogin;
    private String fullHistoryTime;
    private Integer cheese;
    private Boolean fhUnavailable;
    private String loccountrycode;
    private String lastMatchTime;
    private String name;
    private String countryCode;
    private Integer fantasyRole;
    private Integer teamId;
    private String teamName;
    private String teamTag;
    private Boolean isLocked;
    private Boolean isPro;
    private Integer lockedUntil;

    public ProPlayers(Integer accountId,
            String steamid,
            String avatar,
            String avatarmedium,
            String avatarfull,
            String profileurl,
            String personaname,
            String lastLogin,
            String fullHistoryTime,
            Integer cheese,
            Boolean fhUnavailable,
            String loccountrycode,
            String lastMatchTime,
            String name,
            String countryCode,
            Integer fantasyRole,
            Integer teamId,
            String teamName,
            String teamTag
            ,
            Boolean isLocked,
            Boolean isPro,
            Integer lockedUntil
    )
    {

        this.accountId = accountId;
        this.steamid = steamid;
        this.avatar = avatar;
        this.avatarmedium = avatarmedium;
        this.avatarfull = avatarfull;
        this.profileurl = profileurl;
        this.personaname = personaname;
        this.lastLogin = lastLogin;
        this.fullHistoryTime = fullHistoryTime;
        this.cheese = cheese;
        this.fhUnavailable = fhUnavailable;
        this.loccountrycode = loccountrycode;
        this.lastMatchTime = lastMatchTime;
        this.name = name;
        this.countryCode = countryCode;
        this.fantasyRole = fantasyRole;
        this.teamId = teamId;
        this.teamName = teamName;
        this.teamTag = teamTag;
        this.isLocked = isLocked;
        this.isPro = isPro;
        this.lockedUntil = lockedUntil;

    }

    public Integer getAccountId() {
        return accountId;
    }

    public String getSteamid() {
        return steamid;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getAvatarmedium() {
        return avatarmedium;
    }

    public String getAvatarfull() {
        return avatarfull;
    }

    public String getProfileurl() {
        return profileurl;
    }

    public String getPersonaname() {
        return personaname;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public String getFullHistoryTime() {
        return fullHistoryTime;
    }

    public Integer getCheese() {
        return cheese;
    }

    public Boolean isFhUnavailable() {
        return fhUnavailable;
    }

    public String getLoccountrycode() {
        return loccountrycode;
    }

    public String getLastMatchTime() {
        return lastMatchTime;
    }

    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public Integer getFantasyRole() {
        return fantasyRole;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getTeamTag() {
        return teamTag;
    }

    public Boolean isLocked() {
        return isLocked;
    }

    public Boolean isPro() {
        return isPro;
    }

    public Integer getLockedUntil() {
        return lockedUntil;
    }
}
