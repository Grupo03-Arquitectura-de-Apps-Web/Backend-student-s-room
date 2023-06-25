package pe.edu.upc.studentsroom.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.studentsroom.dtos.ArrendadorPorPlanDTO;
import pe.edu.upc.studentsroom.dtos.PlanDTO;
import pe.edu.upc.studentsroom.dtos.StudentMessageDTO;
import pe.edu.upc.studentsroom.entities.Plan;
import pe.edu.upc.studentsroom.repositories.IPlanRepository;
import pe.edu.upc.studentsroom.services.IPlanService;

import java.util.ArrayList;
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

    @Override
    public void delete(int idPlan) {
        pR.deleteById(idPlan);
    }

    @Override
    public Plan listId(int idPlan) {
        return pR.findById(idPlan).orElse(new Plan());
    }

    @Override
    public List<ArrendadorPorPlanDTO> reporte09() {
        List<String[]> result = pR.ArrendadoresPorPlan();
        List<ArrendadorPorPlanDTO> ArrendadorPorPlanDTOs = new ArrayList<>();

        for (String[] data : result) {
            ArrendadorPorPlanDTO dto = new ArrendadorPorPlanDTO();
            dto.setNombre_plan(data[0]);
            dto.setPrecio(Integer.parseInt(data[1]));
            dto.setId_arrendador(Integer.parseInt(data[2]));
            ArrendadorPorPlanDTOs.add(dto);
        }
        return ArrendadorPorPlanDTOs;
    }

}
