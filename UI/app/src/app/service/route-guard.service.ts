import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, Router, RouterStateSnapshot } from '@angular/router';
import { HardcodeAuthenticationService } from './hardcode-authentication.service';

@Injectable({
  providedIn: 'root'
})
export class RouteGuardService {
  constructor(private hardcodeAuthenticationServic:HardcodeAuthenticationService,
    private router:Router) {}
  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot){
    if(this.hardcodeAuthenticationServic.isUserLoggedIn())
    return true;
    this.router.navigate(['login']);
    return false;
  }
}
