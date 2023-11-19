package pe.edu.upc.aaw.littlewishproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishproject.dtos.UsersDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Tarjeta;
import pe.edu.upc.aaw.littlewishproject.entities.Users;
import pe.edu.upc.aaw.littlewishproject.repositories.UserRepository;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IUserService;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {
    @Autowired
    private UserRepository uR;

    private final PasswordEncoder passwordEncoder;

    @Override
    public List<Users> list() {
        return uR.findAll();
    }

    @Override

    public void delete(long id) {
        uR.deleteById(id);
    }

    @Override
    public Users listarId(long id) {
        return uR.findById(id).orElse(new Users());
    }

    @Override
    public Users obtenerUsuarioxUsername(String username){ return uR.findByUsername(username);}

    public UserServiceImplement(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
        passwordEncoder = new BCryptPasswordEncoder();
    }

    @Override
    public void insert(Users users) {
        String encoderPassword = this.passwordEncoder.encode(users.getPassword());
        users.setPassword(encoderPassword);
        if(users.getEnabled() == null)
            users.setEnabled(true);
        uR.save(users);
    }

}
