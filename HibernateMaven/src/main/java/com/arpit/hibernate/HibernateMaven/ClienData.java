package com.arpit.hibernate.HibernateMaven;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Client_All_Data")
public class ClienData {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "client_id")
	private Integer clientId;
	@Column(name = "client_name")
	private String clientName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "veh_id")
	private Vehicle vehicle;
	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
	
	
}
