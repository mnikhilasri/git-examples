/*Write a Java program to append the specified element to the end of a linked list. Go to the editor
Click me to see the solution */
package LinkedList;

import java.util.LinkedList;

public class AppendAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("red");
		ll.add("green");
		ll.add("white");
		ll.add("yellow");
		System.out.println(ll);
		ll.addLast("green");
		System.out.println(ll);
		System.out.println("element added at end of the linked list is : "+ ll.getLast());
		
		
	}

}
