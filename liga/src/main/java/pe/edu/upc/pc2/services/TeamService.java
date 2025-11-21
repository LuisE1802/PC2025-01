package pe.edu.upc.pc2.services;

import pe.edu.upc.pc2.dtos.DTOTeam;
import pe.edu.upc.pc2.entities.Team;

import java.util.List;

public interface TeamService {

    public List<DTOTeam> listAll();

    public Team findById(Long id);

    public DTOTeam add(DTOTeam dtoTeam);


}
