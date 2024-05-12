import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreatePolicyComponent  } from './create-policy/create-policy.component';
import { UserComponent } from './user/user.component';
import { DashboardComponent } from './dashboard/dashboard.component';





const routes: Routes = [
  { path: 'addpolicy', 
  component: CreatePolicyComponent  },
  { path: 'user', component: UserComponent } ,
  { path: 'dashboard', component: DashboardComponent } 
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
