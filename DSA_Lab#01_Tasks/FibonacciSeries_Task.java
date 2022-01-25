import java.util.*;

//@Author: Junaid Aslam(Jonny)
//@Roll Number: 20SW084

/**************************************************
Permission to use, copy, modify, and distribute 
this software and its documentation for educational, 
research, and not-for-profit purposes
**************************************************/

public class Main
{
	public static void main(String[] args) {
	    int n;
	    int first=1;
	    int next=1;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Number of Terms");
	    n=sc.nextInt();
	    System.out.print(first+" "+next+" ");
	    for(int i=3;i<n;i++){
	        int temp=next;
	        next=first+next;
	        first=temp;
	        System.out.print(next+" ");
	    }
	}
}





















//@Author: Junaid Aslam(Jonny)
//@Roll Number: 20SW084
