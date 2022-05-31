import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Jury } from '../jury';
import { JuryService } from '../jury.service';

@Component({
  selector: 'app-jury',
  templateUrl: './jury.component.html',
  styleUrls: ['./jury.component.css'],
})
export class JuryComponent implements OnInit {
  public jurys: Jury[] | undefined;

  constructor(private juryService: JuryService) {}

  ngOnInit(): void {
    this.getJurys();
  }

  public getJurys(): void {
    this.juryService.getJurys().subscribe(
      (response: Jury[]) => {
        this.jurys = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }
}
