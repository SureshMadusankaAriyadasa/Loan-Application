import { Component, OnInit } from '@angular/core';
import { DataService } from '../service/data.service';

export class AddCustomer{
  // constructor(
     // constructor(
    public firstname: any;
    public lastname :any;
    public add_line1:any;
    public add_line2:any;
    public city:any;
    public email:any;
    public tel_no:any;
    public iduser_details:any;
    public NIC:any ;
    public bank_acc_no:any;
    
  //){}
}
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
addCustomer: AddCustomer=new AddCustomer();
firstname!: String;
lastname! :string;
add_line1!:String;
add_line2!:String;
city!:String;
email!:String;
tel_no!:String;
NIC!:String;
bank_acc_no!:number;
iduser_details!:number;

  constructor(private dataService:DataService) { }

  ngOnInit(): void {
  }

  handelSubmit() {
    this.addCustomer.firstname=this.firstname
    this.addCustomer.lastname=this.lastname
    this.addCustomer.add_line1=this.add_line1
    this.addCustomer.add_line2=this.add_line2
    this.addCustomer.city=this.city
    this.addCustomer.email=this.email
    this.addCustomer.tel_no=this.tel_no
    this.addCustomer.iduser_details=this.iduser_details
    this.addCustomer.NIC=this.NIC
    this.addCustomer.bank_acc_no=this.bank_acc_no
    
    this.dataService.addUserDetails(this.addCustomer)  
    .subscribe(data => console.log(data), error => console.log(error)); 
    console.log(this.addCustomer.firstname); 
    
  }

}
