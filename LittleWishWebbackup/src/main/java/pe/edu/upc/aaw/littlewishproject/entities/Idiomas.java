package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "Idiomas")
public class Idiomas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIdiomas;

    @Column(name = "idiomas", length = 45, nullable = false)
    private String idiomas;

    @Column(name = "nivelEscrito", length = 50, nullable = false)
    private String nivelEscrito;

    @Column(name = "nivelOral", nullable = false)
    private String nivelOral;

    public Idiomas() {
    }

    public Idiomas(Long ID_Idiomas, String idiomas, String nivelEscrito, String nivelOral) {
        this.idIdiomas = ID_Idiomas;
        this.idiomas = idiomas;
        this.nivelEscrito = nivelEscrito;
        this.nivelOral = nivelOral;
    }

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
