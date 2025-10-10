package com.auditores.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Data   
@NoArgsConstructor
@AllArgsConstructor

public class Auditor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String especialidad;
    private String email;
    private String telefono;
    private LocalDateTime fechaContratacion;
}