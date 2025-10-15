package com.auditores.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auditores.model.Auditor;
import com.auditores.repository.auditorRepository;

import jakarta.transaction.Transactional;

@Service
public class auditorService {
    
    private final auditorRepository auditorRepository;
    
    public auditorService(auditorRepository auditorRepository) {
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