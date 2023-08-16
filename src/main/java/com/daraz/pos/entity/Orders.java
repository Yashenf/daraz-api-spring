package com.daraz.pos.entity;

import com.daraz.pos.enums.OrderStates;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Orders {
    @Id
    private String propertyId;
    private double totalCost;
    private Date date;
    private String shippingAddress;
    @Enumerated(EnumType.STRING)
    private OrderStates orderState;
    private int productQty;
    @ManyToOne
    private  User user;
    @ManyToOne
    private Product product;
    @OneToOne(mappedBy = "orderPropertyId",cascade = CascadeType.ALL)
    private  Payment payment;
}
