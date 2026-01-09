package com.crinsun.pharmacy.repository;

import com.crinsun.pharmacy.entity.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {}
