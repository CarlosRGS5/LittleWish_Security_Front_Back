package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "Idiomas")
public class Idiomas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Idiomas;

    @Column(name = "idiomas", length = 45, nullable = false)
    private String idiomas;

    @Column(name = "nivelEscrito", length = 50, nullable = false)
    private String nivelEscrito;

    @Column(name = "nivelOral", nullable = false)
    private String nivelOral;

    public Idiomas() {
    }

    public Idiomas(int ID_Idiomas, String idiomas, String nivelEscrito, String nivelOral) {
        this.ID_Idiomas = ID_Idiomas;
        this.idiomas = idiomas;
        this.nivelEscrito = nivelEscrito;
        this.nivelOral = nivelOral;
    }

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
