package pe.edu.upc.aaw.littlewishproject.dtos;

import pe.edu.upc.aaw.littlewishproject.entities.Comentario;
import pe.edu.upc.aaw.littlewishproject.entities.Puntuacion;
import pe.edu.upc.aaw.littlewishproject.entities.Users;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDate;

public class ProyectosDTO {
    private int id_proyecto;

    private String nombre;

    private String descripcion;

    private LocalDate fechaInicio;

    private LocalDate fechaFin;

    private String puestrobuscado;

    private PuntuacionDTO puntuacion;

    private ComentarioDTO comentario;

    private UsersDTO users;

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

    public PuntuacionDTO getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(PuntuacionDTO puntuacion) {
        this.puntuacion = puntuacion;
    }

    public ComentarioDTO getComentario() {
        return comentario;
    }

    public void setComentario(ComentarioDTO comentario) {
        this.comentario = comentario;
    }

    public UsersDTO getUsers() {
        return users;
    }

    public void setUsers(UsersDTO users) {
        this.users = users;
    }
}
