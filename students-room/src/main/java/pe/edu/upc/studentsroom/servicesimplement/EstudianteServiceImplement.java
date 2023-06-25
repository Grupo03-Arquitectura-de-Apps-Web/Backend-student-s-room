package pe.edu.upc.studentsroom.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.studentsroom.dtos.StudentMessageDTO;
import pe.edu.upc.studentsroom.entities.Estudiante;
import pe.edu.upc.studentsroom.repositories.IEstudianteRepository;
import pe.edu.upc.studentsroom.services.IEstudianteService;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstudianteServiceImplement implements IEstudianteService {

    @Autowired
    private IEstudianteRepository eR;

    @Override
    public void insert(Estudiante estudiante) {
        eR.save(estudiante);
    }

    @Override
    public List<Estudiante> list() {
        return eR.findAll();
    }

    @Override
    public List<Estudiante> findByCorreo(String busqueda) {
        return eR.findByCorreo(busqueda );
    }

    @Override
    public void delete(int idEstudiante) {
        eR.deleteById(idEstudiante);
    }

    @Override
    public Estudiante listId(int idEstudiante) {
        return eR.findById(idEstudiante).orElse(new Estudiante());
    }

    @Override
    public List<StudentMessageDTO> reporte04() {
        List<String[]> result = eR.getCountMessagesPerStudent();
        List<StudentMessageDTO> studentMessageDTOs = new ArrayList<>();

        for (String[] data : result) {
            StudentMessageDTO dto = new StudentMessageDTO();
            dto.setStudentName(data[0]);
            dto.setMessageCount(Integer.parseInt(data[1]));
            studentMessageDTOs.add(dto);
        }

        return studentMessageDTOs;
    }
}
