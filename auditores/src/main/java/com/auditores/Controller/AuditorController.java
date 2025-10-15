package com.auditores.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;  // ← AGREGAR ESTA LÍNEA
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auditores.Service.auditorService;
import com.auditores.model.Auditor;

@RestController
@CrossOrigin(origins = "*")  // ← AGREGAR ESTA LÍNEA
public class AuditorController {
    private final auditorService auditorService;

    public AuditorController(auditorService auditorService) {
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