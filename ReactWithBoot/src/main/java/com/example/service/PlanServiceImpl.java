package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.entity.Plans;
import com.example.respository.PlanDao;

@Service
@Transactional
public class PlanServiceImpl implements PlanService{
	
	@Autowired
	private PlanDao planDao;

	@Override
	public List<Plans> getAllPlans() {
		
		return planDao.getAllPlans();
	}

	@Override
	public ResponseEntity<Object> createNewPlan(Plans plans) {
		return planDao.createNewPlan(plans);
	}

	@Override
	public void deletePlan(Long id) {
		planDao.deleteById(id);
		
	}

	@Override
	public Plans getPlanById(Long id) throws Exception {
		return planDao.getPlanById(id);
	}
	
}
