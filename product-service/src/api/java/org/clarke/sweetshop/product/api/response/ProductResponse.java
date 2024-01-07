package org.clarke.sweetshop.product.api.response;

public class ProductResponse {
    private String productId;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ProductResponse productId(String productId){
        this.productId = productId;
        return this;
    }
}
