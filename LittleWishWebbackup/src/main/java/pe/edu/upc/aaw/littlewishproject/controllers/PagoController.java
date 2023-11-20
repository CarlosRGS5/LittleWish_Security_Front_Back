package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.PagoDTO;
import pe.edu.upc.aaw.littlewishproject.dtos.ProyectosDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Pago;
import pe.edu.upc.aaw.littlewishproject.entities.Proyectos;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IPagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pagos")
public class PagoController {
    @Autowired
    private IPagoService pS;

    @PostMapping
    public void Registrar(@RequestBody PagoDTO dto){
        ModelMapper mp=new ModelMapper();
        Pago pago=mp.map(dto,Pago.class);
        pS.insert(pago);
    }

    @PutMapping
    public void modificar(@RequestBody PagoDTO dto) {
        ModelMapper m = new ModelMapper();
        Pago u = m.map(dto, Pago.class);
        pS.insert(u);
    }
    @GetMapping
    public List<PagoDTO> Listar(){

        return pS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PagoDTO.class);
        }).collect(Collectors.toList());

    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pS.delete(id);
    }

    @GetMapping("/{id}")
    public PagoDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        PagoDTO dto=m.map(pS.listarId(id),PagoDTO.class);
        return dto;
    }
}
