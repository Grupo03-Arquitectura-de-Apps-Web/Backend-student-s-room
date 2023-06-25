package pe.edu.upc.studentsroom.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.studentsroom.dtos.ClientesDeArrendadorDTO;
import pe.edu.upc.studentsroom.entities.ContratoDeAlquiler;
import pe.edu.upc.studentsroom.repositories.IContratoDeAlquilerRepository;
import pe.edu.upc.studentsroom.services.IContratoDeAlquilerService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class ContratoDeAlquilerServiceImplement implements IContratoDeAlquilerService {

    @Autowired
    private IContratoDeAlquilerRepository cdaR;

    @Override
    public void insert(ContratoDeAlquiler contratodealquiler) {
        cdaR.save(contratodealquiler);
    }

    @Override
    public List<ContratoDeAlquiler> list() {
        return cdaR.findAll();
    }

    @Override
    public void delete(int id_contratodealquier) {
        cdaR.deleteById(id_contratodealquier);
    }

    @Override
    public ContratoDeAlquiler listId(int id_contratodealquier) {
        return cdaR.findById(id_contratodealquier).orElse(new ContratoDeAlquiler());
    }

    @Override
    public List<ContratoDeAlquiler> reporte10(Date f1, Date f2) {
        return null;
    }

    @Override
    public List<ClientesDeArrendadorDTO> reporte06() {
        List<String[]> clientedearrendador = cdaR.ClientesDeArrendador();
        List<ClientesDeArrendadorDTO> c = new ArrayList<>();
        for (String[] data : clientedearrendador) {
            ClientesDeArrendadorDTO dto = new ClientesDeArrendadorDTO();
            dto.setArrendador(data[0]);
            dto.setNombre(data[1]);
            dto.setTelefono((data[2]));
            dto.setUbicacion((data[3]));
            c.add(dto);
        }
        return c;
    }
    @Override
    public List<ContratoDeAlquiler> reporte10(LocalDate f1, LocalDate f2) {
        return cdaR.ContratoEntreFechas(f1,f2);
    }



}
