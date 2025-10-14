package com.auditores.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auditores.Service.AuditorService;
import com.auditores.model.Auditor;

@RestController
public class AuditorController {
    private final AuditorService auditorService;

    public AuditorController(AuditorService auditorService) {
        this.auditorService = auditorService;
    }

    @GetMapping("/auditors")
    public List<Auditor>getAllAuditors() {
        return auditorService.getAllAuditors();
    }

    @GetMapping("/test")
    public String test() {
        return "✅ Servicio funcionando - " + java.time.LocalDateTime.now();
    }
}
