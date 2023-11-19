package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Universidades")
public class Universidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUniversidad;
    @Column(name = "nameUniversidades", length = 45, nullable = false)
    private String nameUniversidades;
    @Column(name = "fechaIngreso", nullable = false)
    private LocalDate fechaIngreso;
    @Column(name = "fechaEgreso", nullable = false)
    private LocalDate fechaEgreso;

    public Universidades() {
    }

    public Universidades(int idUniversidad, String nameUniversidades, LocalDate fechaIngreso, LocalDate fechaEgreso) {
        this.idUniversidad = idUniversidad;
        this.nameUniversidades = nameUniversidades;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
    }

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