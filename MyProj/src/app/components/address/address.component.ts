import { Component, OnInit } from '@angular/core';
import { NtServiceService } from 'src/app/services/nt-service.service';

@Component({
  selector: 'app-address',
  templateUrl: './address.component.html',
  styleUrls: ['./address.component.css'],
})
export class AddressComponent implements OnInit {
  message: string;
  constructor(private gs: NtServiceService) {}

  ngOnInit(): void {}
  processForm(pform: any) {
    this.gs.addAddress(JSON.stringify(pform.value)).subscribe((data) => {
      this.message = data;
    });
  }
}
