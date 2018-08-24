
package com.sombright.vizix.prodotaapis.detailedmatch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LastHitsPerMin {

    @SerializedName("raw")
    @Expose
    private Double raw;
    @SerializedName("pct")
    @Expose
    private Double pct;

    public Double getRaw() {
        return raw;
    }

    public void setRaw(Double raw) {
        this.raw = raw;
    }

    public Double getPct() {
        return pct;
    }

    public void setPct(Double pct) {
        this.pct = pct;
    }

}
