package pe.edu.upc.aaw.littlewishproject.servicesinterfaces;

import pe.edu.upc.aaw.littlewishproject.entities.Users;
import pe.edu.upc.aaw.littlewishproject.dtos.UserRoleCountDTO;

import java.util.List;

public interface IUserService {
    public void insert(Users users);
    public List<Users> list();
    public void delete(long id);
    public Users listarId(long id);
    public Users obtenerUsuarioxUsername(String username);
    List<UserRoleCountDTO> countUsersByRoleDTO();



}
