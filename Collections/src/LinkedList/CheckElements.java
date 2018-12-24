/* 
22. Write a Java program to check if a particular element exists in a linked list. Go to the editor
Click me to see the solution
*/
package LinkedList;

import java.util.LinkedList;

public class CheckElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("red");
		ll.add("green");
		ll.add("white");
		ll.add("yellow");
		ll.add("green");
		System.out.println(ll);
		String n= "red";
		//LinkedList<String> l1= new LinkedList<String>();
		//for(String s : ll)
		//{			 
		System.out.print(ll.contains(n)?"true":"false");
		
		
		

	}

}
