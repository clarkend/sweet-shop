package org.clarke.sweetshop.mapping;

import org.clarke.sweetshop.db.entity.AssetEntity;
import org.clarke.sweetshop.db.entity.ProductEntity;
import org.clarke.sweetshop.product.api.response.AssetResponse;
import org.clarke.sweetshop.product.api.response.ProductResponse;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Optional.ofNullable;

@Component
public class ProductMapper {

    public ProductResponse mapToResponse(ProductEntity productEntity){
        return new ProductResponse()
                .id(productEntity.getProductId())
                .name(productEntity.getName())
                .description(productEntity.getDescription())
              //  .assetResponses(mapList(productEntity.getImages(), this::mapAssetResponse))
                .createdDate(productEntity.getCreatedDate())
                .lastUpdateTime(productEntity.getLastUpdatedDate());
    }

    private AssetResponse mapAssetResponse(AssetEntity entity){
        return new AssetResponse()
                .assetId(entity.getAssetId())
                .picture(entity.getPicture());
    }

    private static <I,O> List<O> mapList(Collection<? extends I> input, Function< ? super I, ? extends O> mapper){
        return ofNullable(input)
                .map(values -> values.stream()
                        .filter(Objects::nonNull)
                        .<O> map(mapper)
                        .collect(Collectors.toList()))
                .orElse(null);

    }


}
