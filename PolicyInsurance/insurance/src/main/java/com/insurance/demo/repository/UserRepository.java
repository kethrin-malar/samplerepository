package com.insurance.demo.repository;


	import org.springframework.stereotype.Repository;

	import com.insurance.demo.entity.UserEntity;

	import org.springframework.data.jpa.repository.JpaRepository;



	@Repository
	public interface UserRepository extends JpaRepository<UserEntity, Integer>{
		
		
	}
