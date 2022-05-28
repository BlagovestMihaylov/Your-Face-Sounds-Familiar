package com.example.YourFaceSoundsFamiliar;


import com.example.YourFaceSoundsFamiliar.model.Episode;
import com.example.YourFaceSoundsFamiliar.sеrvice.EpisodeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
@CrossOrigin(origins = "http:localhost4200")
@RestController
@RequestMapping("/episode")
public class EpisodeController
{
    private final EpisodeService episodeService;

    public EpisodeController(EpisodeService EpisodeService)
    {
        this.episodeService = EpisodeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Episode>> getAllEpisodes()
    {
        List<Episode> Episodes = episodeService.findAllEpisodes();
        return new ResponseEntity<>(Episodes, HttpStatus.OK);
    }

    @GetMapping("/find/{date}")
    public ResponseEntity<Episode> getAllEpisodesByDate(@PathVariable("date") Date date)
    {
        Episode Episodes = episodeService.findEpisodeByDate(date);
        return new ResponseEntity<>(Episodes, HttpStatus.OK);
    }

    @GetMapping("/findSeason/{season}")
    public ResponseEntity<Episode> getAllEpisodesBySeasonNumber(@PathVariable("season") int seasonNumber)
    {
        Episode Episodes = episodeService.findEpisodeBySeason(seasonNumber);
        return new ResponseEntity<>(Episodes, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Episode> addEpisode(@RequestBody Episode Episode)
    {
        Episode newEpisode = episodeService.addEpisode(Episode);
        return new ResponseEntity<>(newEpisode, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Episode> updateEpisode(@RequestBody Episode Episode)
    {
        Episode newEpisode = episodeService.updateEpisode(Episode);
        return new ResponseEntity<>(newEpisode, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{date}")
    public ResponseEntity<?> deleteEpisode(@PathVariable("date") Date date)
    {
        episodeService.deleteEpisode(date);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
