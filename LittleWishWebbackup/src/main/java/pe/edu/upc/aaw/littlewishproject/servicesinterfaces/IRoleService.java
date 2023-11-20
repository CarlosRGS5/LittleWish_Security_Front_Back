package pe.edu.upc.aaw.littlewishproject.servicesinterfaces;

import pe.edu.upc.aaw.littlewishproject.entities.Role;
import pe.edu.upc.aaw.littlewishproject.entities.Users;

import java.util.List;

public interface IRoleService {
    public void insert(Role role);
    public void delete(int id);
    public List<Role> list();
    public Role listarId(int id);
}
