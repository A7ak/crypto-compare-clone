package com.example.cryptocompareclone.models.watchlist;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class DISPLAY implements Serializable
{

    @SerializedName("USD")
    @Expose
    private USD_ uSD;
    private final static long serialVersionUID = -2748425346428583803L;

    public USD_ getUSD() {
        return uSD;
    }

    public void setUSD(USD_ uSD) {
        this.uSD = uSD;
    }

}
