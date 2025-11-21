package pe.edu.upc.pc2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pe.edu.upc.pc2.dtos.DTOMatch;
import pe.edu.upc.pc2.dtos.DTOTeam;
import pe.edu.upc.pc2.entities.*;
import pe.edu.upc.pc2.services.AuthorityService;
import pe.edu.upc.pc2.services.MatchService;
import pe.edu.upc.pc2.services.TeamService;
import pe.edu.upc.pc2.services.UserService;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class SocratesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocratesApplication.class, args);
    }

    @Bean
    public CommandLineRunner startConfiguration(
            MatchService matchService,
            TeamService teamService
    ){
        return args -> {

            teamService.add(new DTOTeam(null, "Real Madrid"));
            teamService.add(new DTOTeam(null, "FC Barcelona"));
            teamService.add(new DTOTeam(null, "Atlético de Madrid"));
            teamService.add(new DTOTeam(null, "Sevilla FC"));
            teamService.add(new DTOTeam(null, "Real Sociedad"));
            teamService.add(new DTOTeam(null, "Real Betis"));
            teamService.add(new DTOTeam(null, "Athletic Club"));
            teamService.add(new DTOTeam(null, "Villarreal CF"));
            teamService.add(new DTOTeam(null, "Valencia CF"));
            teamService.add(new DTOTeam(null, "Getafe CF"));
            teamService.add(new DTOTeam(null, "RC Celta"));
            teamService.add(new DTOTeam(null, "Rayo Vallecano"));
            teamService.add(new DTOTeam(null, "CA Osasuna"));
            teamService.add(new DTOTeam(null, "UD Almería"));
            teamService.add(new DTOTeam(null, "Granada CF"));
            teamService.add(new DTOTeam(null, "RCD Mallorca"));
            teamService.add(new DTOTeam(null, "Cádiz CF"));
            teamService.add(new DTOTeam(null, "UD Las Palmas"));
            teamService.add(new DTOTeam(null, "Girona FC"));
            teamService.add(new DTOTeam(null, "Deportivo Alavés"));

            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9, 1), 1L, 2L, 2, 1));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9, 2), 3L, 4L, 0, 0));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9, 3), 5L, 6L, 3, 2));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9, 4), 7L, 8L, 1, 4));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9, 5), 9L, 10L, 2, 2));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9, 6), 11L, 12L, 4, 1));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9, 7), 13L, 14L, 1, 3));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9, 8), 15L, 16L, 0, 0));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9, 9), 2L, 3L, 5, 2));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9,10), 4L, 1L, 1, 1));

            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9,11), 5L, 1L, 3, 1));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9,12), 6L, 2L, 2, 4));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9,13), 7L, 3L, 0, 2));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9,14), 8L, 4L, 1, 1));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9,15), 9L, 5L, 4, 3));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9,16), 10L, 6L, 0, 0));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9,17), 11L, 7L, 2, 2));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9,18), 12L, 8L, 1, 0));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9,19), 13L, 9L, 5, 1));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9,20), 14L, 10L, 2, 3));

            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9,21), 15L, 11L, 0, 1));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9,22), 16L, 12L, 4, 4));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9,23), 1L, 13L, 2, 0));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9,24), 2L, 14L, 3, 2));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9,25), 3L, 15L, 1, 1));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9,26), 4L, 16L, 2, 2));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9,27), 6L, 13L, 0, 3));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9,28), 8L, 11L, 1, 0));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9,29), 10L, 15L, 4, 2));
            matchService.add(new DTOMatch(null, LocalDate.of(2024, 9,30), 12L, 14L, 1, 5));



        };
    }



}
