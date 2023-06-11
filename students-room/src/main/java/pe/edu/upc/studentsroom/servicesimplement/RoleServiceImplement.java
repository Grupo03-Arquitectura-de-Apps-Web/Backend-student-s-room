package pe.edu.upc.studentsroom.servicesimplement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.studentsroom.entities.Role;
import pe.edu.upc.studentsroom.repositories.IRoleRepository;
import pe.edu.upc.studentsroom.services.IRoleService;


@Service
public class RoleServiceImplement implements IRoleService {
    @Autowired
    private IRoleRepository rR;

    @Override
    public void insert(Role role) {
        rR.save(role);
    }

    @Override
    public List<Role> list() {
        // TODO Auto-generated method stub
        return rR.findAll();
    }
}
