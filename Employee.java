package com.sonata.Employee;

//Employee is the Super class which is Abstract
public abstract class Employee {
	private int empID;
	private String empName;
	private String address; 
	private double basicPay; 
	private int leavesAvailable;
	
	public abstract void applyLeave(int noOf);   //ApplyLeave abstract method which do not have any any implementation
	public abstract double calSal();      //CalculateSal abstract method which do not have any any implementation
	public abstract void addEmp(Object o);
	public abstract Object readEmp();
	
//Getters and Setters for the Variables declared 
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}
	public String setEmpName(String empName) {
		return this.empName = empName;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public int getLeavesAvailable() {
		return leavesAvailable;
	}
	public void setLeavesAvailable(int leavesAvailable) {
		this.leavesAvailable = leavesAvailable;
	}

	

//This is the toSting method which is used to print the Information of employee
	public String toString()
	{
		return " "+empID+" "+empName+" "+address+" "+basicPay+" "+leavesAvailable;
	}
	

}
