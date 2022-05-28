package com.example.YourFaceSoundsFamiliar.repo;

import com.example.YourFaceSoundsFamiliar.model.Episode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface EpisodeRepo extends JpaRepository<Episode, Date> {
    void deleteEpisodeByDate(Date date);

    Episode findEpisodeByDate(Date date);

    Episode findEpisodeBySeasonNumber(int seasonNumber);
}
