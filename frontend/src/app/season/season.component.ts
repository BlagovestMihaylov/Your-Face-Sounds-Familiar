import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Season } from '../season';
import { SeasonService } from '../season.service';

@Component({
  selector: 'app-season',
  templateUrl: './season.component.html',
  styleUrls: ['./season.component.css'],
})
export class SeasonComponent implements OnInit {
  public Seasons: Season[] | undefined;

  constructor(private seasonService: SeasonService) {}
  ngOnInit(): void {
    this.getSeasons();
  }

  public getSeasons(): void {
    this.seasonService.getSeasons().subscribe(
      (response: Season[]) => {
        this.Seasons = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }
}
