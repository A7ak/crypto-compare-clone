package com.example.cryptocompareclone.models.watchlist;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CoinInfo implements Serializable
{

    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("FullName")
    @Expose
    private String fullName;
    @SerializedName("Internal")
    @Expose
    private String internal;
    @SerializedName("ImageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("Url")
    @Expose
    private String url;
    @SerializedName("Algorithm")
    @Expose
    private String algorithm;
    @SerializedName("ProofType")
    @Expose
    private String proofType;
    @SerializedName("NetHashesPerSecond")
    @Expose
    private Float netHashesPerSecond;
    @SerializedName("BlockNumber")
    @Expose
    private Integer blockNumber;
    @SerializedName("BlockTime")
    @Expose
    private Integer blockTime;
    @SerializedName("BlockReward")
    @Expose
    private Float blockReward;
    @SerializedName("Type")
    @Expose
    private Integer type;
    @SerializedName("DocumentType")
    @Expose
    private String documentType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getInternal() {
        return internal;
    }

    public void setInternal(String internal) {
        this.internal = internal;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getProofType() {
        return proofType;
    }

    public void setProofType(String proofType) {
        this.proofType = proofType;
    }

    public Float getNetHashesPerSecond() {
        return netHashesPerSecond;
    }

    public void setNetHashesPerSecond(Float netHashesPerSecond) {
        this.netHashesPerSecond = netHashesPerSecond;
    }

    public Integer getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(Integer blockNumber) {
        this.blockNumber = blockNumber;
    }

    public Integer getBlockTime() {
        return blockTime;
    }

    public void setBlockTime(Integer blockTime) {
        this.blockTime = blockTime;
    }

    public Float getBlockReward() {
        return blockReward;
    }

    public void setBlockReward(Float blockReward) {
        this.blockReward = blockReward;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

}
