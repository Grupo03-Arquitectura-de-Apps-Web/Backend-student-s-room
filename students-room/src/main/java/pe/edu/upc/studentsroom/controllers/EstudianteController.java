package pe.edu.upc.studentsroom.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.studentsroom.dtos.EstudianteDTO;
import pe.edu.upc.studentsroom.dtos.PlanDTO;
import pe.edu.upc.studentsroom.entities.Estudiante;
import pe.edu.upc.studentsroom.services.IEstudianteService;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    private IEstudianteService eS;
    @PostMapping
    public void insert (@RequestBody EstudianteDTO dto){
        ModelMapper m=new ModelMapper();
        Estudiante e=m.map(dto,Estudiante.class);
        eS.insert(e);

    }
    @GetMapping
    public List<EstudianteDTO> list(){
        return eS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,EstudianteDTO.class);
        }).collect(Collectors.toList());
    }
}
