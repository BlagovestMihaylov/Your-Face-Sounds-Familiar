import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Episode } from '../episode';
import { EpisodeService } from '../episode.service';

@Component({
  selector: 'app-episode',
  templateUrl: './episode.component.html',
  styleUrls: ['./episode.component.css'],
})
export class EpisodeComponent implements OnInit {
  public Episodes: Episode[] | undefined;

  constructor(private episodeService: EpisodeService) {}
  ngOnInit(): void {
    this.getEpisodes();
  }

  public getEpisodes(): void {
    this.episodeService.getEpisodes().subscribe(
      (response: Episode[]) => {
        this.Episodes = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }
}
