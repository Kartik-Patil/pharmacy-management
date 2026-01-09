package com.crinsun.pharmacy.dto;

public class PharmacyOrderItemDTO {

    private Long id;
    private String medicineName;
    private int prescribedQty;
    private int dispensedQty;
    private String orderStatus;

    public PharmacyOrderItemDTO(
            Long id,
            String medicineName,
            int prescribedQty,
            int dispensedQty,
            String orderStatus) {
        this.id = id;
        this.medicineName = medicineName;
        this.prescribedQty = prescribedQty;
        this.dispensedQty = dispensedQty;
        this.orderStatus = orderStatus;
    }

    public Long getId() { return id; }
    public String getMedicineName() { return medicineName; }
    public int getPrescribedQty() { return prescribedQty; }
    public int getDispensedQty() { return dispensedQty; }
    public String getOrderStatus() { return orderStatus; }
}