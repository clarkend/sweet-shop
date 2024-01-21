package org.clarke.sweetshop.cart.response;

public class CartResponse {

    private ProductResponse productResponse;

    public ProductResponse getProductResponse() {
        return productResponse;
    }

    public void setProductResponse(ProductResponse productResponse) {
        this.productResponse = productResponse;
    }

    public CartResponse productResponse(ProductResponse productResponse) {
        this.productResponse = productResponse;
        return this;
    }
}
