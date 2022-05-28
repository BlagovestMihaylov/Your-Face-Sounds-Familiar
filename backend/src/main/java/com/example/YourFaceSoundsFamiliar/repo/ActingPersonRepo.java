package com.example.YourFaceSoundsFamiliar.repo;

import com.example.YourFaceSoundsFamiliar.model.ActingPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


public interface ActingPersonRepo extends JpaRepository<ActingPerson, String> {
    ActingPerson findActingPersonBySceneName(String sceneName);

    void deleteActingPersonBySceneName(String sceneName);
}
