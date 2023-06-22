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
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ARRENDADOR')")
    public void insert(@RequestBody TipoHabitacionDTO dto){
        ModelMapper m=new ModelMapper();
        TipoHabitacion p=m.map(dto,TipoHabitacion.class);
        pS.insert(p);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ARRENDADOR') or hasAuthority('ESTUDIANTE')")
    public List<TipoHabitacionDTO> list(){
        return pS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TipoHabitacionDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ARRENDADOR')")
    public void delete(@PathVariable("id") Integer id) {
        pS.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ARRENDADOR')")
    public TipoHabitacionDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        TipoHabitacionDTO dto=m.map(pS.listId(id),TipoHabitacionDTO.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ARRENDADOR')")
    public void update(@RequestBody TipoHabitacionDTO dto) {
        ModelMapper m = new ModelMapper();
        TipoHabitacion p = m.map(dto, TipoHabitacion.class);
        pS.insert(p);
    }

    @PostMapping("/buscador")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<TipoHabitacionDTO> BuscarTipoHabitacion(@RequestBody String tipo) {
        return pS.buscarTipoHabitacion(tipo).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,TipoHabitacionDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/contador")
    @PreAuthorize("hasAuthority('ADMIN')")
    public int contadorPorTipoHabitacion(){
        return pS.contadorPorTipoHabitacion();
    }
}
