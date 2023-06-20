package pe.edu.upc.studentsroom.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.studentsroom.entities.Habitacion;
import pe.edu.upc.studentsroom.repositories.IHabitacionRepository;
import pe.edu.upc.studentsroom.services.IHabitacionService;

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

   // @Override
    //public List<Habitacion> habitacionesEntrePrecios(float p1, float p2) {
       // return hR.habitacionEntrePrecios(p1,p2);}

    //@Override
    //public List<Habitacion> habitacionesDisponibles() {
       // return hR.habitacionesdisponibles();
   // }
}
