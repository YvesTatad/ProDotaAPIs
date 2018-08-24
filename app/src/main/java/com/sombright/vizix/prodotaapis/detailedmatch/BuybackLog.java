
package com.sombright.vizix.prodotaapis.detailedmatch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BuybackLog {

    @SerializedName("time")
    @Expose
    private Long time;
    @SerializedName("slot")
    @Expose
    private Long slot;
    @SerializedName("player_slot")
    @Expose
    private Long playerSlot;

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getSlot() {
        return slot;
    }

    public void setSlot(Long slot) {
        this.slot = slot;
    }

    public Long getPlayerSlot() {
        return playerSlot;
    }

    public void setPlayerSlot(Long playerSlot) {
        this.playerSlot = playerSlot;
    }

}
