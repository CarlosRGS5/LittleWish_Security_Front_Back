package pe.edu.upc.aaw.littlewishproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.aaw.littlewishproject.entities.Users;
import pe.edu.upc.aaw.littlewishproject.dtos.UserRoleCountDTO;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    public Users findByUsername(String username);

    @Query("SELECT NEW pe.edu.upc.aaw.littlewishproject.dtos.UserRoleCountDTO(r.rol, COUNT(u.id)) FROM Users u JOIN u.roles r GROUP BY r.rol")
    List<UserRoleCountDTO> countUsersByRoleDTO();

    //BUSCAR POR NOMBRE
    @Query("select count(u.username) from Users u where u.username =:username")
    public int buscarUsername(@Param("username") String nombre);


    //INSERTAR ROLES
    @Transactional
    @Modifying
    @Query(value = "insert into roles (rol, user_id) VALUES (:rol, :user_id)", nativeQuery = true)
    public void insRol(@Param("rol") String authority, @Param("user_id") Long user_id);
}