package pe.edu.upc.studentsroom.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.studentsroom.dtos.StudentMessageDTO;
import pe.edu.upc.studentsroom.entities.Mensaje;
import pe.edu.upc.studentsroom.repositories.IMensajeRepository;
import pe.edu.upc.studentsroom.services.IMensajeService;

import java.util.ArrayList;
import java.util.List;


@Service
public class MensajeServiceImplement implements IMensajeService {
    @Autowired
    private IMensajeRepository mR;

    @Override
    public void insert(Mensaje mensaje) {
        mR.save(mensaje);
    }

    @Override
    public List<Mensaje> list() {
        return mR.findAll();
    }

    @Override
    public void delete(int idMensaje) {
        mR.deleteById(idMensaje);
    }

    @Override
    public Mensaje listId(int idMensaje) {
        return mR.findById(idMensaje).orElse(new Mensaje());
    }


}
