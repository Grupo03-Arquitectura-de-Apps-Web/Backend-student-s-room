package pe.edu.upc.studentsroom.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.studentsroom.dtos.PublicacionDTO;
import pe.edu.upc.studentsroom.entities.Publicacion;
import pe.edu.upc.studentsroom.services.IPublicacionService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/publicacion")
public class PublicacionController {

    @Autowired
    private IPublicacionService pS;
    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ARRENDADOR')")
    public void insert (@RequestBody PublicacionDTO dto){
        ModelMapper m=new ModelMapper();
        Publicacion e=m.map(dto,Publicacion.class);
        pS.insert(e);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ARRENDADOR') or hasAuthority('ESTUDIANTE')")
    public List<PublicacionDTO> list(){
        return pS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PublicacionDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ARRENDADOR')")
    public void delete(@PathVariable("id")Integer id){
        pS.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ARRENDADOR')")
    public PublicacionDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        PublicacionDTO dto=m.map(pS.listId(id),PublicacionDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ARRENDADOR')")
    public void update (@RequestBody PublicacionDTO dto){
        ModelMapper m=new ModelMapper();
        Publicacion e=m.map(dto,Publicacion.class);
        pS.insert(e);
    }
}
