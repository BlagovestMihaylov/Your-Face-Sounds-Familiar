package com.example.YourFaceSoundsFamiliar;

import com.example.YourFaceSoundsFamiliar.model.Host;
import com.example.YourFaceSoundsFamiliar.sеrvice.HostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http:localhost4200")
@RestController
@RequestMapping("/host")
public class HostController
{
    private final HostService hostService;

    public HostController(HostService hostService)
    {
        this.hostService = hostService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Host>> getAllHosts()
    {
        List<Host> Hosts = hostService.findAllHosts();
        return new ResponseEntity<>(Hosts, HttpStatus.OK);
    }
    

    @GetMapping("/find/{id}")
    public ResponseEntity<Host> getAllHostsById(@PathVariable("id") long id)
    {
        Host Hosts = hostService.findHostById(id);
        return new ResponseEntity<>(Hosts, HttpStatus.OK);
    }
    

    @PostMapping("/add")
    public ResponseEntity<Host> addHost(@RequestBody Host Host)
    {
        Host newHost = hostService.addHost(Host);
        return new ResponseEntity<>(newHost, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Host> updateHost(@RequestBody Host Host)
    {
        Host newHost = hostService.updateHost(Host);
        return new ResponseEntity<>(newHost, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteHost(@PathVariable("id") long id)
    {
        hostService.deleteHost(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
