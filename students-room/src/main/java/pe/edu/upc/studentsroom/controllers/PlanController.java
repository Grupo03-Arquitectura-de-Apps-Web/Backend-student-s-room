package pe.edu.upc.studentsroom.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.studentsroom.dtos.PlanDTO;
import pe.edu.upc.studentsroom.entities.Plan;
import pe.edu.upc.studentsroom.services.IPlanService;

import java.util.List;
import java.util.stream.Collectors;

@RestController//Con esto le digo que es de tipo rest para el uso de json
@RequestMapping("/planes")//para asignar la ruta de acceso a la clase petController
public class PlanController {
    //Para acceder a los metodos de service desde esta clase
    @Autowired
    private IPlanService pS;
    @PostMapping//Hace que se alinee con el front para el intercambio de datos
    public void insert(@RequestBody PlanDTO dto){
        ModelMapper m=new ModelMapper();
        Plan p=m.map(dto,Plan.class);
        pS.insert(p);
    }

    @GetMapping
    public List<PlanDTO> list(){
        return pS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PlanDTO.class);
        }).collect(Collectors.toList());
    }
}
