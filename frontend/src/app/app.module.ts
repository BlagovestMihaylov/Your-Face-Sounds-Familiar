import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ParticipantService } from './participant.service';
import { ParticipantComponent } from './participant/participant.component';
import { EpisodeComponent } from './episode/episode.component';
import { SeasonComponent } from './season/season.component';
import { HostComponent } from './host/host.component';
import { JuryComponent } from './jury/jury.component';
import { RoleComponent } from './role/role.component';
import { EpisodeService } from './episode.service';
import { SeasonService } from './season.service';

@NgModule({
  declarations: [
    AppComponent,
    ParticipantComponent,
    EpisodeComponent,
    SeasonComponent,
    HostComponent,
    JuryComponent,
    RoleComponent,
  ],
  imports: [BrowserModule, AppRoutingModule, HttpClientModule],
  providers: [
    ParticipantService,
    EpisodeService,
    SeasonService,
    SeasonComponent,
    HostComponent,
    JuryComponent,
    RoleComponent,
  ],
  bootstrap: [AppComponent],
})
export class AppModule {}
