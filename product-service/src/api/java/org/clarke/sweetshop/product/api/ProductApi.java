package org.clarke.sweetshop.product.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.clarke.sweetshop.product.api.response.ProductResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/product")
public interface ProductApi {

    @Operation(summary = "Retrieve a product with a given product ID")
    @ApiResponses(
            @ApiResponse(responseCode = "200", description = "Found a product with a given product ID")
    )
    @GetMapping("/{productId}")
    ProductResponse findProductById(@PathVariable String productId);



}
