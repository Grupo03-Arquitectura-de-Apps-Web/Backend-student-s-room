package pe.edu.upc.studentsroom.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.studentsroom.dtos.TipoHabitacionDTO;
import pe.edu.upc.studentsroom.entities.TipoHabitacion;
import pe.edu.upc.studentsroom.services.ITipoHabitacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipo_habitacion")
public class TipoHabitacionController {
    @Autowired
    private ITipoHabitacionService pS;

    @PostMapping
    public void insert(@RequestBody TipoHabitacionDTO dto){
        ModelMapper m=new ModelMapper();
        TipoHabitacion p=m.map(dto,TipoHabitacion.class);
        pS.insert(p);
    }
    @GetMapping
    public List<TipoHabitacionDTO> list(){
        return pS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TipoHabitacionDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        pS.delete(id);
    }

    @GetMapping("/{id}")
    public TipoHabitacionDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        TipoHabitacionDTO dto=m.map(pS.listId(id),TipoHabitacionDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody TipoHabitacionDTO dto) {
        ModelMapper m = new ModelMapper();
        TipoHabitacion p = m.map(dto, TipoHabitacion.class);
        pS.insert(p);
    }

    @PostMapping("/buscador")
    public List<TipoHabitacionDTO> BuscarTipoHabitacion(@RequestBody String tipo) {
        return pS.buscarTipoHabitacion(tipo).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,TipoHabitacionDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/contador")
    public int contadorPorTipoHabitacion(){
        return pS.contadorPorTipoHabitacion();
    }
}
