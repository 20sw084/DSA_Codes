/*
Task 3: Explore java.util.LinkedList class; Create a linked list of type String using this class and apply any 5 of its methods.
	*/

import java.util.LinkedList;
public class Task3 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        list.add("Ahsan");
        list.add("Ahmed");
        list.add("Ali");
        list.add("Aslam");
        list.add("Ashfaque");

        System.out.println(list.peek());

        list.push("Jonny" );

        list.pop();

        System.out.println(list.getFirst());
    }
}
