import { Component, OnInit } from '@angular/core';
import { NtServiceService } from 'src/app/services/nt-service.service';

@Component({
  selector: 'app-personal',
  templateUrl: './personal.component.html',
  styleUrls: ['./personal.component.css'],
})
export class PersonalComponent implements OnInit {
  currentUser: any;
  constructor(private token: NtServiceService) {}

  ngOnInit(): void {
    this.currentUser = this.token.getUser();
  }
}
