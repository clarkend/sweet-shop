package org.clarke.sweetshop.product.api.response;

public class AssetResponse {
    private Long assetId;

    private byte [] picture;

    public Long getAssetId() {
        return assetId;
    }

    public void setAssetId(Long assetId) {
        this.assetId = assetId;
    }

    public AssetResponse assetId(Long assetId) {
        this.assetId = assetId;
        return this;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public AssetResponse picture(byte[] picture) {
        this.picture = picture;
        return this;
    }
}
