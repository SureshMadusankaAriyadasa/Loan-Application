import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminPanelComponent } from './admin-panel/admin-panel.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { RegisterComponent } from './register/register.component';
import { RouteGuardService } from './service/route-guard.service';
import { UserPanelComponent } from './user-panel/user-panel.component';
import { WelcomeComponent } from './welcome/welcome.component';

const routes: Routes = [
  {path:'home',component:WelcomeComponent},
  {path:'login',component:LoginComponent},
  {path:'register',component:RegisterComponent},
  {path:'admin_panel/:name',component:AdminPanelComponent,canActivate:[RouteGuardService]},
  {path:'admin_panel',component:AdminPanelComponent,canActivate:[RouteGuardService]},
  {path:'user_panel/:name',component:UserPanelComponent, canActivate:[RouteGuardService]},
  {path:'user_panel',component:UserPanelComponent, canActivate:[RouteGuardService]},
  {path:'logout',component:LogoutComponent},
  {path:'**',component:LoginComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
