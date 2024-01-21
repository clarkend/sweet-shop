package org.clarke.sweetshop.cart.repository;

import org.clarke.sweetshop.cart.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository  extends JpaRepository<CartEntity, String> {
}
