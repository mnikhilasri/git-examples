package Arraylist;

import java.util.ArrayList;

public class JoinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<String>();
		al.add("red");
		al.add("green");
		al.add("white");
		al.add("yellow");
		ArrayList<String> a2= new ArrayList<String>();
		a2.add("blue");
		a2.add("pink");
		a2.add("green");
		al.addAll(a2);
		System.out.println(al);
		
	}

}
