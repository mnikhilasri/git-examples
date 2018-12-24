package Arraylist;

import java.util.ArrayList;

public class ExtractPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<String>();
		al.add("hello");
		al.add("this");
		al.add("is");
		al.add("a");
		al.add("java");
		al.add("collections");
		al.add("ArrayList");
		al.add("programs");
		//List<String> list = al.
        System.out.println(al.subList(0, 3));
	}

}
