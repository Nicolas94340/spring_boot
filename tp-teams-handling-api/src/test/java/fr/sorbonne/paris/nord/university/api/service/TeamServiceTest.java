package fr.sorbonne.paris.nord.university.api.service;

import fr.sorbonne.paris.nord.university.api.TeamService;
import fr.sorbonne.paris.nord.university.api.entity.TeamEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
public class TeamServiceTest {

    @Autowired
    private TeamService teamService;
    @Test
    public void given_whenGetAllTeam_thenExpectedAllTeam(){
    // Given.

    // When.
        List<TeamEntity> result = teamService.findAll();
    // Then.
        assertThat(result).isNotNull().isNotEmpty();
    }

    @Test
    public void givenExistingId_whenGetTeamById_thenExpectedTeamInResult(){
    // Given.
        Long id = 1L;
        String given = "PSG";

    // When.
       TeamEntity result = teamService.findById(id);

    // Then.
        assertThat(result.getName()).isEqualTo(given);
    }

    @Test
    public void givenTeam_whenAddTeam_thenExpectedTeamInResult(){
        // Given.
        TeamEntity new_team = new TeamEntity(6L,"Olympique Lyonnais","Unis pour rugir");

        // When.
       teamService.InsertTeam(new_team);

        // Then.
        assertThat(teamService.findById(6L)).isNotNull();
    }


    @Test
    public void givenExistingId_whenGetTeamById_thenExpectedDeleteTeam(){
        // Given.
        Long id = 1L;

        // When.
        teamService.DeleteById(id);

        // Then.
        assertThat(teamService.findById(id)).isEqualTo(null);
    }


}
