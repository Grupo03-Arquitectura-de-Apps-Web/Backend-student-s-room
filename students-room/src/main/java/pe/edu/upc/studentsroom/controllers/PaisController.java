package pe.edu.upc.studentsroom.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.studentsroom.dtos.PaisDTO;
import pe.edu.upc.studentsroom.entities.Pais;
import pe.edu.upc.studentsroom.services.IPaisService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/paises")
public class PaisController {
    @Autowired
    private IPaisService psS;

    @PostMapping
    public void insert(@RequestBody PaisDTO dtopais){
        ModelMapper m = new ModelMapper();
        Pais pais = m.map(dtopais, Pais.class);
        psS.insert(pais);
    }
    @GetMapping
    public List<PaisDTO> list(){
        return psS.list().stream().map(x->{
            ModelMapper m =new ModelMapper();
            return m.map(x,PaisDTO.class);
                }
        ).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        psS.delete(id);
    }

    @GetMapping("/{id}")
    public PaisDTO listID(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        PaisDTO dto = m.map(psS.listId(id),PaisDTO.class);
        return dto;
    }

    @PutMapping
    public void update(@RequestBody PaisDTO dto){
        ModelMapper m = new ModelMapper();
        Pais p = m.map(dto, Pais.class);
        psS.insert(p);
    }
}
