package pe.edu.upc.aaw.littlewishproject.dtos;

import javax.persistence.Column;
import java.time.LocalDate;

public class Experiencia_LaboralDTO {
    private Long idExperiencia_laboral;
    private String Empresa;
    private String Cargo;
    private LocalDate FechaInicio;
    private LocalDate FechaFinalizado;

    public Long getID_Experiencia_laboral() {
        return idExperiencia_laboral;
    }

    public void setID_Experiencia_laboral(Long ID_Experiencia_laboral) {
        this.idExperiencia_laboral = ID_Experiencia_laboral;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public LocalDate getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinalizado() {
        return FechaFinalizado;
    }

    public void setFechaFinalizado(LocalDate fechaFinalizado) {
        FechaFinalizado = fechaFinalizado;
    }
}
