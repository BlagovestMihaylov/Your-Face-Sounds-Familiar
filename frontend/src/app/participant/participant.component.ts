import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Participant } from '../participant';
import { ParticipantService } from '../participant.service';

@Component({
  selector: 'app-participant',
  templateUrl: './participant.component.html',
  styleUrls: ['./participant.component.css']
})
export class ParticipantComponent implements OnInit {

public participants: Participant[] | undefined;

  constructor(private participantService: ParticipantService) {}
  ngOnInit(): void {
    this.getParticipants();
  }

  public getParticipants(): void {
    this.participantService.getParticipants().subscribe(
      (response: Participant[]) => {
        this.participants = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
 }
}
