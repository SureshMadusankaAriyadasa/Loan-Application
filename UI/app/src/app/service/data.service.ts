import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer, UserT } from '../admin-panel/admin-panel.component';
import { AddCustomer } from '../register/register.component';

@Injectable({
  providedIn: 'root'
})
export class DataService {
  retrieveAllUserT() {
    return this.http.get<UserT[]>(`http://localhost:8080/users/all`);
  }
  constructor(private http: HttpClient) { }
  getConfig(username: undefined) {
    return this.http.get(`http://localhost:8080/users/search/${username}`);
  }

  retrieveAllUsers(){
    return this.http.get<Customer[]>(`http://localhost:8080/user_details/all`);
  }

  addUserDetails(addCustomer: AddCustomer): Observable<AddCustomer>{
    return this.http.post<AddCustomer>(`http://localhost:8080/user_details/reg`,addCustomer);
  }
  

}
