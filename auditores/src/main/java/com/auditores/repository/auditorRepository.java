package com.auditores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auditores.model.Auditor;

@Repository
public interface AuditorRepository extends JpaRepository<Auditor, Long> {
    
}
