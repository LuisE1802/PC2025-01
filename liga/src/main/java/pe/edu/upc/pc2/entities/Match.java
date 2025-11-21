package pe.edu.upc.pc2.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate matchDate;

    private Integer goalsLocalTeam;

    private Integer goalsVisitorTeam;

    @ManyToOne
    @JoinColumn(name = "localTeam_id")
    private Team localTeam;

    @ManyToOne
    @JoinColumn(name = "visitorTeam_id")
    private Team visitorTeam;

    public Match() {
    }

    public Match(Long id, LocalDate matchDate, Integer goalsLocalTeam, Integer goalsVisitorTeam, Team localTeam, Team visitorTeam) {
        this.id = id;
        this.matchDate = matchDate;
        this.goalsLocalTeam = goalsLocalTeam;
        this.goalsVisitorTeam = goalsVisitorTeam;
        this.localTeam = localTeam;
        this.visitorTeam = visitorTeam;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(LocalDate matchDate) {
        this.matchDate = matchDate;
    }

    public Integer getGoalsLocalTeam() {
        return goalsLocalTeam;
    }

    public void setGoalsLocalTeam(Integer goalsLocalTeam) {
        this.goalsLocalTeam = goalsLocalTeam;
    }

    public Integer getGoalsVisitorTeam() {
        return goalsVisitorTeam;
    }

    public void setGoalsVisitorTeam(Integer goalsVisitorTeam) {
        this.goalsVisitorTeam = goalsVisitorTeam;
    }

    public Team getLocalTeam() {
        return localTeam;
    }

    public void setLocalTeam(Team localTeam) {
        this.localTeam = localTeam;
    }

    public Team getVisitorTeam() {
        return visitorTeam;
    }

    public void setVisitorTeam(Team visitorTeam) {
        this.visitorTeam = visitorTeam;
    }

    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", matchDate=" + matchDate +
                ", goalsLocalTeam=" + goalsLocalTeam +
                ", goalsVisitorTeam=" + goalsVisitorTeam +
                ", localTeam=" + localTeam +
                ", visitorTeam=" + visitorTeam +
                '}';
    }
}
