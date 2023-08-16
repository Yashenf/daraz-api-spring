package com.daraz.pos.entity;

import com.daraz.pos.entity.sheard.FileResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class ProductImage {
    @Id
    private String propertyId;
    @Embedded
    private FileResource file;
    @ManyToOne
    private Product product;
}
