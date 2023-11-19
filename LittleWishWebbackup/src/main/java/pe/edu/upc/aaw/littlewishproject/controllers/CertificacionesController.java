package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.CertificacionesDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Certificaciones;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.ICertificacionesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/certificaciones")
public class CertificacionesController {
    @Autowired
    private ICertificacionesService cS;

    @PostMapping
    public void registrar(@RequestBody CertificacionesDTO dto) {
        ModelMapper m = new ModelMapper();
        Certificaciones c = m.map(dto, Certificaciones.class);
        cS.insert(c);
    }

    @GetMapping
    public List<CertificacionesDTO> listar() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CertificacionesDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public CertificacionesDTO getCertificacionById(@PathVariable int id) {
        Certificaciones certificacion = cS.listId(id);

        CertificacionesDTO certificacionDTO = new CertificacionesDTO();
        certificacionDTO.setID_Certificaciones(certificacion.getID_Certificaciones());
        certificacionDTO.setNombreCertificaciones(certificacion.getNombreCertificaciones());
        certificacionDTO.setEmpresaEmisora(certificacion.getEmpresaEmisora());
        certificacionDTO.setFechaExpedicion(certificacion.getFechaExpedicion());
        certificacionDTO.setFechaCaducidad(certificacion.getFechaCaducidad());
        certificacionDTO.setUrlCredencial(certificacion.getUrlCredencial());

        return certificacionDTO;
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        cS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody CertificacionesDTO dto) {
        ModelMapper m = new ModelMapper();
        Certificaciones c = m.map(dto, Certificaciones.class);
        cS.insert(c);
    }
}