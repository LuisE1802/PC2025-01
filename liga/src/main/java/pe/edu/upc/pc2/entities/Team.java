package pe.edu.upc.pc2.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "teams")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "localTeam", fetch = FetchType.EAGER)
    private List<Match> localMatches;

    @JsonIgnore
    @OneToMany(mappedBy = "visitorTeam", fetch = FetchType.EAGER)
    private List<Match> visitorMatches;


    public Team() {
    }

    public Team(Long id, String name, List<Match> localMatches, List<Match> visitorMatches) {
        this.id = id;
        this.name = name;
        this.localMatches = localMatches;
        this.visitorMatches = visitorMatches;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Match> getLocalMatches() {
        return localMatches;
    }

    public void setLocalMatches(List<Match> localMatches) {
        this.localMatches = localMatches;
    }

    public List<Match> getVisitorMatches() {
        return visitorMatches;
    }

    public void setVisitorMatches(List<Match> visitorMatches) {
        this.visitorMatches = visitorMatches;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", localMatches=" + localMatches +
                ", visitorMatches=" + visitorMatches +
                '}';
    }
}
