package pe.edu.upc.aaw.littlewishproject.dtos;

import java.time.LocalDate;

public class CertificacionesDTO {
    private int ID_Certificaciones;
    private String nombreCertificaciones;
    private String empresaEmisora;
    private LocalDate fechaExpedicion;
    private LocalDate fechaCaducidad;
    private String urlCredencial;

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
