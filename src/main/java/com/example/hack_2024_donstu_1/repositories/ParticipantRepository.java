package com.example.hack_2024_donstu_1.repositories;

import com.example.hack_2024_donstu_1.entity.ParticipantEntity;
import com.example.hack_2024_donstu_1.entity.TeamEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantRepository extends CrudRepository<ParticipantEntity, Integer> {
    ParticipantEntity findByTeam(TeamEntity team);
}
