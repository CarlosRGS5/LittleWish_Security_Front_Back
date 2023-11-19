package pe.edu.upc.aaw.littlewishproject.dtos;

import pe.edu.upc.aaw.littlewishproject.entities.*;

public class CurriculumVitaeDTO {
    private int idCv;
    private Idiomas idiomas;
    private Certificaciones certificaciones;
    private Experiencia_Laboral experiencia_laboral;
    private FormacionAcademica formacionAcademica;

    public int getIdCv() {
        return idCv;
    }

    public void setIdCv(int idCv) {
        this.idCv = idCv;
    }

    public Idiomas getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(Idiomas idiomas) {
        this.idiomas = idiomas;
    }

    public Certificaciones getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(Certificaciones certificaciones) {
        this.certificaciones = certificaciones;
    }

    public Experiencia_Laboral getExperiencia_laboral() {
        return experiencia_laboral;
    }

    public void setExperiencia_laboral(Experiencia_Laboral experiencia_laboral) {
        this.experiencia_laboral = experiencia_laboral;
    }

    public FormacionAcademica getFormacionAcademica() {
        return formacionAcademica;
    }

    public void setFormacionAcademica(FormacionAcademica formacionAcademica) {
        this.formacionAcademica = formacionAcademica;
    }
}