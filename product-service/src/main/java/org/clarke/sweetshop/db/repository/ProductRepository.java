package org.clarke.sweetshop.db.repository;

import org.clarke.sweetshop.db.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    Optional<ProductEntity> findByProductId(Long productId);

    @Transactional
    Integer deleteByProductId(Long productId);
}
