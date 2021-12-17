import { Component, OnInit } from '@angular/core';
import { Cart } from 'src/app/common/cart';
import { NtServiceService } from 'src/app/services/nt-service.service';
import { ActivatedRoute } from '@angular/router';
import { Product } from 'src/app/common/product';

@Component({
  selector: 'app-cartedit',
  templateUrl: './cartedit.component.html',
  styleUrls: ['./cartedit.component.css'],
})
export class CarteditComponent implements OnInit {
  id: number | any;
  cart: Cart | any;
  product: Product | any;
  quantity: number | any;
  message: String | any;
  cartId: number | any;
  userId: number | any;
  cartList: Cart[] | any;

  constructor(private gs: NtServiceService, private route: ActivatedRoute) {}

  ngOnInit(): void {
    this.route.paramMap.subscribe(() => {
      this.cartId = +this.route.snapshot.paramMap.get('cartId');
      this.userId = +this.route.snapshot.paramMap.get('userId');
      if (this.cartId != 0) this.findById(this.cartId);
      else if (this.userId != 0) this.findByUserId(this.userId);
      else this.viewCarts();
    });
  }

  changeCart() {
    this.gs
      .changeCart(this.product.productId, this.quantity, this.cart.cartId)
      .subscribe((data) => {
        this.message = data;
      });
  }

  deleteCart() {
    this.gs.deleteCart(this.cart.cartId).subscribe((data) => {
      this.message = data;
    });
  }

  viewCarts() {
    this.gs.getCarts().subscribe((data) => {
      this.cartList = data;
    });
  }

  findById(cartId: number) {
    this.gs.getCartsById(this.cartId).subscribe((data) => {
      this.cartList = data;
    });
  }

  findByUserId(userId: number) {
    this.gs.getCartsByUserId(this.userId).subscribe((data) => {
      this.cartList = data;
    });
  }
}
