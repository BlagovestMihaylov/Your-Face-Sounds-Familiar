package com.example.YourFaceSoundsFamiliar.repo;

import com.example.YourFaceSoundsFamiliar.model.Episode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface EpisodeRepo extends JpaRepository<Episode, Date> {
}
