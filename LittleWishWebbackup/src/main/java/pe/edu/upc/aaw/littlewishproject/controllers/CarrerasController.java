package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.CarrerasDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Carreras;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.ICarrerasService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/carreras")
public class CarrerasController {
    @Autowired
    private ICarrerasService cS;

    @PostMapping
    public void registrar(@RequestBody CarrerasDTO dto) {
        ModelMapper m = new ModelMapper();
        Carreras c = m.map(dto, Carreras.class);
        cS.insert(c);
    }

    @GetMapping
    public List<CarrerasDTO> listar() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CarrerasDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping
    public void eliminar(@RequestParam("id") Integer id) {
        cS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody CarrerasDTO dto) {
        ModelMapper m = new ModelMapper();
        Carreras c = m.map(dto, Carreras.class);
        cS.insert(c);
    }
}
