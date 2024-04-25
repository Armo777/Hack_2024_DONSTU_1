package com.example.hack_2024_donstu_1.controller;

import com.example.hack_2024_donstu.entity.TeamEntity;
import com.example.hack_2024_donstu.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    @Autowired
    private TeamService teamService;

    @PostMapping("/register")
    public TeamEntity registerUser(@RequestBody TeamEntity teamEntity) {
        return teamService.registerTeam(teamEntity);
    }
}
