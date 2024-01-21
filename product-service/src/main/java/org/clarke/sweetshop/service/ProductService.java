package org.clarke.sweetshop.service;

import org.clarke.sweetshop.db.entity.ProductEntity;
import org.clarke.sweetshop.db.repository.ProductRepository;
import org.clarke.sweetshop.mapping.ProductDtoMapper;
import org.clarke.sweetshop.mapping.ProductMapper;
import org.clarke.sweetshop.product.api.request.ProductRequest;
import org.clarke.sweetshop.product.api.response.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Optional.ofNullable;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

   @Autowired
   private ProductMapper productMapper;

   @Autowired
   private ProductDtoMapper productDtoMapper;

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

    public ResponseEntity<Boolean> deleteProductById(String productId) {
        return null;
    }

    public ProductResponse createSingleProduct(ProductRequest product) {
        ProductEntity dto = productDtoMapper.toDto(product);
        return null;
//        return productRepository.save(Optional.of(product)
//                .map(productDtoMapper::toDto));
               // .map(x -> new ProductResponse().name(x.getName()).description(x.getDescription()));
    }
}
