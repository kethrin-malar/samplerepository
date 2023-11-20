package com.insurance.demo.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.demo.business.PolicyBusiness;
import com.insurance.demo.entity.PolicyEntity;
import com.insurance.demo.service.PolicyService;


@Service
public class PolicyBusinessImpl implements PolicyBusiness {

    @Autowired
    private PolicyService policyService;

    public String createPolicy(PolicyEntity policy) {
        // Add any additional business logic here if needed
        String msg = policyService.createPolicy(policy);
        return msg;
    }
}
