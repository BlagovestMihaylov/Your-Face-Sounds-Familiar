package com.example.YourFaceSoundsFamiliar.sеrvice;

import com.example.YourFaceSoundsFamiliar.model.Participant;
import com.example.YourFaceSoundsFamiliar.repo.ParticipantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ParticipantService
{
    private final ParticipantRepo participantRepo;

    @Autowired
    public ParticipantService(ParticipantRepo participantRepo)
    {
        this.participantRepo = participantRepo;
    }


    public Participant addParticipant(Participant participant)
    {
        return participantRepo.save(participant);
    }

    public List<Participant> findAllParticipants()
    {
        return participantRepo.findAll();
    }

    public Participant updateParticipant(Participant participant)
    {
        return participantRepo.save(participant);
    }

    public Participant findparticipantById(long id)
    {
        return participantRepo.findParticipantById(id);
    }
    public Participant findParticipantBySceneName(String sceneName)
    {
        return participantRepo.findParticipantBySceneName(sceneName);
    }
    public Participant findParticipantBySeason(int seasonNumber)
    {
        return participantRepo.findParticipantBySeasonNumber(seasonNumber);
    }

    public void deleteParticipant(long id)
    {
        participantRepo.deleteParticipantById(id);
    }

}
