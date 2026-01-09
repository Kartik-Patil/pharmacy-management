package com.crinsun.pharmacy.controller;

import com.crinsun.pharmacy.dto.DispenseRequestDTO;
import com.crinsun.pharmacy.entity.PharmacyOrderItem;
import com.crinsun.pharmacy.repository.PharmacyOrderItemRepository;
import com.crinsun.pharmacy.service.PharmacyOrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pharmacy")
@CrossOrigin(origins = "*")
public class PharmacyOrderController {

    private final PharmacyOrderService service;
    private final PharmacyOrderItemRepository itemRepo;

    public PharmacyOrderController(
            PharmacyOrderService service,
            PharmacyOrderItemRepository itemRepo) {
        this.service = service;
        this.itemRepo = itemRepo;
    }

    @GetMapping("/items")
    public List<PharmacyOrderItemDTO> getAllItems() {

        return itemRepo.findAll()
                .stream()
                .map(item -> new PharmacyOrderItemDTO(
                        item.getId(),
                        item.getMedicineName(),
                        item.getPrescribedQty(),
                        item.getDispensedQty(),
                        item.getOrder().getStatus().name()
                ))
                .toList();
    }


    @PostMapping("/dispense")
    public String dispense(@RequestBody DispenseRequestDTO dto) {
        service.dispense(dto.getOrderItemId(), dto.getDispenseQty());
        return "Medicine dispensed successfully";
    }
}
