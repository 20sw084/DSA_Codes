//@Author: Junaid Aslam(Jonny)
//@Roll Number: 20SW084

/**************************************************
Permission to use, copy, modify, and distribute 
this software and its documentation for educational, 
research, and not-for-profit purposes
**************************************************/

public class Triangle_Stars {
	public static void main(String[] args) {
		int row=5;
		int i=0,j=0;
		for(i=0;i<row;i++) {
			for(j=row-i;j>1;j--) {// Loop for printing space before triangle *
					System.out.print("  ");
			}
			for(j=0;j<i;j++) {// Loop for printing * after space on left side
				System.out.print("* ");
			}
				System.out.print("* ");
			for(j=0;j<i;j++) {// Loop for printing * after space on right side
				System.out.print("* ");
			}
			System.out.println(); //Direct Print New Line after *`s 
		}
	}

}  






















//@Author: Junaid Aslam(Jonny)
//@Roll Number: 20SW084
