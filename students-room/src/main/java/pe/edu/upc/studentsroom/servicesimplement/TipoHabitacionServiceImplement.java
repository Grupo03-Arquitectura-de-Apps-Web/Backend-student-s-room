package pe.edu.upc.studentsroom.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.studentsroom.entities.TipoHabitacion;
import pe.edu.upc.studentsroom.repositories.ITipoHabitacionRepository;
import pe.edu.upc.studentsroom.services.ITipoHabitacionService;

import java.util.List;

@Service
public class TipoHabitacionServiceImplement implements ITipoHabitacionService {
    @Autowired
    private ITipoHabitacionRepository pR;


    @Override
    public void insert(TipoHabitacion tipoHabitacion) {
        pR.save(tipoHabitacion);
    }

    @Override
    public List<TipoHabitacion> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idTipoHabitacion) {
        pR.deleteById(idTipoHabitacion);
    }

    @Override
    public TipoHabitacion listId(int idTipoHabitacion) {
        return pR.findById(idTipoHabitacion).orElse(new TipoHabitacion());
    }

    @Override
    public List<TipoHabitacion> buscarTipoHabitacion(String tipo) {
        return pR.buscarTipoHabitacion(tipo);
    }

    @Override
    public int contadorPorTipoHabitacion() {
        return pR.contadorPorTipoHabitacion();
    }
}
