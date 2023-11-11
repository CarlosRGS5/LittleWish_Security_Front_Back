package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.ComentarioDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Comentario;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IComentarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comentario")
public class ComentarioController {
    @Autowired
    private IComentarioService cS;

    @PostMapping
    public void registrar(@RequestBody ComentarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Comentario u = m.map(dto, Comentario.class);
        cS.insert(u);
    }

    @GetMapping
    public List<ComentarioDTO> listar() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ComentarioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        cS.delete(id);
    }
}
