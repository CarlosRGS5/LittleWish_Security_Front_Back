package pe.edu.upc.aaw.littlewishproject.entities;

import org.apache.catalina.User;

import javax.persistence.*;
import java.util.NavigableMap;

@Entity
@Table(name = "CurriculumVitae")
public class CurriculumVitae {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cv;
    @ManyToOne
    @JoinColumn(name = "ID_Idiomas",nullable = false)
    private Idiomas idiomas;
    @ManyToOne
    @JoinColumn(name = "ID_Certifaciones",nullable = false)
    private Certificaciones certificaciones;
    @ManyToOne
    @JoinColumn(name = "ID_Experiencia_Laboral",nullable = false)
    private Experiencia_Laboral experiencia_laboral;
    @ManyToOne
    @JoinColumn(name = "ID_Formacion_academica",nullable = false)
    private Formacion_Academica formacion_academica;
    @OneToOne
    @JoinColumn(name = "user_id",nullable = false)
    private Users users;

    public CurriculumVitae() {
    }

    public CurriculumVitae(int id_cv, Idiomas idiomas, Certificaciones certificaciones, Experiencia_Laboral experiencia_laboral, Formacion_Academica formacion_academica, Users users) {
        this.id_cv = id_cv;
        this.idiomas = idiomas;
        this.certificaciones = certificaciones;
        this.experiencia_laboral = experiencia_laboral;
        this.formacion_academica = formacion_academica;
        this.users = users;
    }

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

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}