package pe.edu.upc.studentsroom.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void insert (@RequestBody PublicacionDTO dto){
        ModelMapper m=new ModelMapper();
        Publicacion e=m.map(dto,Publicacion.class);
        pS.insert(e);
    }

    @GetMapping
    public List<PublicacionDTO> list(){
        return pS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PublicacionDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        pS.delete(id);
    }

    @GetMapping("/{id}")
    public PublicacionDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        PublicacionDTO dto=m.map(pS.listId(id),PublicacionDTO.class);
        return dto;
    }

    @PutMapping
    public void update (@RequestBody PublicacionDTO dto){
        ModelMapper m=new ModelMapper();
        Publicacion e=m.map(dto,Publicacion.class);
        pS.insert(e);
    }
}
