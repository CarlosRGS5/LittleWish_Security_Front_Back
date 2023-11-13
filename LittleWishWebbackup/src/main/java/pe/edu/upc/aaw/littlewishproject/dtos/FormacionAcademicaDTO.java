package pe.edu.upc.aaw.littlewishproject.dtos;

import pe.edu.upc.aaw.littlewishproject.entities.Carreras;
import pe.edu.upc.aaw.littlewishproject.entities.Universidades;

public class FormacionAcademicaDTO {
    private int idFormacionAcademica;
    private String nombreSecundaria;
    private Universidades universidades;
    private Carreras carreras;

    public int getIdFormacionAcademica() {
        return idFormacionAcademica;
    }

    public void setIdFormacionAcademica(int idFormacionAcademica) {
        this.idFormacionAcademica = idFormacionAcademica;
    }

    public String getNombreSecundaria() {
        return nombreSecundaria;
    }

    public void setNombreSecundaria(String nombreSecundaria) {
        this.nombreSecundaria = nombreSecundaria;
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
