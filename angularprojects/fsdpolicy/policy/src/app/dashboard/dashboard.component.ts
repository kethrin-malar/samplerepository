import { Component, OnInit } from '@angular/core';
import { Driver } from '../driver';
import { DashboardService } from '../dashboard.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit{
  id:number;
 driver:Driver;
 constructor(private dashboardService: DashboardService) { }

  ngOnInit(): void {
    this.id = 41; 
    this.loadDriverData();

  
  }
  loadDriverData() {
    this.dashboardService.getDriverById(this.id).subscribe(driver => {
      this.driver = driver;
      
    });
  }

}
