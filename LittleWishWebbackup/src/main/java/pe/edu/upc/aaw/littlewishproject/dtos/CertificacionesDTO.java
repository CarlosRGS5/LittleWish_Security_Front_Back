package pe.edu.upc.aaw.littlewishproject.dtos;

import javax.persistence.Column;
import java.time.LocalDate;

public class CertificacionesDTO {
    private Long idCertificaciones;
    private String nombreCertificaciones;
    private String empresaEmisora;
    private LocalDate fechaExpedicion;
    private LocalDate fechaCaducidad;
    private String urlCredencial;

    public Long getID_Certificaciones() {
        return idCertificaciones;
    }

    public void setID_Certificaciones(Long idCertificaciones) {
        this.idCertificaciones = idCertificaciones;
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
