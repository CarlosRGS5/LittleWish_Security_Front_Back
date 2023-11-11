package pe.edu.upc.aaw.littlewishproject.dtos;

import javax.persistence.Column;

public class CarrerasDTO {
    private int ID_Carrera;
    private String nameCarreras;
    public int getID_Carrera() {
        return ID_Carrera;
    }

    public void setID_Carrera(int ID_Carrera) {
        this.ID_Carrera = ID_Carrera;
    }

    public String getNameCarreras() {
        return nameCarreras;
    }

    public void setNameCarreras(String nameCarreras) {
        this.nameCarreras = nameCarreras;
    }
}
