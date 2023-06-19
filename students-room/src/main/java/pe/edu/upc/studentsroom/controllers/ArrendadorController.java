package pe.edu.upc.studentsroom.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.studentsroom.dtos.ArrendadorDTO;
import pe.edu.upc.studentsroom.entities.Arrendador;
import pe.edu.upc.studentsroom.services.IArrendadorService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/arrendadores")
public class ArrendadorController {
    @Autowired
    private IArrendadorService aS;

    @PostMapping

    public void insert(@RequestBody ArrendadorDTO dto) {
        ModelMapper m = new ModelMapper();
        Arrendador a = m.map(dto, Arrendador.class);
        aS.insert(a);
    }
    @GetMapping

    public List<ArrendadorDTO> list() {
        return aS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ArrendadorDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public ArrendadorDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        ArrendadorDTO dto=m.map(aS.listId(id),ArrendadorDTO.class);
        return dto;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        aS.delete(id);
    }

    @PutMapping
    public void update(@RequestBody ArrendadorDTO dto) {
        ModelMapper m = new ModelMapper();
        Arrendador a = m.map(dto, Arrendador.class);
        aS.insert(a);
    }
}
