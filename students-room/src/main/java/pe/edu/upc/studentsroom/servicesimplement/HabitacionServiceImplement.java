package pe.edu.upc.studentsroom.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.studentsroom.dtos.DisponiblesDTO;
import pe.edu.upc.studentsroom.entities.Habitacion;
import pe.edu.upc.studentsroom.repositories.IHabitacionRepository;
import pe.edu.upc.studentsroom.services.IHabitacionService;

import java.util.ArrayList;
import java.util.List;

@Service
public class HabitacionServiceImplement implements IHabitacionService {
    @Autowired
    private IHabitacionRepository hR;
    @Override
    public void insert(Habitacion habitacion) {
        hR.save(habitacion);
    }

    @Override
    public List<Habitacion> list() {
        return hR.findAll();
    }

    @Override
    public void delete(int idHabitacion) {
        hR.deleteById(idHabitacion);
    }

    @Override
    public Habitacion listId(int idHabitacion) {
        return hR.findById(idHabitacion).orElse(new Habitacion());
    }

    @Override
    public List<Habitacion> habitacionesEntrePrecios(float p1, float p2) {
        return hR.habitacionEntrePrecios(p1,p2);
    }

    @Override
    public List<DisponiblesDTO> habitacionesDisponibles() {
        List<String[]> roomAva = hR.habitacionesDisponibles();
        List<DisponiblesDTO> roomAvaCount = new ArrayList<>();
        for (String[] data : roomAva){
            DisponiblesDTO dto =new DisponiblesDTO();
            dto.setCity(data[0]);
            dto.setDistrict(data[1]);
            dto.setCountDispo(Integer.parseInt(data[2]));
            roomAvaCount.add(dto);
        }
        return roomAvaCount;
    }

}
