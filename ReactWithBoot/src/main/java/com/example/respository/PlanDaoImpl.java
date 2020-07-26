package com.example.respository;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.entity.Plans;


@Repository
public class PlanDaoImpl implements PlanDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public List<Plans> getAllPlans() {
		
		Session session = this.sessionFactory.getCurrentSession();
		List<Plans>  plansList = session.createQuery("from Plans").list();
		return plansList;
	}

	@Override
	public Plans getPlanById(Long id) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		Plans plan = session.get(Plans.class, id);
		System.out.println("Plan is  + "+plan);
			if (plan!=null)
				return plan;
			else
				throw new Exception("Id not found");
	}
	
	
	@Override
	public ResponseEntity<Object> createNewPlan(Plans plans) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(plans);
		URI location =  ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(plans.getId()).toUri();
		return ResponseEntity.created(location).build();
		
	}

	@Override
	public void deleteById(Long id) {
		Session session = this.sessionFactory.getCurrentSession();
		Plans plan = session.get(Plans.class, id);
		if (plan != null) {
			session.delete(plan);
		}
	}

	
	

}
