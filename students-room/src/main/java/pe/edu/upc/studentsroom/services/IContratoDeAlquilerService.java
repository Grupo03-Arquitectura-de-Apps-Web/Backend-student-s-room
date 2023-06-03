package pe.edu.upc.studentsroom.services;

import pe.edu.upc.studentsroom.entities.ContratoDeAlquiler;

import java.util.List;

public interface IContratoDeAlquilerService {

    public void insert(ContratoDeAlquiler contratodealquiler);
    List<ContratoDeAlquiler> list();

    public void delete(int id_contratodealquier);

    public ContratoDeAlquiler listId(int id_contratodealquier);
}