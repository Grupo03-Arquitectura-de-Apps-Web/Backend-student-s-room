package pe.edu.upc.studentsroom.services;

import pe.edu.upc.studentsroom.entities.Arrendador;

import java.util.List;

public interface IArrendadorService{
    public void insert(Arrendador arrendador);
    List<Arrendador> list();
    public void delete(int id_arrendador);
    public Arrendador listId(int id_arrendador);
}
