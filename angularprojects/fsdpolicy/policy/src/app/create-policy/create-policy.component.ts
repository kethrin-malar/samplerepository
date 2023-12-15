import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Policy } from '../policy';
import { PolicyService } from '../policy.service';

@Component({
  selector: 'app-create-policy',
  templateUrl: './create-policy.component.html',
  styleUrls: ['./create-policy.component.css']
})
export class CreatePolicyComponent {
  
  policy: any = {
    policy_Number: '',
    policy_Effective_Date: '',
    policy_Expire_Date: '',
    payment_Option: '',
    total_Amount: '',
    created_Date: '' 
  };

  constructor(
    private route: ActivatedRoute, 
      private router: Router, 
        private policyService: PolicyService) {
    this.policy = new Policy();
  }

  onSubmit() {
    this.policyService.save(this.policy).subscribe((response: any) =>{
      alert(response);
      console.log(response)
    },
      result => this.gotoPolicyList());
  }

  gotoPolicyList() {
    this.router.navigate(['/policy']);
  }
} 
  