package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Tarjeta")
public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTarjeta;
    @Column(name = "numeroTarjeta",nullable = false)
    private long numeroTarjeta;
    @Column(name = "fechaexp",nullable = false)
    private LocalDate fechaexp;
    @Column(name = "nombre",length = 50,nullable = false)
    private String nombre;
    @Column(name = "apellido",length = 50,nullable = false)
    private String apellido;
    @Column(name = "cvv",nullable = false)
    private int cvv;

    public Tarjeta() {
    }

    public Tarjeta(int idTarjeta, long numeroTarjeta, LocalDate fechaexp, String nombre, String apellido, int cvv) {
        this.idTarjeta = idTarjeta;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaexp = fechaexp;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cvv = cvv;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public long getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public LocalDate getFechaexp() {
        return fechaexp;
    }

    public void setFechaexp(LocalDate fechaexp) {
        this.fechaexp = fechaexp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
}
