package pe.edu.upc.studentsroom.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.studentsroom.dtos.ArrendadorDTO;
import pe.edu.upc.studentsroom.dtos.EstudianteDTO;
import pe.edu.upc.studentsroom.dtos.HabitacionDTO;
import pe.edu.upc.studentsroom.entities.Arrendador;
import pe.edu.upc.studentsroom.entities.Habitacion;
import pe.edu.upc.studentsroom.services.IHabitacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/habitaciones")
public class HabitacionController {
    @Autowired
    private IHabitacionService hS;

    @PostMapping
    public void insert(@RequestBody HabitacionDTO dto) {
        ModelMapper m = new ModelMapper();
        Habitacion v = m.map(dto, Habitacion.class);
        hS.insert(v);
    }

    @GetMapping
    public List<HabitacionDTO> list() {
        return hS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, HabitacionDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        hS.delete(id);
    }

    @GetMapping("/{id}")
    public HabitacionDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        HabitacionDTO dto=m.map(hS.listId(id),HabitacionDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody HabitacionDTO dto) {
        ModelMapper m = new ModelMapper();
        Habitacion a = m.map(dto, Habitacion.class);
        hS.insert(a);
    }
}
