package Arraylist;

import java.util.ArrayList;

public class CloneArray {

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
		ArrayList<String> a= (ArrayList)al.clone();
		System.out.println(a);
	}

}
