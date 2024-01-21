package org.clarke.sweetshop.cart.controller;

import org.clarke.sweetshop.cart.api.CartApi;
import org.clarke.sweetshop.cart.response.CartResponse;
import org.clarke.sweetshop.cart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController implements CartApi {

    @Autowired
    private CartService cartService;
    @Override
    public CartResponse findCartById(String cartId) {
        return cartService.getCartById(cartId);
    }
}
