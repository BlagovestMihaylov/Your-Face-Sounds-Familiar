package com.example.YourFaceSoundsFamiliar.repo;

import com.example.YourFaceSoundsFamiliar.model.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeasonRepo extends JpaRepository<Season, Integer> {
    Season findSeasonByNumber(int number);

    void deleteSeasonByNumber(int number);
}
