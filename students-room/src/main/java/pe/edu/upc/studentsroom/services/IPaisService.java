package pe.edu.upc.studentsroom.services;

import pe.edu.upc.studentsroom.entities.Pais;

import java.util.List;

public interface IPaisService {
    public void insert(Pais pais);
    List<Pais> list();
}
