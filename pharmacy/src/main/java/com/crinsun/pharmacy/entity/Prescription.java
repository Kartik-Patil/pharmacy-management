package com.crinsun.pharmacy.entity;

import com.crinsun.pharmacy.enums.VisitType;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "prescriptions")
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long patientId;

    @Enumerated(EnumType.STRING)
    private VisitType visitType;

    private LocalDate prescriptionDate;

    private boolean valid;

    // getters and setters
}
