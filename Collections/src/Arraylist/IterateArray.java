package Arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class IterateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<String>();
		al.add("hello");
		al.add("this");
		al.add("a");
		al.add("java");
		al.add("collections");
		al.add("ArrayList");
		al.add("programs");
		ListIterator<String> i = al.listIterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}

	}

}
