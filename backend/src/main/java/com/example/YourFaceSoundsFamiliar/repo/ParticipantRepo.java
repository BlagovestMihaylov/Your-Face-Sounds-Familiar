package com.example.YourFaceSoundsFamiliar.repo;

import com.example.YourFaceSoundsFamiliar.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParticipantRepo extends JpaRepository<Participant, String> {
    void deleteParticipantBySceneName(String sceneName);

    Participant findParticipantBySceneName(String sceneName);

    Participant findParticipantBySeasonNumber(int season);
}
