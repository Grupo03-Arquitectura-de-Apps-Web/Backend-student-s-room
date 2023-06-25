package pe.edu.upc.studentsroom.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.studentsroom.dtos.ClientesDeArrendadorDTO;
import pe.edu.upc.studentsroom.entities.ContratoDeAlquiler;
import pe.edu.upc.studentsroom.repositories.IContratoDeAlquilerRepository;
import pe.edu.upc.studentsroom.services.IContratoDeAlquilerService;
<<<<<<< HEAD
import java.text.ParseException;
import java.text.SimpleDateFormat;
=======

import java.time.LocalDate;
import java.util.ArrayList;
>>>>>>> master
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
    public List<ContratoDeAlquiler> reporte10(LocalDate f1, LocalDate f2) {
        return cdaR.ContratoEntreFechas(f1,f2);
    }

    @Override
    public List<ClientesDeArrendadorDTO> reporte07(String arrendador) {
        List<String[]> clientedearrendador = cdaR.ClientesDeArrendador(arrendador);
        List<ClientesDeArrendadorDTO> c = new ArrayList<>();
        for (String[] data : clientedearrendador) {
            ClientesDeArrendadorDTO dto = new ClientesDeArrendadorDTO();
            dto.setNombre(data[0]);
            dto.setFecha_pago(parseDate(data[1]));
            dto.setFecha_vencimiento(parseDate(data[2]));
            dto.setArrendador(data[3]);
            c.add(dto);
        }
        return c;
    }
    private Date parseDate(String dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

}
