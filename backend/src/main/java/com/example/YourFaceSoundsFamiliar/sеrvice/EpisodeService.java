package com.example.YourFaceSoundsFamiliar.sеrvice;

import com.example.YourFaceSoundsFamiliar.model.Episode;
import com.example.YourFaceSoundsFamiliar.repo.EpisodeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EpisodeService
{
    private final EpisodeRepo episodeRepo;

    @Autowired
    public EpisodeService(EpisodeRepo episodeRepo)
    {
        this.episodeRepo = episodeRepo;
    }

    public Episode addEpisode(Episode episode)
    {
        return episodeRepo.save(episode);
    }

    public List<Episode> findAllEpisodes()
    {
        return episodeRepo.findAll();
    }

    public Episode updateEpisode(Episode episode)
    {
        return episodeRepo.save(episode);
    }

    public Episode findEpisodeByDate(Date date)
    {
        return episodeRepo.findEpisodeByDate(date);
    }

    public Episode findEpisodeBySeason(int seasonNumber)
    {
        return episodeRepo.findEpisodeBySeasonNumber(seasonNumber);
    }

    public void deleteEpisode(Date date)
    {
        episodeRepo.deleteEpisodeByDate(date);
    }
}
