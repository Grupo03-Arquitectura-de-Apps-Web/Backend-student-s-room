package pe.edu.upc.studentsroom.services;

import pe.edu.upc.studentsroom.entities.ContratoDeAlquiler;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface IContratoDeAlquilerService {

    public void insert(ContratoDeAlquiler contratodealquiler);
    List<ContratoDeAlquiler> list();

    public void delete(int id_contratodealquier);

    public ContratoDeAlquiler listId(int id_contratodealquier);
    List<ContratoDeAlquiler> reporte10(LocalDate f1, LocalDate f2);
}
