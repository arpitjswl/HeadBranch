package com.example.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.entity.Plans;


public interface PlanService {
	public List<Plans> getAllPlans();
	public ResponseEntity<Object> createNewPlan(Plans plans);
	public void deletePlan(@PathVariable Long id);
	public Plans getPlanById(Long id) throws Exception;
}
