package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "Carreras")
public class Carreras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Carrera;
    @Column(name = "nameCarreras", length = 45, nullable = false)
    private String nameCarreras;

    public Carreras() {
    }

    public Carreras(int ID_Carrera, String nameCarreras) {
        this.ID_Carrera = ID_Carrera;
        this.nameCarreras = nameCarreras;
    }

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