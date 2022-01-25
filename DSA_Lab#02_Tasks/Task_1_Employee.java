/* 
 * Lab 2 Tasks
 */
package dsaCodes;

import java.util.Scanner;

//@Author: Junaid Aslam(Jonny)
//@Roll Number: 20SW084

/**************************************************
Permission to use, copy, modify, and distribute 
this software and its documentation for educational, 
research, and not-for-profit purposes
**************************************************/

public class Employee{
	float salary;
	float numberOfHoursPerDay;
	public Employee(float salary, float numberOfHoursPerDay) {
		super();
		this.salary = salary;
		this.numberOfHoursPerDay = numberOfHoursPerDay;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getNumberOfHoursPerDay() {
		return numberOfHoursPerDay;
	}
	public void setNumberOfHoursPerDay(float numberOfHoursPerDay) {
		this.numberOfHoursPerDay = numberOfHoursPerDay;
	}
	
	//....1
	
	public void getInfo(float salary,float numberOfHoursPerDay) {
		this.numberOfHoursPerDay=numberOfHoursPerDay;
		this.salary=salary;
	}
	
	//....2
	
	public void addSal() {
		if(this.salary==0.0) {
			System.out.println("Salary doesnt begins(initialized) yet.");
		}
		else if(this.salary<500  &&  this.salary>0){
			this.salary+=10;
		}
	}
	
	//....3
	
	public void addWork() {
		if(this.numberOfHoursPerDay==0.0) {
			System.out.println("Hours doesnt begins(initialized) yet.");
		}
		else if(this.numberOfHoursPerDay>6 ){
			this.salary+=5;
		}
	}
	
	//....4
	
	public void print() {
		System.out.println("Salary is: "+this.salary);
		System.out.println("Number Of Hours Per Day is: "+this.numberOfHoursPerDay);
	}
	
	// Main method to test employee class
	public static void main(String args[]) {
		Employee e1=new Employee();
		e1.getInfo(5700,7);
		e1.addSal();
		e1.addWork();
		e1.print();
		
	}
}
