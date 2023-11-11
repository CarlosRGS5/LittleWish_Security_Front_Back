package pe.edu.upc.aaw.littlewishproject.entities;

import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Proyectos")
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_proyecto;
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
    @OneToOne
    @JoinColumn(name = "idPuntuacion",nullable = false)
    private Puntuacion puntuacion;
    @OneToOne
    @JoinColumn(name = "idComentario",nullable = false)
    private Comentario comentario;
    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private Users users;

    public Proyectos() {
    }

    public Proyectos(int id_proyecto, String nombre, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, String puestrobuscado, Puntuacion puntuacion, Comentario comentario, Users users) {
        this.id_proyecto = id_proyecto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.puestrobuscado = puestrobuscado;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
        this.users = users;
    }

    public int getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
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

    public Puntuacion getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Puntuacion puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
