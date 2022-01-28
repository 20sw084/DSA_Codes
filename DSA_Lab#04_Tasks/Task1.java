/*
	Task 1: Write and test the following methods:
	1. int search(int x) //returns the index of element in the linked list
	2. int size() //returns the size of the linked list
	3. int sum() //returns the sum of all numbers in the linked list
	4. void deleteLast() //deletes the last node in the list
	5. LinkedList copy() //returns a new linked list that is the duplicate of the list this method is called up on.
	6. LinkedList subList(int p, int q) //returns a new linked list that contains element from node p to node q of the list this method is called up on.
	7. void append(LinkedList l) //l is appended to the list this method is called on.
	8. LinkedList merged(Linked l) // returns a new list that merges l with the list the method is called on; maintaining the ascending order.
	*/

/*
 * @Author: Jonny
 */

public class Task1 {
	int data;
	Task1 next;
	public Task1() {
	}
	public Task1(int data) {
		this.data=data;
	}
	public Task1(int data, Task1 next) { 
	this.data=data;
	this.next=next;
	}
	public static Task1 insert(Task1 node,int elem) {
	if(node==null||node.data>elem) {
		node=new Task1(elem,node);
		return node;
	}
	Task1 t=null;
	for(t=node;t.next!=null;t=t.next) {
		if(t.next.data>elem) {
			break;
		}
	}
	t.next=new Task1(elem,t.next);
	return node;
}

public static Task1 delete(int elem,Task1 start) {
	if(start==null||start.data>elem) {
		return start;
	}
	
	Task1 i=null;
	for( i=start.next;i!=null;i=i.next) {
		if(i.data==elem) {
			break;
		}
	}
	
	i=new Task1(elem,i.next);
	
	return start;
}

//1. int search(int x) //returns the index of element in the linked list

	public static int search(Task1 node,int x) {
		int count=0;
		int index=0;
		for(Task1 i=node;i!=null;i=i.next) {
			count++;
			if(i.data==x) {
				index=count;
				break;
			}
		}
		return index;
	}

	//2. int size() //returns the size of the linked list

	public static int length(Task1 node) {
		int size=0;
		for(Task1 i=node;i!=null;i=i.next) {
			size++;
		}
		return size;
	}

	//3. int sum() //returns the sum of all numbers in the linked list

	public static int sumAll(Task1 node) {		
		int sum=0;
		for(Task1 i=node;i!=null;i=i.next) {
			sum+=i.data;
		}
		return sum;
	}

	//4. void deleteLast() //deletes the last node in the list

	public static Task1 deleteLastNode(Task1 node) {
		Task1 n=node;
		while(n.next.next!=null) {
			n=n.next;
		}
		n.next=null;
		return node;
	}
	
	//5. LinkedList copy() //returns a new linked list that is the duplicate of the list this method is called up on.

	public static Task1 copy (Task1 n) {
		Task1 copied=new Task1(n.data);
		Task1 temp=copied;
		for(Task1 i=n.next;i!=null;i=i.next) {
			temp.next=new Task1(i.data);
			temp=temp.next;
		}
		return copied;
	}

	//6. LinkedList subList(int p, int q) //returns a new linked list that contains element from node p to node q of the list this method is called up on.
	
	public static Task1 subList(Task1 node,int p,int q)
	{
		Task1 sub=null;
		if(p<node.data || node==null) {
			return sub;
		}
		for(Task1 i=node;i!=null;i=i.next) {
			if(p==i.data) {
				sub=i;
			}
		}
		Task1 i=null;
		for(i=sub;i!=null;i=i.next) {
			if(q<=i.data) {
				i.next=null;
				break;
			}
		}
		return sub;
	}
	
	//7. void append(LinkedList l) //l is appended to the list this method is called on.

	public static Task1 appendAtLast(Task1 n,int data) {
		Task1 copy=n;
		if(n==null) {
			n=new Task1(data);
			return n;
		}
		if(n.next==null) {
			n.next=new Task1(data);
			return n;
		}
		while(copy.next!=null) {
			
			copy=copy.next;
		}
		copy.next=new Task1(data);
		return n;
	}
	
	
	public static Task1 append(Task1 Task1,Task1 node2) {
		Task1 copy=Task1;
		if(Task1==null) {
			return node2;
		}
		if(node2==null) {
			return Task1;
		}
		while(Task1.next!=null) {
			
			Task1=Task1.next;
		}
		while(node2!=null) {
			Task1.next=new Task1(node2.data);
			Task1=Task1.next;
			node2=node2.next;
		}		
		return copy;
	}
	
//8. LinkedList merged(Linked l) // returns a new list that merges l with the list the method is called on; maintaining the ascending order.
	
	public static Task1 merge(Task1 Task1,Task1 node2) {
		Task1 merged=new Task1(0);
		Task1 mergedCopy=merged;
		while(Task1!=null  &&  node2!=null) {
			if(Task1 == null)
	        {
	            mergedCopy.next = node2;
	            break;
	        }
	        if(node2 == null)
	        {
	        	mergedCopy.next = Task1;
	            break;
	        }
	        if(Task1.data <= node2.data)
	        {
	        	mergedCopy.next = Task1;
	            Task1 = Task1.next;
	        }
	        else
	        {
	        	mergedCopy.next = node2;
	            node2 = node2.next;
	        }
	        	
	        /* Advance the tail */
	        mergedCopy=mergedCopy.next;
		}
		return merged;
	}
	

	public static Task1 printFromSpecified(Task1 n,int data) {
		Task1 copy=n;
		for(Task1 i=n;i!=null;i=i.next) {
			if(i.data==data) {
				return i;
			}
		}
		return n;
	}
	
	public static Task1 insertAtSpecifiedPosition(int elem,Task1 n,int pos) {
		Task1 copy=n;
		int count=2;
		while(copy!=null) {
			if(count==pos) {
				break;
			}
			count++;
			copy=copy.next;
		}
		copy.next=new Task1(elem,copy.next);
		return n;
	}
	
	public static Task1 insertAtFirstAndLast(Task1 n,int start,int end) {
		Task1 res=new Task1(start);
		Task1 copy=res;
		while(n!=null) {
			res.next=n;
			res=res.next;
			n=n.next;
		}
		res.next=new Task1(end);
		return copy;
	}
	
	public static void main(String args[]) {
		Task1 t=new Task1(1);
		Task1 copy=t;
		t.next=new Task1(2);
		t=t.next;
		t.next=new Task1(5);
		t=t.next;
		t.next=new Task1(8);
		t=t.next;
		t.next=new Task1(10);
		
//		Task1 insertAtFirstAndLast=insertAtFirstAndLast(copy,0,13);
//		for(Task1 i=insertAtFirstAndLast;i!=null;i=i.next) {
//			System.out.println(i.data);
//		}
//		
//		Task1 insertAtSpecifiedPosition=insertAtSpecifiedPosition(4,copy,3);
//		
//		for(Task1 i=insertAtSpecifiedPosition;i!=null;i=i.next) {
//			System.out.println(i.data);
//		}
		
//		Task1 inserted=insert(copy,4);
//		
//		for(Task1 i=inserted;i!=null;i=i.next) {
//			System.out.println(i.data);
//		}
		
//		int res=search(copy,8);
//		System.out.println(res);
		
//		int res=length(copy);
//		System.out.println(res);
		
//		int res=sumAll(copy);
//		System.out.println(res);
		
//Task1 deleted=delete(3,copy);
//		
//		for(Task1 i=deleted;i!=null;i=i.start) {
//			System.out.println(i.data);
//		}
		
//		Task1 lastNodeDeleted=deleteLastNode(copy);
//		
//		for(Task1 i=lastNodeDeleted;i!=null;i=i.next) {
//			System.out.println(i.data);
//		}

//		Task1 copiedNode=copy(copy);
//		
//		for(Task1 i=copiedNode;i!=null;i=i.next) {
//			System.out.println(i.data);
		
//		Task1 subList=subList(copy,2,6);
//		
//		for(Task1 i=subList;i!=null;i=i.next) {
//			System.out.println(i.data);
//		}
		
//		Task1 t2=new Task1(3);
//		Task1 copy1=t2;
//		t2.next=new Task1(4);
//		t2=t2.next;
//		t2.next=new Task1(6);
//		t2=t2.next;
//		t2.next=new Task1(7);
//		t2=t2.next;
//		t2.next=new Task1(9);
//		Task1 append=append(copy,copy1);
//		for(Task1 i=append;i!=null;i=i.next) {
//			System.out.println(i.data);
//		}
		
//		Task1 appendAtLast=appendAtLast(copy,30);
//		for(Task1 i=appendAtLast;i!=null;i=i.next) {
//			System.out.println(i.data);
//		}
		
//		Task1 printFromSpecified=printFromSpecified(copy,1);
//		for(Task1 i=printFromSpecified;i!=null;i=i.next) {
//			System.out.println(i.data);
//		}
		
		Task1 t2=new Task1(3);
		Task1 copy1=t2;
		t2.next=new Task1(4);
		t2=t2.next;
		t2.next=new Task1(6);
		t2=t2.next;
		t2.next=new Task1(7);
		t2=t2.next;
		t2.next=new Task1(9);
		
		Task1 merged=merge(copy,copy1);
		for(Task1 i=merged;i!=null;i=i.next) {
			System.out.println(i.data);
		}
		
	}
}