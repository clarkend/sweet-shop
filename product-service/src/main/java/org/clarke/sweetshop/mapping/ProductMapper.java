package org.clarke.sweetshop.mapping;

import org.clarke.sweetshop.db.entity.ProductEntity;
import org.clarke.sweetshop.product.api.response.ProductResponse;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductResponse mapToResponse(ProductEntity productEntity){
        return new ProductResponse()
                .id(productEntity.getProductId())
                .name(productEntity.getName())
                .description(productEntity.getDescription())
                .createdDate(productEntity.getCreatedDate())
                .lastUpdateTime(productEntity.getLastUpdatedDate());
    }


}
