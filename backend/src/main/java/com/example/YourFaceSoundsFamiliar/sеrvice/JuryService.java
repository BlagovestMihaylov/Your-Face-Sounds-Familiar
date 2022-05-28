package com.example.YourFaceSoundsFamiliar.sеrvice;

import com.example.YourFaceSoundsFamiliar.model.Jury;
import com.example.YourFaceSoundsFamiliar.repo.JuryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JuryService
{
    private final JuryRepo juryRepo;

    @Autowired
    public JuryService(JuryRepo juryRepo)
    {
        this.juryRepo = juryRepo;
    }


    public Jury addJury(Jury jury)
    {
        return juryRepo.save(jury);
    }

    public List<Jury> findAllJurys()
    {
        return juryRepo.findAll();
    }

    public Jury updateJury(Jury jury)
    {
        return juryRepo.save(jury);
    }

    public Jury findJuryById(long id)
    {
        return juryRepo.findJuryById(id);
    }


    public void deleteJury(long id)
    {
        juryRepo.deleteJuryById(id);
    }
}
