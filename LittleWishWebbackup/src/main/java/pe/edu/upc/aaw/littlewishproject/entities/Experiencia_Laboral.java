package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Experiencia_Laboral")
public class Experiencia_Laboral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Experiencia_laboral;
    @Column(name = "Empresa", length = 45, nullable = false)
    private String Empresa;

    @Column(name = "Cargo", length = 50, nullable = false)
    private String Cargo;

    @Column(name = "FechaInicio", nullable = false)
    private LocalDate FechaInicio;

    @Column(name = "FechaFinalizado", nullable = false)
    private LocalDate FechaFinalizado;

    public Experiencia_Laboral() {
    }

    public Experiencia_Laboral(int ID_Experiencia_laboral, String empresa, String cargo, LocalDate fechaInicio, LocalDate fechaFinalizado) {
        this.ID_Experiencia_laboral = ID_Experiencia_laboral;
        Empresa = empresa;
        Cargo = cargo;
        FechaInicio = fechaInicio;
        FechaFinalizado = fechaFinalizado;
    }

    public int getID_Experiencia_laboral() {
        return ID_Experiencia_laboral;
    }

    public void setID_Experiencia_laboral(int ID_Experiencia_laboral) {
        this.ID_Experiencia_laboral = ID_Experiencia_laboral;
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