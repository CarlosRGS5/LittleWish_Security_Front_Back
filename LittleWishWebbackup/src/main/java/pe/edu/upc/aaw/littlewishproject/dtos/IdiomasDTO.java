package pe.edu.upc.aaw.littlewishproject.dtos;

import javax.persistence.Column;

public class IdiomasDTO {
    private Long idIdiomas;

    private String idiomas;

    private String nivelEscrito;

    private String nivelOral;

    public Long getID_Idiomas() {
        return idIdiomas;
    }

    public void setID_Idiomas(Long ID_Idiomas) {
        this.idIdiomas = ID_Idiomas;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getNivelEscrito() {
        return nivelEscrito;
    }

    public void setNivelEscrito(String nivelEscrito) {
        this.nivelEscrito = nivelEscrito;
    }

    public String getNivelOral() {
        return nivelOral;
    }

    public void setNivelOral(String nivelOral) {
        this.nivelOral = nivelOral;
    }
}