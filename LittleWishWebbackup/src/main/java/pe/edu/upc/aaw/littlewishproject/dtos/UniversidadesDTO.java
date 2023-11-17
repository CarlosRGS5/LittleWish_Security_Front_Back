package pe.edu.upc.aaw.littlewishproject.dtos;

import java.time.LocalDate;

public class UniversidadesDTO {
    private int idUniversidad;
    private String nameUniversidades;
    private LocalDate fechaIngreso;
    private LocalDate fechaEgreso;

    public int getIdUniversidad() {
        return idUniversidad;
    }

    public void setIdUniversidad(int idUniversidad) {
        this.idUniversidad = idUniversidad;
    }

    public String getNameUniversidades() {
        return nameUniversidades;
    }

    public void setNameUniversidades(String nameUniversidades) {
        this.nameUniversidades = nameUniversidades;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(LocalDate fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }
}