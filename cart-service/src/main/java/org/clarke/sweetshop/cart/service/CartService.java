package org.clarke.sweetshop.cart.service;

import org.clarke.sweetshop.cart.client.ProductClient;
import org.clarke.sweetshop.cart.repository.CartRepository;
import org.clarke.sweetshop.cart.response.CartResponse;
import org.clarke.sweetshop.cart.response.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private ProductClient productClient;

    public CartResponse getCartById(String cartId){
        ProductResponse productById = productClient.findProductById("1");
        return new CartResponse().productResponse(productById);
    }
}
