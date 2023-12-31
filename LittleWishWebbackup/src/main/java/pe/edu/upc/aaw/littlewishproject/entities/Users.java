package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "users")
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Name", length = 45, nullable = false)
    private String Name;
    @Column(name = "Apellidos", length = 45, nullable = false)
    private String Apellidos;
    @Column(name = "DNI", nullable = false)
    private int DNI;
    @Column(name = "Correo", length = 45, nullable = false)
    private String Correo;
    @Column(name = "Telefono", nullable = false)
    private int Telefono;
    @Column(name = "Empresa", length = 45, nullable = true)
    private String Empresa;
    @Column(name ="username",length = 30, unique = true)
    private String username;
    @Column(name ="Password", length = 200)
    private String Password;
    private Boolean enabled;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Role> roles;
    @OneToMany(mappedBy = "users")
    private List<Comentario> comentarios;

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public Users() {
    }

    public Users(Long id, String name, String apellidos, int DNI, String correo, int telefono, String empresa, String username, String password, Boolean enabled, List<Role> roles, List<Comentario> comentarios) {
        this.id = id;
        Name = name;
        Apellidos = apellidos;
        this.DNI = DNI;
        Correo = correo;
        Telefono = telefono;
        Empresa = empresa;
        this.username = username;
        Password = password;
        this.enabled = enabled;
        this.roles = roles;
        this.comentarios = comentarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
