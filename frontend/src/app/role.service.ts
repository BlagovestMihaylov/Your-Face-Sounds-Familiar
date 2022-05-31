import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Role } from './role';

@Injectable({
  providedIn: 'root',
})
export class RoleService {
  private apiServerUrl = environment.apiBaseUrl;
  constructor(private Http: HttpClient) {}

  public getRoles(): Observable<Role[]> {
    return this.Http.get<Role[]>(`${this.apiServerUrl}/role/all`);
  }
  public addRoles(Role: Role): Observable<Role> {
    return this.Http.post<Role>(`${this.apiServerUrl}/role/add`, Role);
  }
  public updateRoles(Role: Role): Observable<Role> {
    return this.Http.put<Role>(`${this.apiServerUrl}/role/update`, Role);
  }
  public deleteRoles(RoleId: number): Observable<void> {
    return this.Http.delete<void>(`${this.apiServerUrl}/role/delete/${RoleId}`);
  }
}
