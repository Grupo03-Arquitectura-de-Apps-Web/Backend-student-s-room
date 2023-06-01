package pe.edu.upc.studentsroom.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.studentsroom.dtos.PlanDTO;
import pe.edu.upc.studentsroom.dtos.TipoHabitacionDTO;
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

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        pS.delete(id);
    }

    @GetMapping("/{id}")
    public PlanDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        PlanDTO dto=m.map(pS.listId(id),PlanDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody PlanDTO dto) {
        ModelMapper m = new ModelMapper();
        Plan p = m.map(dto, Plan.class);
        pS.insert(p);
    }

    @PostMapping("/buscador")
    public List<PlanDTO> BuscarPlan(@RequestBody String nombre_plan) {
        return pS.buscarPlan(nombre_plan).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,PlanDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/contador")
    public int contador(){
        return pS.contador();
    }
}
