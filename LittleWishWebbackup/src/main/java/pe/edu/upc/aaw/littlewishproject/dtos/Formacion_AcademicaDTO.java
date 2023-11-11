package pe.edu.upc.aaw.littlewishproject.dtos;

import pe.edu.upc.aaw.littlewishproject.entities.Carreras;
import pe.edu.upc.aaw.littlewishproject.entities.Universidades;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Formacion_AcademicaDTO {
    private int ID_Formacion_academica;
    private String Nombre_Secundaria;
    private Universidades universidades;
    private Carreras carreras;

    public int getID_Formacion_academica() {
        return ID_Formacion_academica;
    }

    public void setID_Formacion_academica(int ID_Formacion_academica) {
        this.ID_Formacion_academica = ID_Formacion_academica;
    }

    public String getNombre_Secundaria() {
        return Nombre_Secundaria;
    }

    public void setNombre_Secundaria(String nombre_Secundaria) {
        Nombre_Secundaria = nombre_Secundaria;
    }

    public Universidades getUniversidades() {
        return universidades;
    }

    public void setUniversidades(Universidades universidades) {
        this.universidades = universidades;
    }

    public Carreras getCarreras() {
        return carreras;
    }

    public void setCarreras(Carreras carreras) {
        this.carreras = carreras;
    }
}
