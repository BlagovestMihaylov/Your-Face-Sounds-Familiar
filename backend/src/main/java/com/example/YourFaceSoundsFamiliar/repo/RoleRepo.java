package com.example.YourFaceSoundsFamiliar.repo;

import com.example.YourFaceSoundsFamiliar.model.Role;
import com.example.YourFaceSoundsFamiliar.model.RoleID;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface RoleRepo extends JpaRepository<Role, RoleID> {
}
