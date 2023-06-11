package pe.edu.upc.studentsroom.services;
import java.util.List;
import pe.edu.upc.studentsroom.entities.Users;


public interface IUserService {
    public Integer insert(Users user);

    List<Users> list();

}
