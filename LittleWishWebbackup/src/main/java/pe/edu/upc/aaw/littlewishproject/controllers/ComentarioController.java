package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.ComentarioDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Comentario;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IComentarioService;
import pe.edu.upc.aaw.littlewishproject.dtos.ReportePuntuacionDTO;

import java.util.ArrayList;
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

    @GetMapping("/{id}")
    public List<ComentarioDTO> listByUser(@PathVariable("id") Long idUser) {
        return cS.listByUser(idUser).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ComentarioDTO.class);
        }).collect(Collectors.toList());
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

    @GetMapping("/valoracion")
    public List<ReportePuntuacionDTO> valoracionPorUsuario() {
        List<String[]> lista = cS.valoracionPorUsuario();
        List<ReportePuntuacionDTO> listaDTO = new ArrayList<>();
        for (String[] data : lista) {
            ReportePuntuacionDTO dto = new ReportePuntuacionDTO();
            dto.setUserId(Integer.parseInt(data[0]));
            dto.setUserName(data[1]);
            dto.setNroPuntuacion(Integer.parseInt(data[2]));
            dto.setSumPuntuacion(Integer.parseInt(data[3]));
            dto.setAvgPuntuacion(Float.parseFloat(data[4]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }


}