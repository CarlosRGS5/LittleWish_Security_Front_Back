package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "Certificaciones")
public class Certificaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Certificaciones;

    @Column(name = "nombreCertificaciones", length = 45, nullable = false)
    private String nombreCertificaciones;

    @Column(name = "empresaEmisora", length = 50, nullable = false)
    private String empresaEmisora;

    @Column(name = "fechaExpedicion", nullable = false)
    private LocalDate fechaExpedicion;

    @Column(name = "fechaCaducidad", nullable = false)
    private LocalDate fechaCaducidad;

    @Column(name = "urlCredencial", length = 50, nullable = false)
    private String urlCredencial;

    public Certificaciones() {
    }

    public Certificaciones(int ID_Certificaciones, String nombreCertificaciones, String empresaEmisora, LocalDate fechaExpedicion, LocalDate fechaCaducidad, String urlCredencial) {
        this.ID_Certificaciones = ID_Certificaciones;
        this.nombreCertificaciones = nombreCertificaciones;
        this.empresaEmisora = empresaEmisora;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaCaducidad = fechaCaducidad;
        this.urlCredencial = urlCredencial;
    }

    public int getID_Certificaciones() {
        return ID_Certificaciones;
    }

    public void setID_Certificaciones(int ID_Certificaciones) {
        this.ID_Certificaciones = ID_Certificaciones;
    }

    public String getNombreCertificaciones() {
        return nombreCertificaciones;
    }

    public void setNombreCertificaciones(String nombreCertificaciones) {
        this.nombreCertificaciones = nombreCertificaciones;
    }

    public String getEmpresaEmisora() {
        return empresaEmisora;
    }

    public void setEmpresaEmisora(String empresaEmisora) {
        this.empresaEmisora = empresaEmisora;
    }

    public LocalDate getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(LocalDate fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getUrlCredencial() {
        return urlCredencial;
    }

    public void setUrlCredencial(String urlCredencial) {
        this.urlCredencial = urlCredencial;
    }
}