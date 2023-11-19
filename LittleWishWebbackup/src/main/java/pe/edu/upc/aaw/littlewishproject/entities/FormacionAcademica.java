package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "FormacionAcademica")
public class FormacionAcademica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFormacionAcademica;
    @Column(name = "nombreSecundaria", length = 45, nullable = false)
    private String nombreSecundaria;
    @ManyToOne
    @JoinColumn(name = "idUniversidad")
    private Universidades universidades;
    @ManyToOne
    @JoinColumn(name = "idCarrera")
    private Carreras carreras;

    public FormacionAcademica() {
    }

    public FormacionAcademica(int idFormacionAcademica, String nombreSecundaria, Universidades universidades, Carreras carreras) {
        this.idFormacionAcademica = idFormacionAcademica;
        this.nombreSecundaria = nombreSecundaria;
        this.universidades = universidades;
        this.carreras = carreras;
    }

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

