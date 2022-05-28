package com.example.YourFaceSoundsFamiliar;

import com.example.YourFaceSoundsFamiliar.model.Jury;
import com.example.YourFaceSoundsFamiliar.sеrvice.JuryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jury")
public class JuryController
{
    private final JuryService juryService;

    public JuryController(JuryService JuryService)
    {
        this.juryService = JuryService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Jury>> getAllJurys()
    {
        List<Jury> Jurys = juryService.findAllJurys();
        return new ResponseEntity<>(Jurys, HttpStatus.OK);
    }


    @GetMapping("/find/{id}")
    public ResponseEntity<Jury> getAllJuryById(@PathVariable("id") long id)
    {
        Jury Jurys = juryService.findJuryById(id);
        return new ResponseEntity<>(Jurys, HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<Jury> addJury(@RequestBody Jury Jury)
    {
        Jury newJury = juryService.addJury(Jury);
        return new ResponseEntity<>(newJury, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Jury> updateJury(@RequestBody Jury Jury)
    {
        Jury newJury = juryService.updateJury(Jury);
        return new ResponseEntity<>(newJury, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteJury(@PathVariable("id") long id)
    {
        juryService.deleteJury(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}