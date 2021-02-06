package fr.sorbonne.paris.nord.university.api.controller;

import fr.sorbonne.paris.nord.university.api.TeamService;
import fr.sorbonne.paris.nord.university.api.entity.TeamDto;
import fr.sorbonne.paris.nord.university.api.entity.TeamEntity;
import fr.sorbonne.paris.nord.university.api.mapper.TeamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TeamController {

    @Autowired
    private TeamMapper teamMapper;

    @Autowired
    private TeamService teamService;

    @GetMapping("/hello")
    public String getTeams() {
        return "Hello World";
    }

    @GetMapping("/teams")
    public List<TeamDto>  getAllTeams(){
        List <TeamEntity> teamEntity = teamService.findAll();
        List <TeamDto> Dto = new ArrayList<TeamDto>();
        teamEntity.forEach(team-> Dto.add(teamMapper.ToDto(team)));
        return Dto;
    }

    @GetMapping("/teams/{id}")
    public TeamDto getTeam(@PathVariable Long id){
        TeamEntity te = teamService.findById(id);
        TeamDto dto = teamMapper.ToDto(te);
        return dto;
    }

    @PostMapping("/teams")
    public TeamDto CreateTeam(@RequestBody TeamDto Dto){
        TeamEntity teamToSave = teamMapper.ToEntity(Dto);
        teamService.InsertTeam(teamToSave);
        return teamMapper.ToDto(teamToSave);

    }

    @PutMapping("/update")
    public TeamDto UpdateTeam(@RequestBody TeamDto Dto){
        TeamEntity te = teamMapper.ToEntity(Dto);
        teamService.ModifyTeam(te);
        return teamMapper.ToDto(te);

    }

    @DeleteMapping("/delete/{id}")
    public void DeleteTeam(@PathVariable Long id){

        teamService.DeleteById(id);
    }







}
