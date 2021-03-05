import { Component, OnInit } from '@angular/core';
import { HardcodeAuthenticationService } from '../service/hardcode-authentication.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
  isUserLoggedIn: boolean =false;
      user=this.hardcodeAuthenticationService.user
      admin=this.hardcodeAuthenticationService.admin

  constructor(public hardcodeAuthenticationService:HardcodeAuthenticationService) { }

  ngOnInit(): void {
    this.isUserLoggedIn=this.hardcodeAuthenticationService.isUserLoggedIn();
  }

}
