package pe.edu.upc.aaw.littlewishproject.dtos;

import javax.persistence.Column;

public class CarrerasDTO {
    private int idCarrera;
    private String nameCarreras;

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNameCarreras() {
        return nameCarreras;
    }

    public void setNameCarreras(String nameCarreras) {
        this.nameCarreras = nameCarreras;
    }
}
