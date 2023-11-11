package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "Puntuacion")
public class Puntuacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPuntuacion;
    @Column(name = "Puntos", nullable = false, length = 35)
    private int puntos;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users users;

    public Puntuacion() {
    }

    public Puntuacion(int idPuntuacion, int puntos, Users users) {
        this.idPuntuacion = idPuntuacion;
        this.puntos = puntos;
        this.users = users;
    }

    public int getIdPuntuacion() {
        return idPuntuacion;
    }

    public void setIdPuntuacion(int idPuntuacion) {
        this.idPuntuacion = idPuntuacion;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
