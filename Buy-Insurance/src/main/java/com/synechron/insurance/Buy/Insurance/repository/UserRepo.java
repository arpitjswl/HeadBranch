package com.synechron.insurance.Buy.Insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synechron.insurance.Buy.Insurance.entity.User;

public  interface UserRepo extends JpaRepository<User, Integer> {

}
