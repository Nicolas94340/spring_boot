package fr.sorbonne.paris.nord.university.api.controller;



import fr.sorbonne.paris.nord.university.api.TeamService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;


@SpringBootTest
public class TeamControllerTest {

    @InjectMocks
    TeamController teamController;

    @Mock
    TeamService teamService;

    @BeforeEach
    public void initialiseRestAssuredMockMvcStandalone() {
        RestAssuredMockMvc.standaloneSetup(teamController);
    }

    @Test
    public void returnStatus_WhenGetAllTeam(){


    }

    @Test
    public void returnStatus_WhenGetTeam(){

    }

    @Test
    public void returnStatus_WhenCreateTeam(){

    }

    @Test
    public void returnStatus_WhenDeleteTeam(){

    }



}
