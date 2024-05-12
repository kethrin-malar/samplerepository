package com.insurance.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.demo.entity.DriverEntity;
import com.insurance.demo.model.Driver;


@Repository
public interface DashboardRepository extends JpaRepository<DriverEntity, Integer> {

}
