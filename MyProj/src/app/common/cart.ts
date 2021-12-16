import { User } from './user';
import { Product } from './product';
export class Cart {
  cartId: number;
  user: User;
  product: Product;
  quantity: number;
  price: number;
}
