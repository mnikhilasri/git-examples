package Arraylist;

import java.util.ArrayList;

public class AddElements {

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
		System.out.print(al+" ");
		System.out.println();
		for(String s : al)
		{
			System.out.print(s+" ");
		}

	}

}
