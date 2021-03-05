import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HardcodeAuthenticationService {
  un: any
  pw:any
  ut:any
  user=false
  admin=false
  constructor() { }
  
  authenticate(username:any, password:any) {
    if(username===this.un && password===this.pw){
      sessionStorage.setItem('authenticaterUser',username);
      return true;
    }
    else{
      return false;
    }
  }
  logout() {
    sessionStorage.removeItem('authenticaterUser')
  }
  isUserLoggedIn() {
    let user=sessionStorage.getItem('authenticaterUser')
    return !(user===null)
  }

  
}
