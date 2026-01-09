package com.crinsun.pharmacy.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "stock_items")
public class StockItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String medicineName;

    private int availableQty;

    // getters and setters
}
