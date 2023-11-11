package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.Experiencia_LaboralDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Experiencia_Laboral;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IExperiencia_LaboralService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/experiencia_laboral")
public class Experiencia_LaboralController {

    @Autowired
    private IExperiencia_LaboralService elS;

    @PostMapping
    public void registrar(@RequestBody Experiencia_LaboralDTO dto) {
        ModelMapper m = new ModelMapper();
        Experiencia_Laboral u = m.map(dto, Experiencia_Laboral.class);
        elS.insert(u);
    }

    @GetMapping
    public List<Experiencia_LaboralDTO> listar() {
        return elS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, Experiencia_LaboralDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping
    public void eliminar(@RequestParam("id") Integer id) {
        elS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Experiencia_LaboralDTO dto) {
        ModelMapper m = new ModelMapper();
        Experiencia_Laboral exp = m.map(dto, Experiencia_Laboral.class);
        elS.insert(exp);
    }
}
