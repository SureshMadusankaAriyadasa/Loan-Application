import { Component, OnInit } from '@angular/core';
import { DataService } from '../service/data.service';
import { ActivatedRoute, Router } from '@angular/router';

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


@Component({
  selector: 'app-user-panel',
  templateUrl: './user-panel.component.html',
  styleUrls: ['./user-panel.component.css']
})

export class UserPanelComponent implements OnInit {
  todos : Customer[] | undefined
  constructor(private router:ActivatedRoute,private dataService:DataService) { }

  ngOnInit(): void {
    this.refreshUsers();
  }

  refreshUsers() {
    this.dataService.retrieveAllUsers().subscribe(
      response => {
        console.log(response);
        this.todos = response;
      }
    )
  }


}
