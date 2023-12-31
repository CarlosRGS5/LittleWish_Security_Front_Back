package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.UsersDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Users;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IUserService;
import pe.edu.upc.aaw.littlewishproject.dtos.UserRoleCountDTO;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private IUserService uS;

    @PostMapping
    public void registrar(@RequestBody UsersDTO dto) {
        ModelMapper m = new ModelMapper();
        Users u = m.map(dto, Users.class);
        uS.insert(u);
    }

    @GetMapping
    public List<UsersDTO> listar() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsersDTO.class);
        }).collect(Collectors.toList());
    }


    @GetMapping("/{username}")
   // public List<ComentarioDTO> listByUser(@PathVariable("id") Long idUser)
    public UsersDTO obtenerUsuarioxUsername(@PathVariable("username") String username) {
        ModelMapper m = new ModelMapper();
        UsersDTO u = m.map(uS.obtenerUsuarioxUsername(username), UsersDTO.class);
        return u;

    }
    @PutMapping
    public void modificar(@RequestBody UsersDTO dto) {
        ModelMapper m = new ModelMapper();
        Users u = m.map(dto, Users.class);
        uS.insert(u);
    }
    /*@GetMapping("/{id}")
    public UsersDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        UsersDTO dto=m.map(uS.listarId(id),UsersDTO.class);
        return dto;
    }*/
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        uS.delete(id);
    }

    @GetMapping("/countByRoleDTO")
    public List<UserRoleCountDTO> countUsersByRoleDTO() {
        return uS.countUsersByRoleDTO();
    }





}
