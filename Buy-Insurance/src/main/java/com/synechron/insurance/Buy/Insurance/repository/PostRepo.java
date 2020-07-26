package com.synechron.insurance.Buy.Insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.synechron.insurance.Buy.Insurance.entity.Posts;

public interface PostRepo extends JpaRepository<Posts, Integer>{
	
	@Query("Select description from Posts")
	public java.util.List<String> findByDesc(String desc);

}
