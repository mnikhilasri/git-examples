package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.Exception;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<String>();
		
		al.add("red");
		al.add("green");
		al.add("white");
		al.add("yellow");
		al.add("blue");
		al.add("pink");
		al.add("green");
		ArrayList<String> a= (ArrayList<String>)al.clone();
		a.add("black");
		a.add("violet");
		a.add("maroon");
		System.out.println("Before copying");
		System.out.println("Al: "+al);
		System.out.println("A: "+a);
		try
		{
			Collections.copy(al, a);
			System.out.println("After copying");
			System.out.println("Al: "+al);
			System.out.println("A: "+a);

			
		}
		catch(Exception e)
		{
			System.out.println("Execption found: "+e);
		}
		/*"the code will given index not of bound exception
		 *  because size of array 1 and array 2 is different"
		 */
        ArrayList<String> a1= new ArrayList<String>();
		
		al.add("red");
		al.add("green");
		al.add("white");
		al.add("yellow");
		al.add("blue");
		al.add("pink");
		al.add("green");
		ArrayList<String> a2= new ArrayList<String>();
		a2.add("  1  ");
		a2.add("  2  ");
		a2.add("  3  ");
		a2.add("  4  ");
		a2.add("  5  ");
		a2.add("  6  ");
		a2.add("  7  ");
		//After Copying(it is clone function)
		Collections.copy(a2, a1);
		System.out.println("After copying");
		System.out.println("A1: "+a1);
		System.out.println("A2: "+a2);
		///another program
		List<String> List1 = new ArrayList<String>();
		  List1.add("1");
		  List1.add("2");
		  List1.add("3");
		  List1.add("4");
		  System.out.println("List1: " + List1);
		  List<String> List2 = new ArrayList<String>();
		  List2.add("A");
		  List2.add("B");
		  List2.add("C");
		  List2.add("D");
		  System.out.println("List2: " + List2);
		  // Copy List2 to List1
		  Collections.copy(List1, List2);
		  System.out.println("Copy List to List2,\nAfter copy:");
		  System.out.println("List1: " + List1);
		  System.out.println("List2: " + List2);				
		
		

	}

}
