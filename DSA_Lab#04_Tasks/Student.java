
	/*	Task 2: Implement a linked list for Student class. Student class should have roll_num and name as instance variables. The linked list should have the following operations:

◦ insert(Student s)

◦ delete(Student s)

◦ printList() // print the roll numbers and names of every student in the list

*/

/*
 * @Author: Jonny
 */

public class Student {
	String rollNumber;
	String name;
	Student next;
	public Student(String rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}
	public Student(String rollNumber, String name, Student next) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.next = next;
	}
	public static void printAll(Student std) {
		for(Student i=std;i!=null;i=i.next) {
			System.out.println("Student Roll Number is : "
								+i.rollNumber+
								"\nStudent Name is : "
								+i.name);
		}
	}
	public static Student insert(Student std,String rollNumber,String name) {
		if(std==null) {
			std=new Student(rollNumber,name);
			return std;
		}
		Student stdCopy=std;
		while(std.next!=null) {
			std=std.next;
		}
		std.next=new Student(rollNumber,name);
		return stdCopy;
	}
	public static Student delete(Student std,String rollNumber) {
		Student stdCopy=std;
		if(std==null) {
			return std;
		}
		if(std.next==null) {
			if(rollNumber==stdCopy.rollNumber) {
				return std=null;
			}
			return std;
		}		
		while(std.next!=null) {
			if(rollNumber==std.next.rollNumber) {
				break;
			}
			std=std.next;
		}
		if(std.next==null) {
			return stdCopy;
		}	
		else
		std.next=std.next.next;
		return stdCopy;
	}
	
	public static void main(String[] args) {
	 Student std=new Student("20SW001","Muhammad AMIR");
	 Student insertedStd=insert(std,"20SW002","ASIF Ali");
			 insertedStd=insert(std,"20SW003","SHADAB Khan");
			 insertedStd=insert(std,"20SW004","BABAR Azam");
			 insertedStd=insert(std,"20SW005","Haris RAUF");
			 insertedStd=insert(std,"20SW006","Muhammad RIZWAN");
			 insertedStd=insert(std,"20SW007","SHAHEEN Shah Afridi");
			 insertedStd=insert(std,"20SW008","Haris SOHAIL");
			 insertedStd=insert(std,"20SW009","Muhammad HAFEEZ");
			 insertedStd=insert(std,"20SW010","FAKHAR Zaman");
			 insertedStd=insert(std,"20SW011","Shoaib MALIK");
			 insertedStd=insert(std,"20SW012","Junaid Rajput");
			 		printAll(insertedStd);
	 Student deletedStd=delete(insertedStd,"20SW012");
	 				printAll(deletedStd);
	}
}