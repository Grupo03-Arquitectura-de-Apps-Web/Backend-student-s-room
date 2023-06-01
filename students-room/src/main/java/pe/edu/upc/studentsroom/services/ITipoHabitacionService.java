package pe.edu.upc.studentsroom.services;

import pe.edu.upc.studentsroom.entities.TipoHabitacion;

import java.util.List;

public interface ITipoHabitacionService {
    public void insert(TipoHabitacion tipoHabitacion);
    List<TipoHabitacion> list();
    public void delete(int idTipoHabitacion);
    public TipoHabitacion listId(int idTipoHabitacion);
    List<TipoHabitacion> buscarTipoHabitacion(String tipo);
    public int contadorPorTipoHabitacion();
}
