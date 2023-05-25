package pe.edu.upc.studentsroom.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.studentsroom.entities.Plan;
import pe.edu.upc.studentsroom.repositories.IPlanRepository;
import pe.edu.upc.studentsroom.services.IPlanService;

import java.util.List;

//Enlazar la capa service con repository
@Service
public class PlanServiceimplement implements IPlanService {
    //para acceder desde aqui al repository
    @Autowired //Para traer los métodos necesarios, no todos, para no perder recursos
    private IPlanRepository pR;

    @Override //Se genera automáticamente
    public void insert(Plan plan) {
        pR.save(plan); //funcion pre elaborada,
    }

    @Override
    public List<Plan> list() {
        return pR.findAll();
    }
}
