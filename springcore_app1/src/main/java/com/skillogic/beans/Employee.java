package com.skillogic.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private Address address;
	private List<String> nickName;
	private Set<String> mobileNo;
	private Map<String,String> idProofs;


	
	public void setNickName(List<String> nickName) {
		this.nickName = nickName;
	}
	public void setMobileNo(Set<String> mobileNo) {
		this.mobileNo = mobileNo;
	}
	public void setIdProofs(Map<String, String> idProofs) {
		this.idProofs = idProofs;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void displayEmployee() {
		System.out.println("id :"+id);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
		System.out.println("nickName:"+nickName);
		System.out.println("mobileNo:"+mobileNo);
		System.out.println("idProofs:"+idProofs);



		address.displayAddress();
	}

}
