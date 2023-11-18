package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "Comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComentario;
    @Column(name = "comentario", nullable = false, length = 200)
    private String comentario;

    @Column(name = "puntuacion", nullable = true)
    private int puntuacion;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users users;

    @ManyToOne
    @JoinColumn(name = "user_receptor_id", nullable = false)
    private Users usersR;

    public Comentario() {
    }


    public Users getUsersR() {
        return usersR;
    }

    public void setUsersR(Users usersR) {
        this.usersR = usersR;
    }

    public Comentario(int idComentario, String comentario, Users users, Users usersR, int puntuacion) {
        this.idComentario = idComentario;
        this.comentario = comentario;
        this.users = users;
        this.usersR = usersR;
        this.puntuacion = puntuacion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }


}




