package pe.edu.upc.pc2.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pc2.dtos.DTOMatch;
import pe.edu.upc.pc2.dtos.DTOResult;
import pe.edu.upc.pc2.dtos.DTOTeam;
import pe.edu.upc.pc2.entities.Match;
import pe.edu.upc.pc2.entities.Team;
import pe.edu.upc.pc2.exceptions.ResourceNotFoundException;
import pe.edu.upc.pc2.repositories.TeamRepository;
import pe.edu.upc.pc2.services.TeamService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamRepository teamRepository;

    @Override
    public List<DTOTeam> listAll() {

        List<DTOTeam> dtoResultList = new ArrayList<>();
        List<Team> teamList = teamRepository.findAll();
        for (Team team: teamList) {
            DTOTeam dtoTeam = new DTOTeam(team.getId(), team.getName());
            dtoResultList.add(dtoTeam);
        }
        return dtoResultList;

    }

    @Override
    public Team findById(Long id) {
        Team teamFound = teamRepository.findById(id).orElse(null);
        if (teamFound==null) {
            throw new ResourceNotFoundException("Team with Id: "+id.toString()+" was not found");
        }
        return teamFound;
    }

    @Override
    public DTOTeam add(DTOTeam dtoTeam) {
        Team newTeam = new Team(dtoTeam.getId(), dtoTeam.getName(), null,null);
        newTeam = teamRepository.save(newTeam);
        dtoTeam.setId(newTeam.getId());
        return dtoTeam;
    }
}
