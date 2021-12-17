import { Component, OnInit } from '@angular/core';
import { NtServiceService } from 'src/app/services/nt-service.service';

@Component({
  selector: 'app-ordering',
  templateUrl: './ordering.component.html',
  styleUrls: ['./ordering.component.css'],
})
export class OrderingComponent implements OnInit {
  message: string | any;
  constructor(private gs: NtServiceService) {}

  ngOnInit(): void {}

  processForm(pform: any) {
    this.gs.addOrder(JSON.stringify(pform.value)).subscribe((data) => {
      this.message = data;
    });
  }
}
