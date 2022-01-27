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