package com.arpit.dryrun;

//Employee.java
	final class NewEmployee {
	private final String empName;
	private final int age;
	private final Address address;
	public NewEmployee(String name, int age, Address address) {
	   super();
	   this.empName = name;
	   this.age = age;
	   this.address = address;
	}
	public String getEmpName() {
	   return empName;
	}
	public int getAge() {
	   return age;
	}
	/* public Address getAddress() {
	   return address;
	   }
	*/
	public Address getAddress() throws CloneNotSupportedException {
	   return (Address) address.clone();
	}
	}
	//Address.java
	class Address implements Cloneable {
	public String addressType;
	public String address;
	public String city;
	public Address(String addressType, String address, String city) {
	   super();
	   this.addressType = addressType;
	   this.address = address;
	   this.city = city;
	}
	public String getAddressType() {
	   return addressType;
	}
	public void setAddressType(String addressType) {
	   this.addressType = addressType;
	}
	public String getAddress() {
	   return address;
	}
	public void setAddress(String address) {
	   this.address = address;
	}
	public String getCity() {
	   return city;
	}
	public void setCity(String city) {
	   this.city = city;
	}
	public Object clone() throws CloneNotSupportedException {
	   return super.clone();
	}
	
	@Override
	public String toString() {
	   return "Address Type - "+addressType+", address - "+address+", city - "+city;
	}
	}
//MainClass.java
public class MainClass {
public static void main(String[] args) throws Exception {
	Address address = new Address("Home", "Madhapur", "Hyderabad");
   NewEmployee emp = new NewEmployee("Adithya", 34, address);
   emp.getAddress().setAddress("Hi-tech City");
   emp.getAddress().setAddressType("Office");
   emp.getAddress().setCity("Hyderabad");
   System.out.println(address);
   
   System.out.println(emp.getAddress());
}
}