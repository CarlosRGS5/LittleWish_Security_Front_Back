package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "Comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComentario;
    @Column(name = "comentario", nullable = false, length = 35)
    private String comentario;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users users;

    public Comentario() {
    }

    public Comentario(int idComentario, String comentario, Users users) {
        this.idComentario = idComentario;
        this.comentario = comentario;
        this.users = users;
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
