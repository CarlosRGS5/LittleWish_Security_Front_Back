package pe.edu.upc.aaw.littlewishproject.entities;


import javax.persistence.*;

@Entity
@Table(name = "Favoritos")
public class Favoritos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFavoritos;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users users;

    public Favoritos(){
    }

    public Favoritos(int idFavoritos, Users users) {
        this.idFavoritos = idFavoritos;
        this.users = users;
    }

    public int getIdFavoritos() {
        return idFavoritos;
    }

    public void setIdFavoritos(int idFavoritos) {
        this.idFavoritos = idFavoritos;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
