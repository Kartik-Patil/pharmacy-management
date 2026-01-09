package com.crinsun.pharmacy.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pharmacy_order_items")
public class PharmacyOrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private PharmacyOrder order;

    private String medicineName;

    private int prescribedQty;
    private int dispensedQty;

    // getters and setters
}
