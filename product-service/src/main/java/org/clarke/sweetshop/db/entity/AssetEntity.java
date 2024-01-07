package org.clarke.sweetshop.db.entity;

import jakarta.persistence.*;

@Entity(name = "asset")
public class AssetEntity extends AuditEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "asset_id")
    private Long assetId;

    @Lob
    private byte[] picture;

    public Long getAssetId() {
        return assetId;
    }

    public void setAssetId(Long assetId) {
        this.assetId = assetId;
    }

    public AssetEntity assetId(Long assetId) {
        this.assetId = assetId;
        return this;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public AssetEntity picture(byte[] picture) {
        this.picture = picture;
        return this;
    }
}
