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

    public Long getId() {
        return id;
    }

    public PharmacyOrder getOrder() {
        return order;
    }

    public void setOrder(PharmacyOrder order) {
        this.order = order;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getPrescribedQty() {
        return prescribedQty;
    }

    public void setPrescribedQty(int prescribedQty) {
        this.prescribedQty = prescribedQty;
    }

    public int getDispensedQty() {
        return dispensedQty;
    }

    public void setDispensedQty(int dispensedQty) {
        this.dispensedQty = dispensedQty;
    }
}
