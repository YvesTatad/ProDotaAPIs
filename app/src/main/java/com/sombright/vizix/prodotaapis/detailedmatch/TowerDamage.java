
package com.sombright.vizix.prodotaapis.detailedmatch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TowerDamage {

    @SerializedName("raw")
    @Expose
    private Long raw;
    @SerializedName("pct")
    @Expose
    private Double pct;

    public Long getRaw() {
        return raw;
    }

    public void setRaw(Long raw) {
        this.raw = raw;
    }

    public Double getPct() {
        return pct;
    }

    public void setPct(Double pct) {
        this.pct = pct;
    }

}
