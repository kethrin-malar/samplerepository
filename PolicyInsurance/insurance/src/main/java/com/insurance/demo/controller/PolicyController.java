package com.insurance.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.insurance.demo.business.PolicyBusiness;
import com.insurance.demo.entity.PolicyEntity;


@RestController
@RequestMapping("/policy")
@CrossOrigin(origins="*")
public class PolicyController {

    @Autowired
    private PolicyBusiness policyBusiness;

    @PostMapping("/create")
    public String createPolicy(@RequestBody PolicyEntity policy) {
    	System.out.println("^^^^^^^^^^^^^^^"+policy.getPolicy_Number());
        String msg = policyBusiness.createPolicy(policy);
        return msg;
    }
   
}



