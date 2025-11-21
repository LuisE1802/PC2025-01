package pe.edu.upc.pc2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.pc2.dtos.DTOResult;
import pe.edu.upc.pc2.dtos.DTOTeam;
import pe.edu.upc.pc2.services.ResultService;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/pc2")
public class ResultController {

    @Autowired
    ResultService resultService;

    @GetMapping("/results")
    public List<DTOResult> listAll(){
        return resultService.getResultReport();
    }

}
