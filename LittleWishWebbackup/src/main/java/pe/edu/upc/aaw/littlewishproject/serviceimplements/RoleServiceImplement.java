package pe.edu.upc.aaw.littlewishproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishproject.entities.Role;
import pe.edu.upc.aaw.littlewishproject.entities.Users;
import pe.edu.upc.aaw.littlewishproject.repositories.RoleRepository;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IRoleService;

import java.util.List;

@Service
public class RoleServiceImplement implements IRoleService {
    @Autowired
    private RoleRepository rR;

    @Override
    public void insert(Role role) {
        rR.save(role);
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

    @Override
    public List<Role> list() {
        return rR.findAll();
    }

    @Override
    public Role listarId(int id) {
        return rR.findById(id).orElse(new Role());
    }
}
