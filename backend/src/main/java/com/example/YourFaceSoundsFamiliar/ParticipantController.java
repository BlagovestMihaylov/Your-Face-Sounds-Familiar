package com.example.YourFaceSoundsFamiliar;

import com.example.YourFaceSoundsFamiliar.model.Participant;
import com.example.YourFaceSoundsFamiliar.sеrvice.ParticipantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/participant")
public class ParticipantController
{
    private final ParticipantService participantService;

    public ParticipantController(ParticipantService participantService)
    {
        this.participantService = participantService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Participant>> getAllParticipants()
    {
        List<Participant> participants = participantService.findAllParticipants();
        return new ResponseEntity<>(participants, HttpStatus.OK);
    }

    @GetMapping("/find/{sceneName}")
    public ResponseEntity<Participant> getAllParticipantsBySceneName(@PathVariable("sceneName") String sceneName)
    {
        Participant participants = participantService.findParticipantBySceneName(sceneName);
        return new ResponseEntity<>(participants, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Participant> getAllParticipantsById(@PathVariable("id") long id)
    {
        Participant participants = participantService.findparticipantById(id);
        return new ResponseEntity<>(participants, HttpStatus.OK);
    }

    @GetMapping("/findSeason/{season}")
    public ResponseEntity<Participant> getAllParticipantsBySeasonNumber(@PathVariable("season") int seasonNumber)
    {
        Participant participants = participantService.findParticipantBySeason(seasonNumber);
        return new ResponseEntity<>(participants, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Participant> addParticipant(@RequestBody Participant participant)
    {
        Participant newParticipant = participantService.addParticipant(participant);
        return new ResponseEntity<>(newParticipant, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Participant> updateParticipant(@RequestBody Participant participant)
    {
        Participant newParticipant = participantService.updateParticipant(participant);
        return new ResponseEntity<>(newParticipant, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteParticipant(@PathVariable("id") long id)
    {
        participantService.deleteParticipant(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
