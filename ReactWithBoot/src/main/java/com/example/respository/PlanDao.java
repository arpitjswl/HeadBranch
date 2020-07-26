package com.example.respository;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.entity.Plans;

public interface PlanDao {
	public List<Plans> getAllPlans();
	public Plans getPlanById(Long id) throws Exception;
	public ResponseEntity<Object> createNewPlan(Plans plans);
	public void deleteById(Long id);
}
