package com.example.YourFaceSoundsFamiliar.repo;

import com.example.YourFaceSoundsFamiliar.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantRepo extends JpaRepository<Participant, Long> {
    Participant findParticipantBySceneName(String sceneName);

    Participant findParticipantBySeasonNumber(int season);

    Participant findParticipantById(long id);

    void deleteParticipantById(long id);
}
