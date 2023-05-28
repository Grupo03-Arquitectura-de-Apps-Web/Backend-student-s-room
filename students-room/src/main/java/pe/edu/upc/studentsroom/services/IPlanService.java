package pe.edu.upc.studentsroom.services;

import pe.edu.upc.studentsroom.entities.Plan;

import java.util.List;

public interface IPlanService {
    public void insert(Plan plan);
    List<Plan> list();
    public void delete(int idPlan);
    public Plan listId(int idPlan);
}
