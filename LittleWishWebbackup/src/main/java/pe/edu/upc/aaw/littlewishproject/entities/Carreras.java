package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "Carreras")
public class Carreras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCarrera;
    @Column(name = "nameCarreras", length = 45, nullable = false)
    private String nameCarreras;

    public Carreras() {
    }

    public Carreras(int idCarrera, String nameCarreras) {
        this.idCarrera = idCarrera;
        this.nameCarreras = nameCarreras;
    }

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