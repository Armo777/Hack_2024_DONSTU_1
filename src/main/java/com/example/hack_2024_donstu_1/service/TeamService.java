package com.example.hack_2024_donstu_1.service;

import com.example.hack_2024_donstu_1.entity.TeamEntity;
import com.example.hack_2024_donstu_1.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public TeamEntity registerTeam(TeamEntity teamEntity) {
        TeamEntity existingTeam = teamRepository.findByLogin(teamEntity.getLogin());
        if (existingTeam != null) {
            throw new RuntimeException("Пользователь с логином " + teamEntity.getLogin() + " уже существует");
        }
        return teamRepository.save(teamEntity);
    }

    public TeamEntity findByLogin(String login) {
        return teamRepository.findByLogin(login);
    }

    /*public TeamEntity findAll(TeamRepository teamRepository) {
        return teamRepository.findAllBy();
    }*/
}