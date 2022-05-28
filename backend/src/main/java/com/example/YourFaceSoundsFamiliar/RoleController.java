package com.example.YourFaceSoundsFamiliar;

import com.example.YourFaceSoundsFamiliar.model.Role;
import com.example.YourFaceSoundsFamiliar.model.Role;
import com.example.YourFaceSoundsFamiliar.sеrvice.RoleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController
{
    private final RoleService roleService;

    public RoleController(RoleService roleService)
    {
        this.roleService = roleService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Role>> getAllRoles()
    {
        List<Role> roles = roleService.findAllRoles();
        return new ResponseEntity<>(roles, HttpStatus.OK);
    }

    @GetMapping("/find/{id}+{date}")
    public ResponseEntity<Role> getRoleByRoleID(@PathVariable("id") long id, @PathVariable("date") Date date)
    {
        Role newRole = roleService.findRoleByRoleID(id, date );
        return new ResponseEntity<>(newRole, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<List<Role>> getRoleById(@PathVariable("id") long id)
    {
        List<Role> newRole = roleService.findAllRolesFromParticipant(id);
        return new ResponseEntity<>(newRole, HttpStatus.OK);
    }
    @GetMapping("/find/{date}")
    public ResponseEntity<List<Role>> getRoleById(@PathVariable("date") Date date)
    {
        List<Role> newRole = roleService.findAllRolesFromDate(date);
        return new ResponseEntity<>(newRole, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Role> addRole(@RequestBody Role Role)
    {
        Role newRole = roleService.addRole(Role);
        return new ResponseEntity<>(newRole, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Role> updateRole(@RequestBody Role Role)
    {
        Role newRole = roleService.updateRole(Role);
        return new ResponseEntity<>(newRole, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}+{date}")
    public ResponseEntity<?> deleteRole(@PathVariable("id") long id, @PathVariable Date date)
    {
        roleService.deleteRoleByRoleID(id,date);
        return new ResponseEntity<>(HttpStatus.OK);
    }






}
