package pe.edu.upc.pc2.services;

import pe.edu.upc.pc2.dtos.DTOUser;
import pe.edu.upc.pc2.entities.User;

public interface UserService {

    public User findById (Long id);
    public DTOUser findByIdDTO (Long id);
    public User findByUsername(String username);

    public User addUser(DTOUser dtoUser);
    public User addUser(User user);
    //aqui se va a usar un DTO



}
