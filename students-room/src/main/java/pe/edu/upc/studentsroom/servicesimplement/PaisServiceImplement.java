package pe.edu.upc.studentsroom.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.studentsroom.entities.Pais;
import pe.edu.upc.studentsroom.repositories.IPaisRepository;
import pe.edu.upc.studentsroom.services.IPaisService;

import java.util.List;

@Service
public class PaisServiceImplement implements IPaisService {
    @Autowired
    private IPaisRepository psR;

    @Override
    public void insert(Pais pais){
        psR.save(pais);
    }
    @Override
    public List<Pais> list(){
        return psR.findAll();
    }

    @Override
    public void delete(int idPais) {
        psR.deleteById(idPais);
    }

    @Override
    public Pais listId(int idPais) {
        return psR.findById(idPais).orElse(new Pais());
    }

}
