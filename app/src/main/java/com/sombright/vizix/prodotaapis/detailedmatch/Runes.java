
package com.sombright.vizix.prodotaapis.detailedmatch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Runes {

    @SerializedName("property1")
    @Expose
    private Long property1;
    @SerializedName("property2")
    @Expose
    private Long property2;

    public Long getProperty1() {
        return property1;
    }

    public void setProperty1(Long property1) {
        this.property1 = property1;
    }

    public Long getProperty2() {
        return property2;
    }

    public void setProperty2(Long property2) {
        this.property2 = property2;
    }

}
