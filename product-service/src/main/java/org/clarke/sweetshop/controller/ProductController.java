package org.clarke.sweetshop.controller;

import org.clarke.sweetshop.product.api.ProductApi;
import org.clarke.sweetshop.product.api.response.ProductResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController implements ProductApi {
    @Override
    public ProductResponse findProductById(String productId) {
        return new ProductResponse()
                .productId(productId);
    }
}
