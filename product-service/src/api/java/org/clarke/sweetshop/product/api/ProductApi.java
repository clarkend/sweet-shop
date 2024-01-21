package org.clarke.sweetshop.product.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.clarke.sweetshop.product.api.request.ProductRequest;
import org.clarke.sweetshop.product.api.response.ProductResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/product")
public interface ProductApi {

    @Operation(summary = "Retrieve a product with a given product ID")
    @ApiResponses(
            @ApiResponse(responseCode = "200", description = "Found a product with a given product ID")
    )
    @GetMapping("/{productId}")
    ProductResponse findProductById(@PathVariable String productId);

    @Operation(summary = "Get all availabe products.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Found a Product with a given ID")
    })
    @GetMapping("/all")
    List<ProductResponse> findAll();

    @Operation(summary = "Delete a product by its ID.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Deleted a product with a given ID")
    })
    @DeleteMapping(value = "/{productId}")
    ResponseEntity<Boolean> deleteProduct(@PathVariable String productId);

    @Operation(summary = "Create a product and save it.")
    @PostMapping(value = "/")
    ProductResponse createProduct(@RequestBody ProductRequest product);


}
