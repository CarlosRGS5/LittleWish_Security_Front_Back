package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.ProyectosDTO;
import pe.edu.upc.aaw.littlewishproject.dtos.ProyectosDesarrolladorDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Proyectos;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IProyectosService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/proyectoss")
public class ProyectosController {
    @Autowired
    private IProyectosService pS;

    @PostMapping
    public void Registrar(@RequestBody ProyectosDTO dto) {
        ModelMapper m = new ModelMapper();
        Proyectos t = m.map(dto, Proyectos.class);
        pS.insert(t);
    }
    @PutMapping
    public void modificar(@RequestBody ProyectosDTO dto) {
        ModelMapper m = new ModelMapper();
        Proyectos u = m.map(dto, Proyectos.class);
        pS.insert(u);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pS.delete(id);
    }

    @GetMapping("/{id}")
    public ProyectosDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        ProyectosDTO dto=m.map(pS.listarId(id),ProyectosDTO.class);
        return dto;
    }

    @GetMapping
    public List<ProyectosDTO> listar() {
        return pS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ProyectosDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/cantidades")
    public List<ProyectosDesarrolladorDTO> cantidadCursosPorUniversidad() {
        List<String[]> lista = pS.quantityProyectDesarrollador();
        List<ProyectosDesarrolladorDTO> listaDTO = new ArrayList<>();
        for (String[] data : lista) {
            ProyectosDesarrolladorDTO dto = new ProyectosDesarrolladorDTO();
            dto.setNameDesarrollador(data[0]);
            dto.setQuantityProyects(Integer.parseInt(data[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }


}

