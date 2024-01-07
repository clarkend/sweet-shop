package org.clarke.sweetshop.product.api.response;

import java.time.LocalDateTime;
import java.util.List;

public class ProductResponse {
    private Long id;
    private String name;
    private String description;

    private List<AssetResponse> assetResponse;

    private LocalDateTime createdDate;

    private LocalDateTime lastUpdateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProductResponse id(Long id) {
        this.id = id;
        return this;
    }

    public ProductResponse setName(String name){
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductResponse name(String name){
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductResponse description(String description) {
        this.description = description;
        return this;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public ProductResponse createdDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public LocalDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public ProductResponse lastUpdateTime(LocalDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    public List<AssetResponse> getAssetResponse() {
        return assetResponse;
    }

    public void setAssetResponse(List<AssetResponse> assetResponse) {
        this.assetResponse = assetResponse;
    }

    public ProductResponse assetResponses(List<AssetResponse> assetResponse){
        this.assetResponse = assetResponse;
        return this;
    }
}
