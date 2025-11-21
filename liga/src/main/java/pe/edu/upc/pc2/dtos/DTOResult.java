package pe.edu.upc.pc2.dtos;

import java.time.LocalDate;

public class DTOResult {
    private Long matchId;
    private LocalDate matchDate;
    private String localTeamName;
    private String visitorTeamName;
    private Integer goalsLocalTeam;
    private Integer goalsVisitorTeam;


    public DTOResult() {
    }

    public DTOResult(Long matchId, LocalDate matchDate, String localTeamName, String visitorTeamName, Integer goalsLocalTeam, Integer goalsVisitorTeam) {
        this.matchId = matchId;
        this.matchDate = matchDate;
        this.localTeamName = localTeamName;
        this.visitorTeamName = visitorTeamName;
        this.goalsLocalTeam = goalsLocalTeam;
        this.goalsVisitorTeam = goalsVisitorTeam;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public LocalDate getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(LocalDate matchDate) {
        this.matchDate = matchDate;
    }

    public String getLocalTeamName() {
        return localTeamName;
    }

    public void setLocalTeamName(String localTeamName) {
        this.localTeamName = localTeamName;
    }

    public String getVisitorTeamName() {
        return visitorTeamName;
    }

    public void setVisitorTeamName(String visitorTeamName) {
        this.visitorTeamName = visitorTeamName;
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
        return "DTOResult{" +
                "matchId=" + matchId +
                ", matchDate=" + matchDate +
                ", localTeamName='" + localTeamName + '\'' +
                ", visitorTeamName='" + visitorTeamName + '\'' +
                ", goalsLocalTeam=" + goalsLocalTeam +
                ", goalsVisitorTeam=" + goalsVisitorTeam +
                '}';
    }
}
