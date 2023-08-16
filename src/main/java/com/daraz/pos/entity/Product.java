package com.daraz.pos.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Product {
    @Id
    private String propertyId;
    private String displayName;
    private String description;
    private double unitPrice;
    private double sellingPrice;
    private int qtyOnHand;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private Set<ProductImage> images;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Orders> orderList;

}
