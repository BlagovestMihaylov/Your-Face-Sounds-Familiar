package com.example.YourFaceSoundsFamiliar.repo;

import com.example.YourFaceSoundsFamiliar.model.Jury;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JuryRepo extends JpaRepository<Jury, Long>
{
    Jury findJuryById(long id);

    void deleteJuryById(long id);
}
