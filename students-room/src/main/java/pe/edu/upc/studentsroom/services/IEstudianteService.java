package pe.edu.upc.studentsroom.services;

import pe.edu.upc.studentsroom.entities.Estudiante;

import java.util.List;

public interface IEstudianteService {
    public void insert(Estudiante estudiante);
    List<Estudiante> list();
}
