package org.clarke.sweetshop.mapping;

import org.clarke.sweetshop.db.entity.ProductEntity;
import org.clarke.sweetshop.product.api.request.ProductRequest;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ProductDtoMapper {

    public ProductEntity toDto(ProductRequest request){
        LocalDateTime now = LocalDateTime.now();
        return (ProductEntity) new ProductEntity()
                .name(request.name())
                .description(request.description());
              //  .createdDate(now)
              //  .lastUpdatedDate(now);
    }

}
