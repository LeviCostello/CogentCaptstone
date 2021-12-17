import { Component, OnInit } from '@angular/core';
import { NtServiceService } from 'src/app/services/nt-service.service';

@Component({
  selector: 'app-query',
  templateUrl: './query.component.html',
  styleUrls: ['./query.component.css'],
})
export class QueryComponent implements OnInit {
  message: string | any;
  constructor(private gs: NtServiceService) {}

  ngOnInit(): void {}
  processForm(pform: any) {
    this.gs.addQuery(JSON.stringify(pform.value)).subscribe((data) => {
      this.message = data;
    });
  }
}
