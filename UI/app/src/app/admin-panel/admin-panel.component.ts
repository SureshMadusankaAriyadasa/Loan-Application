import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { DataService } from '../service/data.service';

export class Customer{
  constructor(
    public firstname:String,
    public lastname :string,
    public add_line1:String,
    public add_line2:String,
    public city:String,
    public email:String,
    public tel_no:String,
    public NIC:String,
    public bank_acc_no:number
  ){}
}
export class UserT{
  constructor(
    public username:String,
    public usertype :string,
  ){}
}
@Component({
  selector: 'app-admin-panel',
  templateUrl: './admin-panel.component.html',
  styleUrls: ['./admin-panel.component.css']
})
export class AdminPanelComponent implements OnInit {
  name: string | undefined
  todos : Customer[] | undefined
  userts:UserT[] | undefined
  constructor(private router:ActivatedRoute,private dataService:DataService,private route:Router ) { }

  ngOnInit(): void {
    this.name=this.router.snapshot.params['name']
    this.refreshUsers();
    this.refreshUserT();
  }
  refreshUsers() {
    this.dataService.retrieveAllUsers().subscribe(
      response => {
        console.log(response);
        this.todos = response;
      }
    )
  }

  refreshUserT() {
    this.dataService.retrieveAllUserT().subscribe(
      response => {
        console.log(response);
        this.userts = response;
      }
    )
  }

}
