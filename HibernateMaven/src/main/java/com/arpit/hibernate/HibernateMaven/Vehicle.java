package com.arpit.hibernate.HibernateMaven;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Vehicle {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer vehId;
	private String name;
}
