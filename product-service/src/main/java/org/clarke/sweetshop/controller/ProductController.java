package org.clarke.sweetshop.controller;

import org.clarke.sweetshop.product.api.ProductApi;
import org.clarke.sweetshop.product.api.request.ProductRequest;
import org.clarke.sweetshop.product.api.response.ProductResponse;
import org.clarke.sweetshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController implements ProductApi {

    @Autowired
    private ProductService productService;

    @Override
    public ProductResponse findProductById(String productId) {
        return productService.findSingleProduct(productId);
    }

    @Override
    public List<ProductResponse> findAll() {
        return productService.findAll();
    }

    @Override
    public ResponseEntity<Boolean> deleteProduct(String productId) {
        return productService.deleteProductById(productId);
    }

    @Override
    public ProductResponse createProduct(ProductRequest product) {
        return productService.createSingleProduct(product);
    }
}
