import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Participant } from './participant';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root',
})
export class ParticipantService {
  private apiServerUrl = environment.apiBaseUrl;
  constructor(private Http: HttpClient) {}

  public getParticipants(): Observable<Participant[]> {
    return this.Http.get<Participant[]>(`${this.apiServerUrl}/participant/all`);
  }
  public addParticipants(participant: Participant): Observable<Participant> {
    return this.Http.post<Participant>(
      `${this.apiServerUrl}/particpant/add`,
      participant
    );
  }
  public updateParticipants(participant: Participant): Observable<Participant> {
    return this.Http.put<Participant>(
      `${this.apiServerUrl}/particpant/update`,
      participant
    );
  }
  public deleteParticipants(participantId: number): Observable<void> {
    return this.Http.delete<void>(
      `${this.apiServerUrl}/particpant/delete/${participantId}`
    );
  }
}
