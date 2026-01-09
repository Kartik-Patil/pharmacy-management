package com.crinsun.pharmacy.controller;

import com.crinsun.pharmacy.entity.PharmacyOrderItem;
import com.crinsun.pharmacy.repository.PharmacyOrderItemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pharmacy")
public class PharmacyOrderController {

    private final PharmacyOrderItemRepository itemRepo;

    public PharmacyOrderController(PharmacyOrderItemRepository itemRepo) {
        this.itemRepo = itemRepo;
    }

    @GetMapping("/items")
    public List<PharmacyOrderItem> getAllItems() {
        return itemRepo.findAll();
    }
}
