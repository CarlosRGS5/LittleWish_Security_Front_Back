package pe.edu.upc.aaw.littlewishproject.dtos;

public class IdiomasDTO {
    private int ID_Idiomas;
    private String idiomas;
    private String nivelEscrito;
    private String nivelOral;

    public int getID_Idiomas() {
        return ID_Idiomas;
    }

    public void setID_Idiomas(int ID_Idiomas) {
        this.ID_Idiomas = ID_Idiomas;
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