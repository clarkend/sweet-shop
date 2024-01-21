package org.clarke.sweetshop.cart.client;

import org.clarke.sweetshop.cart.response.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "productClient", url = "http://localhost:8081" )
public interface ProductClient {

    @GetMapping("product/{productId}")
    ProductResponse findProductById(@PathVariable String productId);
}
