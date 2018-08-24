
package com.sombright.vizix.prodotaapis.detailedmatch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StunsPerMin {

    @SerializedName("raw")
    @Expose
    private Float raw;
    @SerializedName("pct")
    @Expose
    private Double pct;

    public Float getRaw() {
        return raw;
    }

    public void setRaw(Float raw) {
        this.raw = raw;
    }

    public Double getPct() {
        return pct;
    }

    public void setPct(Double pct) {
        this.pct = pct;
    }

}
