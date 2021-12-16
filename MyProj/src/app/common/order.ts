import { Product } from './product';
import { User } from './user';
import { Deliveryaddress } from './deliveryaddress';
export class Order {
  orderId: number;
  user: User;
  product: Product;
  quantity: number;
  price: number;
  da: Deliveryaddress;
}
