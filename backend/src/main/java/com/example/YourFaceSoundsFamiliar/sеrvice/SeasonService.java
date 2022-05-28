package com.example.YourFaceSoundsFamiliar.sеrvice;

import com.example.YourFaceSoundsFamiliar.model.Season;
import com.example.YourFaceSoundsFamiliar.repo.SeasonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeasonService
{
    private final SeasonRepo seasonRepo;

    @Autowired
    public SeasonService(SeasonRepo seasonRepo)
    {
        this.seasonRepo = seasonRepo;
    }

    public Season addSeason(Season season)
    {
        return seasonRepo.save(season);
    }

    public List<Season> findAllSeasons()
    {
        return seasonRepo.findAll();
    }

    public Season updateSeason(Season season)
    {
        return seasonRepo.save(season);
    }

    public Season findSeasonByNumber(int number)
    {
        return seasonRepo.findSeasonByNumber(number);
    }


    public void deleteSeason(int Number)
    {
        seasonRepo.deleteSeasonByNumber(Number);
    }
}
