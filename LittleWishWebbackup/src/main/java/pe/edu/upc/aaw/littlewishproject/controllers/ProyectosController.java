package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.ProyectosDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Proyectos;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IProyectosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/proyectos")

public class ProyectosController {
    @Autowired
    private IProyectosService pS;

    @PostMapping
    public void Registrar(@RequestBody ProyectosDTO dto) {
        ModelMapper m = new ModelMapper();
        Proyectos t = m.map(dto, Proyectos.class);
        pS.insert(t);
    }

    @GetMapping
    public List<ProyectosDTO> listar() {
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProyectosDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void modificar(@RequestBody ProyectosDTO dto) {
        ModelMapper m = new ModelMapper();
        Proyectos p = m.map(dto, Proyectos.class);
        pS.insert(p);
    }


}
