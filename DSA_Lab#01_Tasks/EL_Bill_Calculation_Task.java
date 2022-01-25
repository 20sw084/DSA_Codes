package myhibernate;

import java.util.Scanner;

//@Author: Junaid Aslam(Jonny)
//@Roll Number: 20SW084

/**************************************************
Permission to use, copy, modify, and distribute 
this software and its documentation for educational, 
research, and not-for-profit purposes
**************************************************/

public class Electricity_Bill_Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Units Consumed");
		int units=sc.nextInt();
		int price=0;					//for totalling the price of all units
		if(units<50) {
			price+=units*10;
		}
		if(units>49&&units<101) {
			price+=units*15;
		}
		if(units>100&&units<201) {
			price+=units*20;
		}
		if(units>200&&units<300) {
			price+=units*25;
		}
		if(units>300) {
			price+=units*30;
		}
		
		System.out.println("Price of Units is: "+price+" Rupees.");
	}

}





















//@Author: Junaid Aslam(Jonny)
//@Roll Number: 20SW084
