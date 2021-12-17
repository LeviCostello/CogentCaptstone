import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { NtServiceService } from 'src/app/services/nt-service.service';

@Component({
  selector: 'app-productinfo',
  templateUrl: './productinfo.component.html',
  styleUrls: ['./productinfo.component.css'],
})
export class ProductinfoComponent implements OnInit {
  id: number | any;
  product: Product | any;
  user: User | any;
  message: string | any;
  constructor(private gs: NtServiceService, private route: ActivatedRoute) {}

  ngOnInit(): void {
    this.route.paramMap.subscribe(() => {
      this.id = +this.route.snapshot.paramMap.get('id');
      this.findById(this.id);
    });
  }
  findById(id: number) {
    this.gs.getProductsById(id).subscribe((data) => {
      this.product = data[0];
    });
  }

  addToCart() {
    this.gs
      .addCart(this.id, this.product.price, this.gs.getUser().id)
      .subscribe((data) => {
        this.message = data;
      });
  }
}
