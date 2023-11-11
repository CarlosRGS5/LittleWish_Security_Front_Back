package pe.edu.upc.aaw.littlewishproject.entities;

import org.apache.catalina.User;

import javax.persistence.*;

@Entity
@Table(name = "Role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "rol", nullable = false,length = 45)
    private String rol;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private Users users;

    public Role() {
    }

    public Role(int id, String rol, Users users) {
        this.id = id;
        this.rol = rol;
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
