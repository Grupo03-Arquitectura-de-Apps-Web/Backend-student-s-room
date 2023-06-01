package pe.edu.upc.studentsroom.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.studentsroom.dtos.PublicacionFavoritaDTO;
import pe.edu.upc.studentsroom.entities.Publicación_Favorita;
import pe.edu.upc.studentsroom.services.IPublicacion_FavoritaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/publicacionesfavoritas")
public class PublicacionFavoritaController {

    @Autowired
    private IPublicacion_FavoritaService pfS;

    @PostMapping
    public void insert(@RequestBody PublicacionFavoritaDTO dto) {
        ModelMapper m = new ModelMapper();
        Publicación_Favorita p = m.map(dto, Publicación_Favorita.class);
        pfS.insert(p);
    }

    @GetMapping
    public List<PublicacionFavoritaDTO> list() {
        return pfS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PublicacionFavoritaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        pfS.delete(id);
    }

    @GetMapping("/{id}")
    public PublicacionFavoritaDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        PublicacionFavoritaDTO dto=m.map(pfS.listId(id),PublicacionFavoritaDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody PublicacionFavoritaDTO dto) {
        ModelMapper m = new ModelMapper();
        Publicación_Favorita p = m.map(dto, Publicación_Favorita.class);
        pfS.insert(p);
    }
}
