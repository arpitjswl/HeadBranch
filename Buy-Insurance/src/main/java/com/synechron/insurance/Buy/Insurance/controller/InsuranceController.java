package com.synechron.insurance.Buy.Insurance.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.synechron.insurance.Buy.Insurance.entity.Plans;
import com.synechron.insurance.Buy.Insurance.entity.Posts;
import com.synechron.insurance.Buy.Insurance.entity.User;
import com.synechron.insurance.Buy.Insurance.repository.PlanRepository;
import com.synechron.insurance.Buy.Insurance.repository.PostRepo;
import com.synechron.insurance.Buy.Insurance.repository.UserRepo;
import com.synechron.insurance.Buy.Insurance.service.PlanService;

import io.swagger.annotations.ApiOperation;

@RestController
public class InsuranceController {
	
	private static final Logger logger = LoggerFactory.getLogger(InsuranceController.class);
	
	@Autowired
	private PlanService planService;
	
	/* For User post */ 
	@Autowired
	private PostRepo postRepo;
	
	@Autowired
	private UserRepo userRepo;
	
	/* End For User post */
	
	
	
	/*This method retrieves all Plans of a Insurance Provider and return Response Message as 204 if the plans in DB are not available*/
	@RequestMapping(value = "/getAllPlans", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Plans> getAllPlans(){
	logger.info("in getAllPlans method");
	 return	planService.getAllPlans();
	}
	

	/* This method get a Object by passing a id in request parameter*/
	@RequestMapping(value = "/getAllPlans/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Get plans by mentioning ID")
	public Optional<Plans> retreivePlan(@PathVariable Long id) throws Exception{
		return planService.retreivePlan(id);
	}
	
	/* This method saved a User Object and return Response to client with Status code we have used ResponseEntity class*/
	@RequestMapping(value = "/getAllPlans", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<Object> createPlan(@Valid @RequestBody Plans plans) {
		return 	planService.createNewPlan(plans);
	}
	
	/* Updating a Plan */
	@RequestMapping(value = "/getAllPlans/{id}", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updatePlans(@RequestBody Plans plans, @PathVariable() Long id) {
		planService.updatePlans(plans, id);
	}
	
	/* Deleting a Plan */
	@RequestMapping(value = "/getAllPlans/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteUser(@PathVariable Long id) {
		planService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/getCustomPlans", method = RequestMethod.GET)
	public List<Plans> getCustomPlans(){
		return planService.getCustomPlans();
	}
	
	/* Customer Post */
	
	@RequestMapping(value = "/getAllPost", method = RequestMethod.GET)
	public List<Posts> getAllUserPosts(){
		List<Posts> post = postRepo.findAll(); 
		return post;
	}
	
	@RequestMapping(value = "/getAllPost/user/{id}", method = RequestMethod.GET)
	public List<Posts> getAllUserPosts(@PathVariable Integer id){
		Optional<User> user = userRepo.findById(id);
		System.out.println("User is " + user);
		List<Posts> listOfPosts = user.get().getList();
		return listOfPosts;
	}
	
	
	@RequestMapping(value = "/user/{id}/posts", method = RequestMethod.POST)
	public ResponseEntity<Object> createUserPost(@RequestBody Posts post, @PathVariable Integer id){
		Optional<User> opt = userRepo.findById(id);
		User user = opt.get();
		post.setUser(user);
		postRepo.save(post);
		
		URI location=ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(post.getId()).toUri();
		return ResponseEntity.created(location).build();  
	}
	/* End Customer Post */
	
	@RequestMapping("/employee/filter/{name}")
    public List<String> getFiltered(@PathVariable String name) {
        return postRepo.findByDesc(name);
    }
}
	


