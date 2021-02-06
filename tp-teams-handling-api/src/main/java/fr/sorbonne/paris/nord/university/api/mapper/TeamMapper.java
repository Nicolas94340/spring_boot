package fr.sorbonne.paris.nord.university.api.mapper;

import fr.sorbonne.paris.nord.university.api.entity.TeamDto;
import fr.sorbonne.paris.nord.university.api.entity.TeamEntity;
import org.springframework.stereotype.Service;


@Service
public class TeamMapper {


    public TeamMapper(){
    }

    public TeamEntity ToEntity(TeamDto tdo){
        TeamEntity te = new TeamEntity();
        te.setId(tdo.getId());
        te.setName(tdo.getName());
        te.setSlogan(tdo.getSlogan());
        return te;
    }

    public TeamDto ToDto(TeamEntity te){
        TeamDto tdo = new TeamDto();
        tdo.setId(te.getId());
        tdo.setName(te.getName());
        tdo.setSlogan(te.getSlogan());
        return tdo;
    }

}
