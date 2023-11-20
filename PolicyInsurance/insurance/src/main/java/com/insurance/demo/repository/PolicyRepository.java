package com.insurance.demo.repository;

import org.springframework.stereotype.Repository;

import com.insurance.demo.entity.PolicyEntity;

import org.springframework.data.jpa.repository.JpaRepository;



@Repository
public interface PolicyRepository extends JpaRepository<PolicyEntity, Integer> {
  
}