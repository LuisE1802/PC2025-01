package pe.edu.upc.pc2.dtos;

public class DTOTeam {

    private Long id;
    private String name;

    public DTOTeam() {
    }

    public DTOTeam(Long id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "DTOTeam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
