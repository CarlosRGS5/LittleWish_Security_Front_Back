package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "CurriculumVitae")
public class CurriculumVitae {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCv")
    private int idCv;
    @ManyToOne
    @JoinColumn(name = "ID_Idiomas")
    private Idiomas idiomas;
    @ManyToOne
    @JoinColumn(name = "ID_Certifaciones")
    private Certificaciones certificaciones;
    @ManyToOne
    @JoinColumn(name = "ID_Experiencia_Laboral")
    private Experiencia_Laboral experiencia_laboral;
    @ManyToOne
    @JoinColumn(name = "FormacionAcademica")
    private FormacionAcademica formacionAcademica;

    public CurriculumVitae() {
    }

    public CurriculumVitae(int idCv, Idiomas idiomas, Certificaciones certificaciones, Experiencia_Laboral experiencia_laboral, FormacionAcademica formacionAcademica) {
        this.idCv = idCv;
        this.idiomas = idiomas;
        this.certificaciones = certificaciones;
        this.experiencia_laboral = experiencia_laboral;
        this.formacionAcademica = formacionAcademica;
    }

    public int getIdCv() {
        return idCv;
    }

    public void setIdCv(int idCv) {
        this.idCv = idCv;
    }

    public Idiomas getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(Idiomas idiomas) {
        this.idiomas = idiomas;
    }

    public Certificaciones getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(Certificaciones certificaciones) {
        this.certificaciones = certificaciones;
    }

    public Experiencia_Laboral getExperiencia_laboral() {
        return experiencia_laboral;
    }

    public void setExperiencia_laboral(Experiencia_Laboral experiencia_laboral) {
        this.experiencia_laboral = experiencia_laboral;
    }

    public FormacionAcademica getFormacionAcademica() {
        return formacionAcademica;
    }

    public void setFormacionAcademica(FormacionAcademica formacionAcademica) {
        this.formacionAcademica = formacionAcademica;
    }
}
