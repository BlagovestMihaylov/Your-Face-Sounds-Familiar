import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Season } from './season';

@Injectable({
  providedIn: 'root',
})
export class SeasonService {
  private apiServerUrl = environment.apiBaseUrl;
  constructor(private Http: HttpClient) {}

  public getSeasons(): Observable<Season[]> {
    return this.Http.get<Season[]>(`${this.apiServerUrl}/season/all`);
  }
  public addSeasons(Season: Season): Observable<Season> {
    return this.Http.post<Season>(`${this.apiServerUrl}/season/add`, Season);
  }
  public updateSeasons(Season: Season): Observable<Season> {
    return this.Http.put<Season>(`${this.apiServerUrl}/season/update`, Season);
  }
  public deleteSeasons(SeasonId: number): Observable<void> {
    return this.Http.delete<void>(
      `${this.apiServerUrl}/season/delete/${SeasonId}`
    );
  }
}
