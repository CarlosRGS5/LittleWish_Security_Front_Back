package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.PuntuacionDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Puntuacion;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IPuntuacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/puntuacion")
public class PuntuacionController {
    @Autowired
    private IPuntuacionService pU;
    @PostMapping
    public void insertar(@RequestBody PuntuacionDTO dto){
        ModelMapper m = new ModelMapper();
        Puntuacion u = m.map(dto, Puntuacion.class);
        pU.insert(u);
    }

    @GetMapping
    public List<PuntuacionDTO> listar() {
        return pU.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PuntuacionDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        pU.delete(id);
    }

}
