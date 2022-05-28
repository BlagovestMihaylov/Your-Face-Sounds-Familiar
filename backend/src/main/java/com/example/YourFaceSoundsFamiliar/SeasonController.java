package com.example.YourFaceSoundsFamiliar;

import com.example.YourFaceSoundsFamiliar.model.Season;
import com.example.YourFaceSoundsFamiliar.sеrvice.SeasonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http:localhost4200")
@RestController
@RequestMapping("/season")
public class SeasonController
{
    private final SeasonService seasonService;

    public SeasonController(SeasonService seasonService)
    {
        this.seasonService = seasonService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Season>> getAllSeasons()
    {
        List<Season> Seasons = seasonService.findAllSeasons();
        return new ResponseEntity<>(Seasons, HttpStatus.OK);
    }

    @GetMapping("/find/{number}")
    public ResponseEntity<Season> getAllSeasonsByDate(@PathVariable("number") int number)
    {
        Season Seasons = seasonService.findSeasonByNumber(number);
        return new ResponseEntity<>(Seasons, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Season> addSeason(@RequestBody Season season)
    {
        Season newSeason = seasonService.addSeason(season);
        return new ResponseEntity<>(newSeason, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Season> updateSeason(@RequestBody Season season)
    {
        Season newSeason = seasonService.updateSeason(season);
        return new ResponseEntity<>(newSeason, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{number}")
    public ResponseEntity<?> deleteSeason(@PathVariable("number") int number)
    {
        seasonService.deleteSeason(number);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}