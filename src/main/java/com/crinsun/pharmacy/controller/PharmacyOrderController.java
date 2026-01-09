package com.crinsun.pharmacy.controller;

import com.crinsun.pharmacy.dto.DispenseRequestDTO;
import com.crinsun.pharmacy.service.PharmacyOrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pharmacy")
public class PharmacyOrderController {

    private final PharmacyOrderService service;

    public PharmacyOrderController(PharmacyOrderService service) {
        this.service = service;
    }

    @PostMapping("/dispense")
    public ResponseEntity<String> dispense(@RequestBody DispenseRequestDTO dto) {
        service.dispense(dto.getOrderItemId(), dto.getDispenseQty());
        return ResponseEntity.ok("Medicine dispensed successfully");
    }
}
