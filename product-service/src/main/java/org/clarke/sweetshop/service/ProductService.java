package org.clarke.sweetshop.service;

import org.clarke.sweetshop.db.repository.ProductRepository;
import org.clarke.sweetshop.mapping.ProductMapper;
import org.clarke.sweetshop.product.api.response.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

   @Autowired
   private ProductMapper productMapper;

    public ProductResponse findSingleProduct(String productId){
        return productRepository.findByProductId(Long.valueOf(productId))
                .map(productMapper::mapToResponse)
                .orElseThrow(() -> new RuntimeException("Cannot get product with Product ID :"+ productId));
    }

    public List<ProductResponse> findAll() {
        return productRepository.findAll().stream()
                .map(productMapper::mapToResponse)
                .collect(Collectors.toList());
    }
}
