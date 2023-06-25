package pe.edu.upc.studentsroom.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.studentsroom.dtos.ClientesDeArrendadorDTO;
import pe.edu.upc.studentsroom.dtos.ConteoxEstadoDTO;
import pe.edu.upc.studentsroom.dtos.ContratoDeAlquilerDTO;
import pe.edu.upc.studentsroom.entities.ContratoDeAlquiler;
import pe.edu.upc.studentsroom.services.IContratoDeAlquilerService;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/contratodealquiler")
public class ContratoDeAlquilerController {

    @Autowired
    private IContratoDeAlquilerService cdaS;
    @PostMapping
    public void insert (@RequestBody ContratoDeAlquilerDTO dto){
        ModelMapper m=new ModelMapper();
        ContratoDeAlquiler e=m.map(dto, ContratoDeAlquiler.class);
        cdaS.insert(e);
    }

    @GetMapping
    public List<ContratoDeAlquilerDTO> list(){
        return cdaS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ContratoDeAlquilerDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        cdaS.delete(id);
    }

    @GetMapping("/{id}")
    public ContratoDeAlquilerDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        ContratoDeAlquilerDTO dto=m.map(cdaS.listId(id),ContratoDeAlquilerDTO.class);
        return dto;
    }

    @PutMapping
    public void update (@RequestBody ContratoDeAlquilerDTO dto){
        ModelMapper m=new ModelMapper();
        ContratoDeAlquiler e=m.map(dto,ContratoDeAlquiler.class);
        cdaS.insert(e);
    }

    @GetMapping("/reporte07/{arrendador}")
    public List<ClientesDeArrendadorDTO> ClientesDeArrendador(@PathVariable("arrendador") String arrendador) {
        List<ClientesDeArrendadorDTO> clientesDeArrendadorDTOS = cdaS.reporte07(arrendador);
        return clientesDeArrendadorDTOS;
    }

}


        //List<ClientesDeArrendadorDTO> clientesDeArrendadorDTOS = cdaS.reporte07(arrendador);
        //return clientesDeArrendadorDTOS;