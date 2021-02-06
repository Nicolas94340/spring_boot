package fr.sorbonne.paris.nord.university.api;

import fr.sorbonne.paris.nord.university.api.entity.TeamEntity;
import fr.sorbonne.paris.nord.university.api.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    @Autowired
    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<TeamEntity> findAll() {
        if (teamRepository != null) {
            return teamRepository.findAll();
        } else {
            return null;
        }

    }

    public TeamEntity findById(Long id) {
        if (teamRepository.findById(id).isPresent()) {
            return this.teamRepository.findById(id).orElse(null);
        } else {
            return null;
        }

    }

    @Transactional
    public void InsertTeam(TeamEntity team_entity) {
        /*EntityManager em = null;
        em.createNativeQuery("INSERT INTO TEAM (id, name, slogan) VALUES(?,?,?)")
        .setParameter(1,team_entity.getId())
        .setParameter(2, team_entity.getName())
        .setParameter(3,team_entity.getSlogan());*/
        teamRepository.save(team_entity);
    }

    @Transactional
    public void ModifyTeam(TeamEntity teamEntity) {
        TeamEntity te = this.teamRepository.findById(teamEntity.getId()).orElse(null);
        if(te != null){
            te.setName(teamEntity.getName());
            te.setSlogan(teamEntity.getSlogan());
            teamRepository.save(te);
        }
    }

    @Transactional
    public void DeleteById(Long id){
        if (teamRepository.findById(id).isPresent()) {
            this.teamRepository.deleteById(id);
        }
    }



}
