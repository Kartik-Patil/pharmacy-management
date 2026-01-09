package com.crinsun.pharmacy.service;

import com.crinsun.pharmacy.entity.*;
import com.crinsun.pharmacy.enums.OrderStatus;
import com.crinsun.pharmacy.repository.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PharmacyOrderService {

    private final PharmacyOrderItemRepository itemRepo;
    private final StockItemRepository stockRepo;

    public PharmacyOrderService(
            PharmacyOrderItemRepository itemRepo,
            StockItemRepository stockRepo) {
        this.itemRepo = itemRepo;
        this.stockRepo = stockRepo;
    }

    public void dispense(Long orderItemId, int qty) {

        PharmacyOrderItem item = itemRepo.findById(orderItemId)
                .orElseThrow(() -> new RuntimeException("Order item not found"));

        StockItem stock = stockRepo.findByMedicineName(item.getMedicineName())
                .orElseThrow(() -> new RuntimeException("Stock not found"));

        if (stock.getAvailableQty() < qty) {
            throw new RuntimeException("Insufficient stock");
        }

        item.setDispensedQty(item.getDispensedQty() + qty);
        stock.setAvailableQty(stock.getAvailableQty() - qty);

        if (item.getDispensedQty() < item.getPrescribedQty()) {
            item.getOrder().setStatus(OrderStatus.PARTIALLY_DISPENSED);
        } else {
            item.getOrder().setStatus(OrderStatus.COMPLETED);
        }
    }
}
