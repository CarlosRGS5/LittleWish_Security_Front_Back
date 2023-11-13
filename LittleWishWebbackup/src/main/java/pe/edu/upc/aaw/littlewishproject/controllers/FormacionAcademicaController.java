package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.FormacionAcademicaDTO;
import pe.edu.upc.aaw.littlewishproject.entities.FormacionAcademica;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IFormacion_AcademicaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/formacionacademica")
public class FormacionAcademicaController {
    @Autowired
    private IFormacion_AcademicaService faS;

    @PostMapping
    public void registrar(@RequestBody FormacionAcademicaDTO dto) {
        ModelMapper m = new ModelMapper();
        FormacionAcademica fa = m.map(dto, FormacionAcademica.class);
        faS.insert(fa);
    }

    @GetMapping
    public List<FormacionAcademicaDTO> listar() {
        return faS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, FormacionAcademicaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping
    public void eliminar(@RequestParam("id") Integer id) {
        faS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody FormacionAcademicaDTO dto) {
        ModelMapper m = new ModelMapper();
        FormacionAcademica fa = m.map(dto, FormacionAcademica.class);
        faS.insert(fa);
    }
}
