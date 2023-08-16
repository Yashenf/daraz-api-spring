package com.daraz.pos.entity;

import java.util.Date;

public class Payment {
    private String propertyId;
    private Date date;
    private double amount;
    private String bank;
    private Orders orderPropertyId;
}
