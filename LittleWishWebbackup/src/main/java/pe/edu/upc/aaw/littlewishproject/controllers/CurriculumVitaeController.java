package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.CurriculumVitaeDTO;
import pe.edu.upc.aaw.littlewishproject.entities.CurriculumVitae;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.ICurriculumVitaeService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/CurriculumVitae")
public class CurriculumVitaeController {
    @Autowired
    private ICurriculumVitaeService cvS;

    @PostMapping
    public void registrar(@RequestBody CurriculumVitaeDTO dto) {
        ModelMapper m = new ModelMapper();
        CurriculumVitae cv = m.map(dto, CurriculumVitae.class);
        cvS.insert(cv);
    }

    @GetMapping
    public List<CurriculumVitaeDTO> listar() {
        return cvS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CurriculumVitaeDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        cvS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody CurriculumVitaeDTO dto) {
        ModelMapper m = new ModelMapper();
        CurriculumVitae c = m.map(dto, CurriculumVitae.class);
        cvS.insert(c);
    }
    @GetMapping("/{id}")
    public CurriculumVitaeDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        CurriculumVitaeDTO dto=m.map(cvS.listarId(id),CurriculumVitaeDTO.class);
        return dto;
    }
}