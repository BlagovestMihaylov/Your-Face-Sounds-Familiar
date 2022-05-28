package com.example.YourFaceSoundsFamiliar.repo;

import com.example.YourFaceSoundsFamiliar.model.Role;
import com.example.YourFaceSoundsFamiliar.model.RoleID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface RoleRepo extends JpaRepository<Role, RoleID> {
    Role findRoleByParticipantIdAndEpisodeDate(long id, Date date);

    void deleteRoleByParticipantIdAndEpisodeDate(long id, Date date);

    List<Role> findAllRoleByParticipantId(long id);

    List<Role> findAllRoleByEpisodeDate(Date date);
}
