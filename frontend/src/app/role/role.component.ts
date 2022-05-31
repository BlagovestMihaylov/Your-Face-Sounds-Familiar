import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Role } from '../role';
import { RoleService } from '../role.service';

@Component({
  selector: 'app-role',
  templateUrl: './role.component.html',
  styleUrls: ['./role.component.css'],
})
export class RoleComponent implements OnInit {
  public Roles: Role[] | undefined;

  constructor(private roleService: RoleService) {}
  ngOnInit(): void {
    this.getRoles();
  }

  public getRoles(): void {
    this.roleService.getRoles().subscribe(
      (response: Role[]) => {
        this.Roles = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }
}
