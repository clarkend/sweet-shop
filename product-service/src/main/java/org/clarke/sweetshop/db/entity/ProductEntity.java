package org.clarke.sweetshop.db.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "product")
public class ProductEntity extends AuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "product_name")
    private String name;

    @Column(name = "product_description")
    private String description;
//
//    @OneToMany
//    @JoinColumn(name = "asset_id", referencedColumnName = "product_id")
//    private List<AssetEntity> images;

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


//    public List<AssetEntity> getImages() {
//        return images;
//    }
//
//    public void setImages(List<AssetEntity> images) {
//        this.images = images;
//    }
//
//    public ProductEntity images(List<AssetEntity> images) {
//        this.images = images;
//        return this;
//    }
}
