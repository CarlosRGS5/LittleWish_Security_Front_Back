package pe.edu.upc.aaw.littlewishproject.dtos;

import pe.edu.upc.aaw.littlewishproject.entities.*;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class CurriculumVitaeDTO {
    private int id_cv;
    private Idiomas idiomas;
    private Certificaciones certificaciones;
    private Experiencia_Laboral experiencia_laboral;
    private Formacion_Academica formacion_academica;
    private UsersDTO users;

    public int getId_cv() {
        return id_cv;
    }

    public void setId_cv(int id_cv) {
        this.id_cv = id_cv;
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

    public Formacion_Academica getFormacion_academica() {
        return formacion_academica;
    }

    public void setFormacion_academica(Formacion_Academica formacion_academica) {
        this.formacion_academica = formacion_academica;
    }

    public UsersDTO getUsers() {
        return users;
    }

    public void setUsers(UsersDTO users) {
        this.users = users;
    }
}