package org.clarke.sweetshop.db.entity;

import jakarta.persistence.*;

@Entity(name = "product")
public class ProductEntity extends AuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long productId;

    @Column(name = "product_name")
    private String name;

    @Column(name = "product_description")
    private String description;

    public void setProductId(Long id) {
        this.productId = id;
    }

    public Long getProductId() {
        return productId;
    }

    public ProductEntity id(Long id){
        this.productId = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductEntity name(String name){
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductEntity description(String description){
        this.description = description;
        return this;
    }

}
