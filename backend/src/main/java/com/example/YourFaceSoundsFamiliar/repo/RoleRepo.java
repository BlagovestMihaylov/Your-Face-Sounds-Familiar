package com.example.YourFaceSoundsFamiliar.repo;

import com.example.YourFaceSoundsFamiliar.model.Role;
import com.example.YourFaceSoundsFamiliar.model.RoleID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
@Repository
public interface RoleRepo extends JpaRepository<Role, RoleID> {
}
