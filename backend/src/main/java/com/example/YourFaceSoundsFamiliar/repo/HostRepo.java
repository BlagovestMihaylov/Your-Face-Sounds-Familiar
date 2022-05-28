package com.example.YourFaceSoundsFamiliar.repo;

import com.example.YourFaceSoundsFamiliar.model.ActingPerson;
import com.example.YourFaceSoundsFamiliar.model.Host;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HostRepo extends JpaRepository<Host, String>
{

}
