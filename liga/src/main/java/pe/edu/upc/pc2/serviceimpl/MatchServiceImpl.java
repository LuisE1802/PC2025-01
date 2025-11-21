package pe.edu.upc.pc2.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pc2.dtos.DTOMatch;
import pe.edu.upc.pc2.dtos.DTOResult;
import pe.edu.upc.pc2.entities.Match;
import pe.edu.upc.pc2.entities.Team;
import pe.edu.upc.pc2.exceptions.KeyRepeatedDataExeception;
import pe.edu.upc.pc2.repositories.MatchRepository;
import pe.edu.upc.pc2.services.MatchService;
import pe.edu.upc.pc2.services.TeamService;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {

    @Autowired
    MatchRepository matchRepository;

    @Autowired
    TeamService teamService;

    @Override
    public DTOMatch add(DTOMatch dtoMatch) {
        if (dtoMatch.getVisitorTeam_Id().equals(dtoMatch.getLocalTeam_Id())) {
            throw new KeyRepeatedDataExeception("The Visitor Team Id can not be the same as the Local Team Id");
        }
        Team localTeam = teamService.findById(dtoMatch.getLocalTeam_Id());
        Team visitorTeam = teamService.findById(dtoMatch.getVisitorTeam_Id());
        Match newMatch = new Match(null,dtoMatch.getMatchDate(), dtoMatch.getGoalsLocalTeam(), dtoMatch.getGoalsVisitorTeam(), localTeam,visitorTeam);
        newMatch = matchRepository.save(newMatch);
        dtoMatch.setId(newMatch.getId());
        return dtoMatch;
    }

    @Override
    public void deleteMatch(Long id) {
        matchRepository.deleteById(id);
    }


}
