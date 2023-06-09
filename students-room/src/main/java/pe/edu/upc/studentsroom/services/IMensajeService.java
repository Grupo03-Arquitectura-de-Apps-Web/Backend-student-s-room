package pe.edu.upc.studentsroom.services;

import pe.edu.upc.studentsroom.dtos.ConteoxEstadoDTO;
import pe.edu.upc.studentsroom.entities.Mensaje;

import java.util.List;

public interface IMensajeService {
    public void insert(Mensaje mensaje);
    List<Mensaje> list();
    public void delete(int idMensaje);
    public Mensaje listId(int idMensaje);
    public List<ConteoxEstadoDTO> reporte5();
}
