package com.example.YourFaceSoundsFamiliar.repo;

import com.example.YourFaceSoundsFamiliar.model.Host;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostRepo extends JpaRepository<Host, Long>
{

    Host findHostById(long id);

    void deleteHostById(long id);
}
