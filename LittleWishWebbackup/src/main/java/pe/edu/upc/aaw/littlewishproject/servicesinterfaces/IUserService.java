package pe.edu.upc.aaw.littlewishproject.servicesinterfaces;

import pe.edu.upc.aaw.littlewishproject.entities.Users;

import java.util.List;

public interface IUserService {
    public void insert(Users users);
    public List<Users> list();
}
