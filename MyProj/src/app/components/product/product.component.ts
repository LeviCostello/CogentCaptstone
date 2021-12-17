import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { NtServiceService } from 'src/app/services/nt-service.service';
import { Product } from 'src/app/common/product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css'],
})
export class ProductComponent implements OnInit {
  categoryName: string | any;
  productList: Product[] | any;
  constructor(private gs: NtServiceService, private route: ActivatedRoute) {}

  ngOnInit(): void {
    this.route.paramMap.subscribe(() => {
      this.categoryName = this.route.snapshot.paramMap.get('categoryName');
      if (this.categoryName) this.findByCategory(this.categoryName);
      else this.viewProducts();
    });
  }
  viewProducts() {
    this.gs.getProducts().subscribe((data) => {
      this.productList = data;
    });
  }

  findByCategory(cName: string) {
    this.gs.getProductsByCategory(cName).subscribe((data) => {
      this.productList = data;
    });
  }
}
