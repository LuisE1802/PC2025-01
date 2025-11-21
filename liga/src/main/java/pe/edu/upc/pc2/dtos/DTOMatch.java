package pe.edu.upc.pc2.dtos;

import java.time.LocalDate;

public class DTOMatch {

    private Long id;

    private LocalDate matchDate;
    private Long localTeam_Id;

    private Long visitorTeam_Id;

    private Integer goalsLocalTeam;

    private Integer goalsVisitorTeam;

    public DTOMatch(Long id, LocalDate matchDate, Long localTeam_Id, Long visitorTeam_Id, Integer goalsLocalTeam, Integer goalsVisitorTeam) {
        this.id = id;
        this.matchDate = matchDate;
        this.localTeam_Id = localTeam_Id;
        this.visitorTeam_Id = visitorTeam_Id;
        this.goalsLocalTeam = goalsLocalTeam;
        this.goalsVisitorTeam = goalsVisitorTeam;
    }

    public DTOMatch() {
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

    public Long getLocalTeam_Id() {
        return localTeam_Id;
    }

    public void setLocalTeam_Id(Long localTeam_Id) {
        this.localTeam_Id = localTeam_Id;
    }

    public Long getVisitorTeam_Id() {
        return visitorTeam_Id;
    }

    public void setVisitorTeam_Id(Long visitorTeam_Id) {
        this.visitorTeam_Id = visitorTeam_Id;
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

    @Override
    public String toString() {
        return "DTOMatch{" +
                "id=" + id +
                ", matchDate=" + matchDate +
                ", localTeam_Id=" + localTeam_Id +
                ", visitorTeam_Id=" + visitorTeam_Id +
                ", goalsLocalTeam=" + goalsLocalTeam +
                ", goalsVisitorTeam=" + goalsVisitorTeam +
                '}';
    }
}
