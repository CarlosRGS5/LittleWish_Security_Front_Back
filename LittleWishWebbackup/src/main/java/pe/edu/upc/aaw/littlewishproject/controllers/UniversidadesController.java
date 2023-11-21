package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.CarrerasDTO;
import pe.edu.upc.aaw.littlewishproject.dtos.UniversidadesCarrerasDTO;
import pe.edu.upc.aaw.littlewishproject.dtos.UniversidadesDTO;
import pe.edu.upc.aaw.littlewishproject.dtos.UserRoleCountDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Universidades;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IUniversidadesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/universidad")
public class UniversidadesController {
    @Autowired
    private IUniversidadesService uS;

    @PostMapping
    public void registrar(@RequestBody UniversidadesDTO dto) {
        ModelMapper m = new ModelMapper();
        Universidades u = m.map(dto, Universidades.class);
        uS.insert(u);
    }

    @GetMapping
    public List<UniversidadesDTO> listar() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UniversidadesDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        uS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody UniversidadesDTO dto) {
        ModelMapper m = new ModelMapper();
        Universidades u = m.map(dto, Universidades.class);
        uS.insert(u);
    }

    @GetMapping("/{id}")
    public UniversidadesDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        UniversidadesDTO dto=m.map(uS.listarId(id),UniversidadesDTO.class);
        return dto;
    }
    @GetMapping("/contar")
    public UniversidadesCarrerasDTO contarUniversidades() {
        long cantidadUniversidades = uS.contarUniversidades();
        UniversidadesCarrerasDTO dto = new UniversidadesCarrerasDTO();
        dto.setCantidadUniversidades(cantidadUniversidades);
        return dto;
    }


}
