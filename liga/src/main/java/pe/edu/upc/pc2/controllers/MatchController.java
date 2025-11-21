package pe.edu.upc.pc2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pc2.dtos.DTOMatch;
import pe.edu.upc.pc2.services.MatchService;

@CrossOrigin("*")
@RestController
@RequestMapping("/pc2")
public class MatchController {

    @Autowired
    private MatchService matchService;


    @DeleteMapping("/matches/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        matchService.deleteMatch(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/matches")
    public ResponseEntity<DTOMatch> create(@RequestBody DTOMatch dtoMatch) {
        return new ResponseEntity<>(matchService.add(dtoMatch),HttpStatus.CREATED);
    }


}
