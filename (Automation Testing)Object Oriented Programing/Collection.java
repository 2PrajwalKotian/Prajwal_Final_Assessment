package oopsprograming;

import java.util.LinkedList;

public class Collection {
	public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Pranesh");
        ll.add("Karthik");
        ll.addLast("Mandeep");
        ll.addFirst("Rajesh");
        ll.add(2, "Harshith");
         
        System.out.println(ll);
 
        ll.remove("Karthik");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
 
        System.out.println(ll);
    }
}
