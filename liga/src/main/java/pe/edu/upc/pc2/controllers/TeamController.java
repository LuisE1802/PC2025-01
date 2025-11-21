package pe.edu.upc.pc2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pc2.dtos.DTOTeam;
import pe.edu.upc.pc2.services.TeamService;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/pc2")
public class TeamController {

    @Autowired
    TeamService teamService;

    @GetMapping("/teams")
    public List<DTOTeam> listAll(){
        return teamService.listAll();
    }

}
