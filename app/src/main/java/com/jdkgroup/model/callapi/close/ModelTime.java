package com.jdkgroup.model.callapi.close;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelTime {
    @SerializedName("updated")
    @Expose
    private String updated;
    @SerializedName("updatedISO")
    @Expose
    private String updatedISO;

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getUpdatedISO() {
        return updatedISO;
    }

    public void setUpdatedISO(String updatedISO) {
        this.updatedISO = updatedISO;
    }
}
