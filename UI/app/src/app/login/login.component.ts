import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Config } from 'protractor';
import { DataService } from '../service/data.service';
import { HardcodeAuthenticationService } from '../service/hardcode-authentication.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username:String | any
  password:String | any
  errMsg='Invalid Credentials!'
  success='Logged success!'
  invalidLogin=false
  v=false

  config: { UN: any; PW: any; UT: any; } | undefined;
  usertype:String | any
  constructor(private router:Router,private hardcodeAuthenticationService:HardcodeAuthenticationService,private dataService:DataService) { }

  ngOnInit(): void {
  }

  handelLongin() {
    this.dataService.getConfig(this.username)
    .subscribe((data: Config) =>{
      console.log(data);
      this.hardcodeAuthenticationService.un=data.username;
      this.hardcodeAuthenticationService.pw=data.password;
      this.hardcodeAuthenticationService.ut=data.usertype;
      console.log(data.usertype);
    }
      );
    if(this.hardcodeAuthenticationService.authenticate(this.username,this.password) && this.hardcodeAuthenticationService.ut==="admin" ){
      this.router.navigate(['admin_panel',this.username])
      this.invalidLogin=false
      this.v=true
      this.hardcodeAuthenticationService.admin=true
      this.hardcodeAuthenticationService.user=false
     
    }
    else if(this.hardcodeAuthenticationService.authenticate(this.username,this.password) && this.hardcodeAuthenticationService.ut==="customer"){
      this.router.navigate(['user_panel',this.username])
      this.invalidLogin=false
      this.v=true
      this.hardcodeAuthenticationService.user=true
      this.hardcodeAuthenticationService.admin=false
    }
    else{
      this.invalidLogin=true
      this.hardcodeAuthenticationService.user=false
      this.hardcodeAuthenticationService.admin=false
    }
  }
  
  loginConfig() {}
}
