package pe.edu.upc.studentsroom.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.studentsroom.dtos.EstudianteDTO;
import pe.edu.upc.studentsroom.dtos.PlanDTO;
import pe.edu.upc.studentsroom.dtos.StudentMessageDTO;
import pe.edu.upc.studentsroom.entities.Estudiante;
import pe.edu.upc.studentsroom.services.IEstudianteService;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    private IEstudianteService eS;
    @PostMapping
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public void insert (@RequestBody EstudianteDTO dto){
        ModelMapper m=new ModelMapper();
        Estudiante e=m.map(dto,Estudiante.class);
        eS.insert(e);

    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority('ADMIN','ARRENDADOR')")
    public List<EstudianteDTO> list(){
        return eS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,EstudianteDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id")Integer id){
        eS.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN', 'ESTUDIANTE','ARRENDADOR')")
    public EstudianteDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        EstudianteDTO dto=m.map(eS.listId(id),EstudianteDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'ESTUDIANTE')")
    public void update (@RequestBody EstudianteDTO dto){
        ModelMapper m=new ModelMapper();
        Estudiante e=m.map(dto,Estudiante.class);
        eS.insert(e);
    }


    @GetMapping("/buscador")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<EstudianteDTO> findByCorreo(@RequestParam("busqueda") String busqueda) {
        return eS.findByCorreo(busqueda).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,EstudianteDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/reporte04")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<StudentMessageDTO> getCountMessagesPerStudent() {
        List<StudentMessageDTO> studentMessageDTOs = eS.reporte04();
        return studentMessageDTOs;
    }
}
