//@Author: Junaid Aslam(Jonny)
//@Roll Number: 20SW084

/**************************************************
Permission to use, copy, modify, and distribute 
this software and its documentation for educational, 
research, and not-for-profit purposes
**************************************************/

public class Triangle_Numbers
{
	public static void main(String[] args) {
	    int row=9;
	    int i=0;
	    int j=0;
	    for(i=1;i<=row;i+=2){		
	    	for(j=row-i;j>1;j-=2){// Loop for printing space before *s
			System.out.print("  ");
		}
		int k=0;
		for(j=i;j>=2;j-=2){// Loop to get number of times
			k++;
		}
		for(j=i;j>=2;j-=2){// Loop for printing * after space left side
			System.out.print((i-k)+" ");
			k--;
		}
			System.out.print(i+" ");
		k=1;
		for(j=i;j>=2;j-=2){// Loop for printing * after space right side
			System.out.print((i-k)+" ");
			k++;
		}
	        System.out.println(); //Direct Print New Line after *`s
	    }
	}
}





















//@Author: Junaid Aslam(Jonny)
//@Roll Number: 20SW084
