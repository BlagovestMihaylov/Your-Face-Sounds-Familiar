import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Episode } from './episode';

@Injectable({
  providedIn: 'root',
})
export class EpisodeService {
  private apiServerUrl = environment.apiBaseUrl;
  constructor(private Http: HttpClient) {}

public getEpisodes(): Observable<Episode[]> {
    return this.Http.get<Episode[]>(`${this.apiServerUrl}/episode/all`);
  }
  public addEpisodes(Episode: Episode): Observable<Episode> {
    return this.Http.post<Episode>(`${this.apiServerUrl}/episode/add`, Episode);
  }
  public updateEpisodes(Episode: Episode): Observable<Episode> {
    return this.Http.put<Episode>(`${this.apiServerUrl}/episode/update`, Episode);
  }
  public deleteEpisodes(EpisodeId: number): Observable<void> {
    return this.Http.delete<void>(`${this.apiServerUrl}/episode/delete/${EpisodeId}`);
  }
}
