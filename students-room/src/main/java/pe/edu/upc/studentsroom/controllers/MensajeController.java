package pe.edu.upc.studentsroom.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.studentsroom.dtos.MensajeDTO;
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
    public void insert(@RequestBody MensajeDTO dto) {
        ModelMapper m = new ModelMapper();
        Mensaje a = m.map(dto, Mensaje.class);
        mS.insert(a);
    }

    @GetMapping
    public List<MensajeDTO> list() {
        return mS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MensajeDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        mS.delete(id);
    }

    @PutMapping
    public void update(@RequestBody MensajeDTO dto) {
        ModelMapper m = new ModelMapper();
        Mensaje a = m.map(dto, Mensaje.class);
        mS.insert(a);
    }
}
