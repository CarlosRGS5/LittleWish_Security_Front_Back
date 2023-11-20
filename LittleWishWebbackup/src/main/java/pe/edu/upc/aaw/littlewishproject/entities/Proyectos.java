package pe.edu.upc.aaw.littlewishproject.entities;

import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Proyectos")
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idproyecto;
    @Column(name = "nombre", length = 45, nullable = false)
    private String nombre;
    @Column(name = "descripcion", length = 300, nullable = false)
    private String descripcion;
    @Column(name = "fechainicio", nullable = false)
    private LocalDate fechaInicio;
    @Column(name = "fechafin",nullable = false)
    private LocalDate fechaFin;
    @Column(name = "puestobuscado",nullable = false)
    private String puestrobuscado;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private Users users;

    public Proyectos() {
    }

    public Proyectos(int idproyecto, String nombre, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, String puestrobuscado, Users users) {
        this.idproyecto = idproyecto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.puestrobuscado = puestrobuscado;
        this.users = users;
    }

    public int getIdproyecto() {
        return idproyecto;
    }

    public void setIdproyecto(int idproyecto) {
        this.idproyecto = idproyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getPuestrobuscado() {
        return puestrobuscado;
    }

    public void setPuestrobuscado(String puestrobuscado) {
        this.puestrobuscado = puestrobuscado;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
