package pe.edu.upc.pc2.services;

import pe.edu.upc.pc2.dtos.DTOMatch;
import pe.edu.upc.pc2.dtos.DTOResult;

import java.util.List;

public interface MatchService {

    public DTOMatch add(DTOMatch dtoMatch);

    public void deleteMatch(Long id);

}
