package com.example.cryptocompareclone.models.watchlist;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class RAW implements Serializable
{

    @SerializedName("USD")
    @Expose
    private USD uSD;
    private final static long serialVersionUID = 8264347087142402720L;

    public USD getUSD() {
        return uSD;
    }

    public void setUSD(USD uSD) {
        this.uSD = uSD;
    }

}
