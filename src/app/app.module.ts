import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ContactusComponent } from './components/contactus/contactus.component';
import { AboutusComponent } from './components/aboutus/aboutus.component';
import { CampingComponent } from './components/camping/camping.component';
import { MountaineeringComponent } from './components/mountaineering/mountaineering.component';
import { GolfComponent } from './components/golf/golf.component';
import { OutdoorComponent } from './components/outdoor/outdoor.component';
import { PersonalComponent } from './components/personal/personal.component';
import { ProductComponent } from './components/product/product.component';
import { ItemComponent } from './components/item/item.component';
import { CartComponent } from './components/cart/cart.component';
import { HomeComponent } from './components/home/home.component';
import { ReactiveFormsModule } from '@angular/forms';
import { RouterLinkActive } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { FormsModule } from '@angular/forms';
import { authInterceptorProviders } from './_helpers/auth-interceptor';
import { AddressComponent } from './components/address/address.component';
import { QueryComponent } from './components/query/query.component';

const route: Routes = [
  //{ path: 'categories/:categoryName', component: ProductViewComponent },
  //{ path: 'categories', component: CategoryViewComponent },
  //{ path: 'products/:id', component: ProductSpecsComponent },
  // { path: 'products', component: ProductViewComponent },
  //{ path: 'addProduct', component: ProductAddComponentComponent },
  { path: 'login', component: LoginComponent },
  //{ path: 'cart', component: EditCartComponent },
  //{ path: 'cart/:cartId', component: EditCartComponent },
  //{ path: 'cart/user/:userId', component: EditCartComponent },
  //{ path: 'contact', component: ContactComponent },
  // { path: 'about', component: AboutComponent },
  { path: 'signup', component: RegisterComponent },
  { path: 'login', component: LoginComponent },
  //{ path: 'token', component: ProfileComponent },
  { path: '**', redirectTo: 'categories', pathMatch: 'full' },
];

@NgModule({
  declarations: [
    AppComponent,
    ContactusComponent,
    AboutusComponent,
    CampingComponent,
    MountaineeringComponent,
    GolfComponent,
    OutdoorComponent,
    PersonalComponent,
    ProductComponent,
    ItemComponent,
    CartComponent,
    HomeComponent,
    LoginComponent,
    RegisterComponent,
    AddressComponent,
    QueryComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot(route),
    NgbModule,
    FormsModule,
  ],
  providers: [authInterceptorProviders],
  bootstrap: [AppComponent],
})
export class AppModule {}
