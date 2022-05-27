package com.example.YourFaceSoundsFamiliar.repo;

import com.example.YourFaceSoundsFamiliar.model.ActingPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActingPersonRepo extends JpaRepository<ActingPerson, String> {
}
