package com.skillogic.beans;

public class Address {
	private String doorNo;
	private String areaName;
	private String City;
	
	public void setDoorNo(String doorNo) {
		this.doorNo=doorNo;
	}
	public void setAreaName(String areaName) {
		this.areaName=areaName;
	}
	public void setCity(String City) {
		this.City=City;
	}
	public void displayAddress() {
		System.out.println(doorNo+" "+areaName+" "+City);
	}
}
