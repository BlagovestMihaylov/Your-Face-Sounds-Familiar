package com.example.YourFaceSoundsFamiliar.sеrvice;

import com.example.YourFaceSoundsFamiliar.model.Role;
import com.example.YourFaceSoundsFamiliar.model.RoleID;
import com.example.YourFaceSoundsFamiliar.repo.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.zip.DataFormatException;

@Service
public class RoleService
{
    private final RoleRepo roleRepo;

    @Autowired
    public RoleService(RoleRepo roleRepo)
    {
        this.roleRepo = roleRepo;
    }

    public Role addRole(Role role)
    {
        return roleRepo.save(role);
    }

    public List<Role> findAllRoles()
    {
        return roleRepo.findAll();
    }

    public Role updateRole(Role role)
    {
        return roleRepo.save(role);
    }

    public Role findRoleByRoleID(long id, Date date)
    {
        return roleRepo.findRoleByParticipantIdAndEpisodeDate(id, date);
    }

    public void deleteRoleByRoleID(long id, Date date)
    {
        roleRepo.deleteRoleByParticipantIdAndEpisodeDate(id, date);
    }

    public List<Role> findAllRolesFromParticipant(long id)
    {
        return roleRepo.findAllRoleByParticipantId(id);
    }

    public List<Role> findAllRolesFromDate(Date date)
    {
        return roleRepo.findAllRoleByEpisodeDate(date);
    }
}
