import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { AuthService } from '../../services/auth.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css'],
})
export class RegisterComponent implements OnInit {
  constructor(private authService: AuthService) {}
  form: any = {
    firstName: null,
    lastName: null,
    password: null,
    phoneNumber: null,
    email: null,
    addressLine1: null,
    addressLine2: null,
    state: null,
    zipcode: null,
  };
  isSuccessful = false;
  isSignUpFailed = false;
  errorMessage = '';

  ngOnInit(): void {}

  onSubmit(): void {
    const {
      firstName,
      lastName,
      email,
      password,
      phoneNumber,
      addressLine1,
      addressLine2,
      state,
      pincode,
    } = this.form;

    this.authService
      .register(
        firstName,
        lastName,
        email,
        password,
        phoneNumber,
        addressLine1,
        addressLine2,
        state,
        pincode
      )
      .subscribe(
        (data) => {
          console.log(data);
          this.isSuccessful = true;
          this.isSignUpFailed = false;
        },
        (err) => {
          this.errorMessage = err.error.message;
          this.isSignUpFailed = true;
        }
      );
  }
  // formSubmit(): void {
  //   console.log(this.user);
  //   this.ntService.addUser(this.user).subscribe(
  //     (data: any) => {
  //       console.log(data);
  //     },
  //     (error) => {
  //       console.log(error);
  //       alert('Something went wrong');
  //     }
  //   );
  // }
}
