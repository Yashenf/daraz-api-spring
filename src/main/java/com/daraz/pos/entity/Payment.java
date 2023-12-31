package com.daraz.pos.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Payment {
    @Id
    private String propertyId;
    private Date date;
    private double amount;
    private String bank;
    @OneToOne
    @JoinColumn(unique = true)// for one to one
    private Orders orderPropertyId;
}
