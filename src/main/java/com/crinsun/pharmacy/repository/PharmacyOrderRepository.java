package com.crinsun.pharmacy.repository;

import com.crinsun.pharmacy.entity.PharmacyOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacyOrderRepository extends JpaRepository<PharmacyOrder, Long> {}
