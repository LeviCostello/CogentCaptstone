import { Component, OnInit } from '@angular/core';
import { NtServiceService } from 'src/app/services/nt-service.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css'],
})
export class UserComponent implements OnInit {
  isLoggedIn: boolean = false;
  constructor(private tokenStorage: NtServiceService) {}

  ngOnInit(): void {
    this.isLoggedIn = !!this.tokenStorage.getToken();
  }
  signOut() {
    this.tokenStorage.signOut();
  }
}
