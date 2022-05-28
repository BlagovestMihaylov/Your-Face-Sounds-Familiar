package com.example.YourFaceSoundsFamiliar.sеrvice;


import com.example.YourFaceSoundsFamiliar.model.Host;
import com.example.YourFaceSoundsFamiliar.repo.HostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostService
{
    private final HostRepo hostRepo;

    @Autowired
    public HostService(HostRepo hostRepo)
    {
        this.hostRepo = hostRepo;
    }


    public Host addHost(Host host)
    {
        return hostRepo.save(host);
    }

    public List<Host> findAllHosts()
    {
        return hostRepo.findAll();
    }

    public Host updateHost(Host host)
    {
        return hostRepo.save(host);
    }

    public Host findHostById(long id)
    {
        return hostRepo.findHostById(id);
    }


    public void deleteHost(long id)
    {
        hostRepo.deleteHostById(id);
    }
}
