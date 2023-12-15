import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { CreatePolicyComponent } from './create-policy/create-policy.component';

import { FormsModule }   from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { UserComponent } from './user/user.component';
import { DashboardComponent } from './dashboard/dashboard.component';



@NgModule({
  declarations: [
    AppComponent,
    
    CreatePolicyComponent,
    UserComponent,
    DashboardComponent
  ],
  imports: [
   
    FormsModule,
    ReactiveFormsModule,
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }