package pe.edu.upc.aaw.littlewishproject.dtos;

public class UserRoleCountDTO {
    private String rol;
    private Long userCount;

    // constructor, getters y setters

    public UserRoleCountDTO(String rol, Long userCount) {
        this.rol = rol;
        this.userCount = userCount;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Long getUserCount() {
        return userCount;
    }

    public void setUserCount(Long userCount) {
        this.userCount = userCount;
    }
}
