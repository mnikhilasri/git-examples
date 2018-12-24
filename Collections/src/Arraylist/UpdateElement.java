package Arraylist;

import java.util.ArrayList;

public class UpdateElement {
	public static void main(String args[])
	{
		ArrayList<String> al= new ArrayList<String>();
		al.add("red");
		al.add("green");
		al.add("white");
		al.add("yellow");
		al.add("blue");
		al.add("pink");
		al.add("green");
		al.retainAll(al);
		System.out.println(al);
		al.set(2, "element");
		System.out.println(al);
	}

}
