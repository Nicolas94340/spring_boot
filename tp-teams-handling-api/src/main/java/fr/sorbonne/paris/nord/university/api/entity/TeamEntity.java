package fr.sorbonne.paris.nord.university.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "TEAM")
public class TeamEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="NAME")
    private String name;

    @Column(name="SLOGAN")
    private String slogan;

    public TeamEntity(){

    }

    public TeamEntity(Long id, String name, String slogan){
        this.id = id;
        this.name = name;
        this.slogan = slogan;
    }

    public Long getId() {
        return id;
    }

    public String getSlogan() {
        return slogan;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

}
