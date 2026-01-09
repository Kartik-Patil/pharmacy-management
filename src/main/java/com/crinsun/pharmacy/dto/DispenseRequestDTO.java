package com.crinsun.pharmacy.dto;

public class DispenseRequestDTO {

    private Long orderItemId;
    private int dispenseQty;

    public Long getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    public int getDispenseQty() {
        return dispenseQty;
    }

    public void setDispenseQty(int dispenseQty) {
        this.dispenseQty = dispenseQty;
    }
}
