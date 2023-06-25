package pe.edu.upc.studentsroom.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.studentsroom.dtos.MensajeDTO;
import pe.edu.upc.studentsroom.dtos.StudentMessageDTO;
import pe.edu.upc.studentsroom.entities.Mensaje;
import pe.edu.upc.studentsroom.services.IMensajeService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/mensajes")
public class MensajeController {
    @Autowired
    private IMensajeService mS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ARRENDADOR') or hasAuthority('ESTUDIANTE')")
    public void insert(@RequestBody MensajeDTO dto) {
        ModelMapper m = new ModelMapper();
        Mensaje a = m.map(dto, Mensaje.class);
        mS.insert(a);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ARRENDADOR') or hasAuthority('ESTUDIANTE')")
    public List<MensajeDTO> list() {
        return mS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MensajeDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id") Integer id) {
        mS.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ARRENDADOR') or hasAuthority('ESTUDIANTE')")
    public MensajeDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        MensajeDTO dto=m.map(mS.listId(id),MensajeDTO.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void update(@RequestBody MensajeDTO dto) {
        ModelMapper m = new ModelMapper();
        Mensaje a = m.map(dto, Mensaje.class);
        mS.insert(a);
    }

}
