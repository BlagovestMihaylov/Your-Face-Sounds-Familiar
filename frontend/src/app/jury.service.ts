import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Jury } from './jury';

@Injectable({
  providedIn: 'root',
})
export class JuryService {
  private apiServerUrl = environment.apiBaseUrl;
  constructor(private Http: HttpClient) {}

  public getJurys(): Observable<Jury[]> {
    return this.Http.get<Jury[]>(`${this.apiServerUrl}/jury/all`);
  }
  public addJurys(jury: Jury): Observable<Jury> {
    return this.Http.post<Jury>(`${this.apiServerUrl}/jury/add`, jury);
  }
  public updateJurys(jury: Jury): Observable<Jury> {
    return this.Http.put<Jury>(`${this.apiServerUrl}/jury/update`, jury);
  }
  public deleteJurys(juryId: number): Observable<void> {
    return this.Http.delete<void>(
      `${this.apiServerUrl}/jury/delete/${juryId}`
    );
  }
}
