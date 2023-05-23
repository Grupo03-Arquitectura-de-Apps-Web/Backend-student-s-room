package pe.edu.upc.studentsroom.services;

import pe.edu.upc.studentsroom.entities.TipoHabitacion;

import java.util.List;

public interface ITipoHabitacionService {
    public void insert(TipoHabitacion tipoHabitacion);
    List<TipoHabitacion> list();
}
