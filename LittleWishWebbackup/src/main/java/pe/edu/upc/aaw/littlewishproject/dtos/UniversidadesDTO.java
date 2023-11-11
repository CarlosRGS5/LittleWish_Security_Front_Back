package pe.edu.upc.aaw.littlewishproject.dtos;

import java.time.LocalDate;

public class UniversidadesDTO {
    private int ID_Universidad;
    private String nameUniversidades;
    private LocalDate FechaIngreso;
    private LocalDate FechaEgreso;

    public int getID_Universidad() {
        return ID_Universidad;
    }

    public void setID_Universidad(int ID_Universidad) {
        this.ID_Universidad = ID_Universidad;
    }

    public String getNameUniversidades() {
        return nameUniversidades;
    }

    public void setNameUniversidades(String nameUniversidades) {
        this.nameUniversidades = nameUniversidades;
    }

    public LocalDate getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        FechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaEgreso() {
        return FechaEgreso;
    }

    public void setFechaEgreso(LocalDate fechaEgreso) {
        FechaEgreso = fechaEgreso;
    }
}