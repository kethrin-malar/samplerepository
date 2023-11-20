package com.insurance.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.demo.entity.PolicyEntity;
import com.insurance.demo.repository.PolicyRepository;
import com.insurance.demo.service.PolicyService;


@Service
public class PolicyServiceImpl implements PolicyService {
    @Autowired
    private PolicyRepository policyRepository;

    @Override
    public String createPolicy(PolicyEntity policy) {
    	policyRepository.save(policy);
    	return "Policy created successfully";
    }
        
}

