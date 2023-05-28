package pe.edu.upc.studentsroom.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.studentsroom.dtos.TipoHabitacionDTO;
import pe.edu.upc.studentsroom.dtos.UniversidadDTO;
import pe.edu.upc.studentsroom.entities.Universidad;
import pe.edu.upc.studentsroom.services.IUniversidadService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/universidad")
public class UniversidadController {
    @Autowired
    private IUniversidadService pS;

    @PostMapping
    public void insert(@RequestBody UniversidadDTO dto){
        ModelMapper n=new ModelMapper();
        Universidad p=n.map(dto, Universidad.class);
        pS.insert(p);

    }

    @GetMapping
    public List<UniversidadDTO> list(){
        return pS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UniversidadDTO.class);
        }).collect(Collectors.toList());
    }
}
