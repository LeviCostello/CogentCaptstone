import { Component, OnInit } from '@angular/core';
import { NtServiceService } from 'src/app/services/nt-service.service';

@Component({
  selector: 'app-productadd',
  templateUrl: './productadd.component.html',
  styleUrls: ['./productadd.component.css'],
})
export class ProductaddComponent implements OnInit {
  constructor(private gs: NtServiceService) {}

  ngOnInit(): void {}
  processForm(pform: any) {
    this.gs.addProduct(JSON.stringify(pform.value)).subscribe((data) => {
      this.message = data;
    });
  }
}
