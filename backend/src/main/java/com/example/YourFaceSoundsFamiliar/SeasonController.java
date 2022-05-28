package com.example.YourFaceSoundsFamiliar;

import com.example.YourFaceSoundsFamiliar.model.Season;
import com.example.YourFaceSoundsFamiliar.sеrvice.SeasonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/Season")
public class SeasonController
{
    private final SeasonService SeasonService;

    public SeasonController(SeasonService SeasonService)
    {
        this.SeasonService = SeasonService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Season>> getAllSeasons()
    {
        List<Season> Seasons = SeasonService.findAllSeasons();
        return new ResponseEntity<>(Seasons, HttpStatus.OK);
    }

    @GetMapping("/find/{number}")
    public ResponseEntity<Season> getAllSeasonsByDate(@PathVariable("number") int number)
    {
        Season Seasons = SeasonService.findSeasonByNumber(number);
        return new ResponseEntity<>(Seasons, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Season> addSeason(@RequestBody Season Season)
    {
        Season newSeason = SeasonService.addSeason(Season);
        return new ResponseEntity<>(newSeason, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Season> updateSeason(@RequestBody Season Season)
    {
        Season newSeason = SeasonService.updateSeason(Season);
        return new ResponseEntity<>(newSeason, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{number}")
    public ResponseEntity<?> deleteSeason(@PathVariable("number") int number)
    {
        SeasonService.deleteSeason(number);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}