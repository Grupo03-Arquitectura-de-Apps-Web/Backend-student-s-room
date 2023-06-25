package pe.edu.upc.studentsroom.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.studentsroom.dtos.ClientesDeArrendadorDTO;
import pe.edu.upc.studentsroom.dtos.ConteoxEstadoDTO;
import pe.edu.upc.studentsroom.dtos.ContratoDeAlquilerDTO;
import pe.edu.upc.studentsroom.dtos.HabitacionDTO;
import pe.edu.upc.studentsroom.entities.ContratoDeAlquiler;
import pe.edu.upc.studentsroom.services.IContratoDeAlquilerService;

import java.time.LocalDate;
import java.util.Date;
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
<<<<<<< HEAD

    @GetMapping("/reporte07/{arrendador}")
    public List<ClientesDeArrendadorDTO> ClientesDeArrendador(@PathVariable("arrendador") String arrendador) {
        List<ClientesDeArrendadorDTO> clientesDeArrendadorDTOS = cdaS.reporte07(arrendador);
        return clientesDeArrendadorDTOS;
    }

=======
    @GetMapping("/{fechaI}/{fechaF}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<ContratoDeAlquilerDTO> ContratosEntreFechas(@PathVariable("fechaI") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate f1, @PathVariable("fechaF") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate f2) {
        return cdaS.reporte10(f1, f2).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ContratoDeAlquilerDTO.class);
        }).collect(Collectors.toList());
    }
>>>>>>> master
}


        //List<ClientesDeArrendadorDTO> clientesDeArrendadorDTOS = cdaS.reporte07(arrendador);
        //return clientesDeArrendadorDTOS;