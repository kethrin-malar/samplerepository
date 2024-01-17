import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Policy } from './policy';

@Injectable({
  providedIn: 'root'
})
export class PolicyService {
  getPolicyList: any;
  getPolicyById(id: number) {
    throw new Error('Method not implemented.');
  }

  private policyUrl: string;

  constructor(private http: HttpClient) {
    this.policyUrl = 'http://localhost:8080/policy/create';
  }

  

  public save(policy: Policy):Observable<Object> {
    return this.http.post(`${this.policyUrl}`, policy,{responseType: 'text'});
  }
}
