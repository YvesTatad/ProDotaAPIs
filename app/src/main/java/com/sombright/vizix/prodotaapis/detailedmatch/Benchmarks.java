
package com.sombright.vizix.prodotaapis.detailedmatch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Benchmarks {

    @SerializedName("gold_per_min")
    @Expose
    private GoldPerMin goldPerMin;
    @SerializedName("xp_per_min")
    @Expose
    private XpPerMin xpPerMin;
    @SerializedName("kills_per_min")
    @Expose
    private KillsPerMin killsPerMin;
    @SerializedName("last_hits_per_min")
    @Expose
    private LastHitsPerMin lastHitsPerMin;
    @SerializedName("hero_damage_per_min")
    @Expose
    private HeroDamagePerMin heroDamagePerMin;
    @SerializedName("hero_healing_per_min")
    @Expose
    private HeroHealingPerMin heroHealingPerMin;
    @SerializedName("tower_damage")
    @Expose
    private TowerDamage towerDamage;
    @SerializedName("stuns_per_min")
    @Expose
    private StunsPerMin stunsPerMin;
    @SerializedName("lhten")
    @Expose
    private Lhten lhten;

    public GoldPerMin getGoldPerMin() {
        return goldPerMin;
    }

    public void setGoldPerMin(GoldPerMin goldPerMin) {
        this.goldPerMin = goldPerMin;
    }

    public XpPerMin getXpPerMin() {
        return xpPerMin;
    }

    public void setXpPerMin(XpPerMin xpPerMin) {
        this.xpPerMin = xpPerMin;
    }

    public KillsPerMin getKillsPerMin() {
        return killsPerMin;
    }

    public void setKillsPerMin(KillsPerMin killsPerMin) {
        this.killsPerMin = killsPerMin;
    }

    public LastHitsPerMin getLastHitsPerMin() {
        return lastHitsPerMin;
    }

    public void setLastHitsPerMin(LastHitsPerMin lastHitsPerMin) {
        this.lastHitsPerMin = lastHitsPerMin;
    }

    public HeroDamagePerMin getHeroDamagePerMin() {
        return heroDamagePerMin;
    }

    public void setHeroDamagePerMin(HeroDamagePerMin heroDamagePerMin) {
        this.heroDamagePerMin = heroDamagePerMin;
    }

    public HeroHealingPerMin getHeroHealingPerMin() {
        return heroHealingPerMin;
    }

    public void setHeroHealingPerMin(HeroHealingPerMin heroHealingPerMin) {
        this.heroHealingPerMin = heroHealingPerMin;
    }

    public TowerDamage getTowerDamage() {
        return towerDamage;
    }

    public void setTowerDamage(TowerDamage towerDamage) {
        this.towerDamage = towerDamage;
    }

    public StunsPerMin getStunsPerMin() {
        return stunsPerMin;
    }

    public void setStunsPerMin(StunsPerMin stunsPerMin) {
        this.stunsPerMin = stunsPerMin;
    }

    public Lhten getLhten() {
        return lhten;
    }

    public void setLhten(Lhten lhten) {
        this.lhten = lhten;
    }

}
