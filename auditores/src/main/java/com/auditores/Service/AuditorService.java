package com.auditores.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auditores.model.Auditor;
import com.auditores.repository.AuditorRepository;

import jakarta.transaction.Transactional;

@Service
public class AuditorService {
    
    private final AuditorRepository auditorRepository;
    
    public AuditorService(AuditorRepository auditorRepository) {
        this.auditorRepository = auditorRepository;
    }
    
    @Transactional
    public List<Auditor> getAllAuditors() {
        try {
            return auditorRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener auditores: " + e.getMessage(), e);
        }
    }
}