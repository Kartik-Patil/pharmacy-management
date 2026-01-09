package com.crinsun.pharmacy.repository;

import com.crinsun.pharmacy.entity.PharmacyOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacyOrderItemRepository extends JpaRepository<PharmacyOrderItem, Long> {}
