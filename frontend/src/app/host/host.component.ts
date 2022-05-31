import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Host } from '../host';
import { HostService } from '../host.service';

@Component({
  selector: 'app-host',
  templateUrl: './host.component.html',
  styleUrls: ['./host.component.css'],
})
export class HostComponent implements OnInit {
  public hosts: Host[] | undefined;

  constructor(private hostService: HostService) {}

  ngOnInit(): void {
    this.getHosts();
  }

  public getHosts(): void {
    this.hostService.getHosts().subscribe(
      (response: Host[]) => {
        this.hosts = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }
}
