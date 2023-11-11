package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.TarjetaDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Tarjeta;
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
    @GetMapping//obtener
    public List<TarjetaDTO> listar(){
        //Usamos get para obtener los
        return  tS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TarjetaDTO.class);
        }).collect(Collectors.toList());
    }
}
