package org.clarke.sweetshop.cart.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.clarke.sweetshop.cart.response.CartResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/cart")
public interface CartApi {

    @Operation(summary = "Retrieve a cart with a given Cart Id")
    @ApiResponses(
            @ApiResponse(responseCode = "200", description = "Found a product with a given product ID")
    )
    @GetMapping("/{cartId}")
    CartResponse findCartById(@PathVariable String cartId);


}
