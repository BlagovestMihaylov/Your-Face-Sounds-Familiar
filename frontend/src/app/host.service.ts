import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Host } from './host';

@Injectable({
  providedIn: 'root',
})
export class HostService {
  private apiServerUrl = environment.apiBaseUrl;
  constructor(private Http: HttpClient) {}

  public getHosts(): Observable<Host[]> {
    return this.Http.get<Host[]>(`${this.apiServerUrl}/host/all`);
  }
  public addHosts(host: Host): Observable<Host> {
    return this.Http.post<Host>(`${this.apiServerUrl}/host/add`, host);
  }
  public updateHosts(host: Host): Observable<Host> {
    return this.Http.put<Host>(`${this.apiServerUrl}/host/update`, host);
  }
  public deleteHosts(hostId: number): Observable<void> {
    return this.Http.delete<void>(`${this.apiServerUrl}/host/delete/${hostId}`);
  }
}
