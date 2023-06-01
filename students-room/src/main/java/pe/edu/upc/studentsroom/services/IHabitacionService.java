package pe.edu.upc.studentsroom.services;

import pe.edu.upc.studentsroom.entities.Distrito;
import pe.edu.upc.studentsroom.entities.Habitacion;

import java.time.LocalDate;
import java.util.List;

public interface IHabitacionService {
    public void insert(Habitacion habitacion);
    List<Habitacion> list();
    public void delete(int idHabitacion);

    public Habitacion listId(int idHabitacion);

}
