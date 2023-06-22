package pe.edu.upc.studentsroom.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.studentsroom.dtos.ArrendadorDTO;
import pe.edu.upc.studentsroom.dtos.DisponiblesDTO;
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


    @GetMapping("/{precioI}/{precioF}")
    public List<HabitacionDTO> habitacionesEntrePrecios(@PathVariable("precioI")float p1,@PathVariable("precioF") float p2){
        return hS.habitacionesEntrePrecios(p1,p2).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, HabitacionDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/disponibles")
    public List<DisponiblesDTO> habitacionesDisponibles() {
        List<DisponiblesDTO> disponiblesDTOS = hS.habitacionesDisponibles();
        return disponiblesDTOS;
    }
}
