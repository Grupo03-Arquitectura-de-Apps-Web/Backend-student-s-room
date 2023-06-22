package pe.edu.upc.studentsroom.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.studentsroom.dtos.DistritoDTO;
import pe.edu.upc.studentsroom.dtos.HabitacionDTO;
import pe.edu.upc.studentsroom.entities.Distrito;
import pe.edu.upc.studentsroom.entities.Habitacion;
import pe.edu.upc.studentsroom.services.IDistritoService;
import pe.edu.upc.studentsroom.services.IHabitacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/distritos")
public class DistritoController {
    @Autowired
    private IDistritoService dS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insert(@RequestBody DistritoDTO dto) {
        ModelMapper m = new ModelMapper();
        Distrito v = m.map(dto, Distrito.class);
        dS.insert(v);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<DistritoDTO> list() {
        return dS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DistritoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id")Integer id){
        dS.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public DistritoDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        DistritoDTO dto=m.map(dS.listId(id),DistritoDTO.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void update(@RequestBody DistritoDTO dto) {
        ModelMapper m = new ModelMapper();
        Distrito a = m.map(dto, Distrito.class);
        dS.insert(a);
    }
}
