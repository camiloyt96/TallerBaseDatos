package com.auditores.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "AUDITOR")
public class Auditor {

    @Id
    @Column(name = "ID_AUDITOR", nullable = false)
    private Long idAuditor;

    @Column(name = "NUMRUN", nullable = false)
    private Long numrun;

    @Column(name = "DVRun", nullable = false, length = 1)
    private String dvRun;

    @Column(name = "COD_COMUNA")
    private Long codComuna;

    @Column(name = "COD_PROFESION", nullable = false)
    private Long codProfesion;

    @Column(name = "APPATERNO", nullable = false, length = 15)
    private String appaterno;

    @Column(name = "APMATERNO", nullable = false, length = 15)
    private String apmaterno;

    @Column(name = "NOMBRE", nullable = false, length = 20)
    private String nombre;

    @Column(name = "COD_ESTCIVIL", nullable = false)
    private Integer codEstCivil;

    @Column(name = "PUNTAJE")
    private Integer puntaje;

    @Column(name = "SUELDO", nullable = false)
    private Integer sueldo;

    @Column(name = "COD_AFP", nullable = false)
    private Integer codAfp;

    @Column(name = "COD_ISAPRE", nullable = false)
    private Integer codIsapre;

    @Column(name = "COD_TPCONTRATO")
    private Integer codIpContrato;

    @Column(name = "NUMRUN_SUP")
    private Long numrunSup;

    // Constructors
    public Auditor() {}

    // Getters and Setters
    public Long getIdAuditor() { return idAuditor; }
    public void setIdAuditor(Long idAuditor) { this.idAuditor = idAuditor; }

    public Long getNumrun() { return numrun; }
    public void setNumrun(Long numrun) { this.numrun = numrun; }

    public String getDvRun() { return dvRun; }
    public void setDvRun(String dvRun) { this.dvRun = dvRun; }

    public Long getCodComuna() { return codComuna; }
    public void setCodComuna(Long codComuna) { this.codComuna = codComuna; }

    public Long getCodProfesion() { return codProfesion; }
    public void setCodProfesion(Long codProfesion) { this.codProfesion = codProfesion; }

    public String getAppaterno() { return appaterno; }
    public void setAppaterno(String appaterno) { this.appaterno = appaterno; }

    public String getApmaterno() { return apmaterno; }
    public void setApmaterno(String apmaterno) { this.apmaterno = apmaterno; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Integer getCodEstCivil() { return codEstCivil; }
    public void setCodEstCivil(Integer codEstCivil) { this.codEstCivil = codEstCivil; }

    public Integer getPuntaje() { return puntaje; }
    public void setPuntaje(Integer puntaje) { this.puntaje = puntaje; }

    public Integer getSueldo() { return sueldo; }
    public void setSueldo(Integer sueldo) { this.sueldo = sueldo; }

    public Integer getCodAfp() { return codAfp; }
    public void setCodAfp(Integer codAfp) { this.codAfp = codAfp; }

    public Integer getCodIsapre() { return codIsapre; }
    public void setCodIsapre(Integer codIsapre) { this.codIsapre = codIsapre; }

    public Integer getCodIpContrato() { return codIpContrato; }
    public void setCodIpContrato(Integer codIpContrato) { this.codIpContrato = codIpContrato; }

    public Long getNumrunSup() { return numrunSup; }
    public void setNumrunSup(Long numrunSup) { this.numrunSup = numrunSup; }
}
