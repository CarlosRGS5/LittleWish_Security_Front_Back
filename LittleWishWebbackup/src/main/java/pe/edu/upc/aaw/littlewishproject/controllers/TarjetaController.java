package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.CarrerasDTO;
import pe.edu.upc.aaw.littlewishproject.dtos.TarjetaDTO;
import pe.edu.upc.aaw.littlewishproject.dtos.UsersDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Tarjeta;
import pe.edu.upc.aaw.littlewishproject.entities.Users;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.ITarjetaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tarjetas")
public class TarjetaController {
    @Autowired
    private ITarjetaService tS;

    @PostMapping
    public void Registrar(@RequestBody TarjetaDTO dto){
        ModelMapper m=new ModelMapper();
        Tarjeta t=m.map(dto,Tarjeta.class);
        tS.insert(t);
    }
    @GetMapping
    public List<TarjetaDTO> listar() {
        return tS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TarjetaDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public TarjetaDTO listarId(@PathVariable("id") Integer idTarjeta) {
        ModelMapper m=new ModelMapper();
        TarjetaDTO dto=m.map(tS.listarId(idTarjeta),TarjetaDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody TarjetaDTO dto) {
        ModelMapper m = new ModelMapper();
        Tarjeta u = m.map(dto, Tarjeta.class);
        tS.insert(u);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        tS.delete(id);
    }

}
