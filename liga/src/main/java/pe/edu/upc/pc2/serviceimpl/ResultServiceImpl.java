package pe.edu.upc.pc2.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pc2.dtos.DTOResult;
import pe.edu.upc.pc2.entities.Match;
import pe.edu.upc.pc2.repositories.MatchRepository;
import pe.edu.upc.pc2.services.MatchService;
import pe.edu.upc.pc2.services.ResultService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {

    @Autowired
    MatchRepository matchRepository;

    @Override
    public List<DTOResult> getResultReport() {
        List<DTOResult> dtoResultList = new ArrayList<>();
        List<Match> matchList = matchRepository.findAll();
        for (Match match: matchList) {
            DTOResult dtoResult = new DTOResult(match.getId(), match.getMatchDate(),match.getLocalTeam().getName(),
                    match.getVisitorTeam().getName(), match.getGoalsLocalTeam(), match.getGoalsVisitorTeam());
            dtoResultList.add(dtoResult);
        }
        return dtoResultList;
    }
}
