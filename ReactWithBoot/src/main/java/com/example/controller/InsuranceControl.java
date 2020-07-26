package com.example.controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.MediaTypeNotSupportedStatusException;

import com.example.entity.Plans;
import com.example.service.PlanService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@Api(value = "InsuranceControl", description = "Operations for Plans")
@ApiResponses(value = {@ApiResponse(code = 200, message = "Successfully retrieved list")})
public class InsuranceControl {

	@Autowired
	private PlanService planService;

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(InsuranceControl.class);

	/*
	 * This method retrieves all Plans of a Insurance Provider and return Response
	 * Message as 204 if the plans in DB are not available
	 */
	@RequestMapping(value = "/getAllPlans", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<com.example.entity.Plans> getAllPlans() {
		logger.debug("in my class");
		return planService.getAllPlans();
	}
	
	@RequestMapping(value = "/getPlan/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Plans getPlanById(@Valid @PathVariable Long id) throws Exception{
		 return planService.getPlanById(id);
	} 

	@RequestMapping(value = "/createnewPlan", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<Object> createPlan(@Valid @RequestBody Plans plans) {
		return planService.createNewPlan(plans);
	} 
	
	
	@RequestMapping(value = "/deletePlan/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deletePlan(@Valid @PathVariable Long id) {
		 planService.deletePlan(id);
	} 

}
