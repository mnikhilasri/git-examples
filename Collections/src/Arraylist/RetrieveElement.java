package Arraylist;

import java.util.ArrayList;

public class RetrieveElement {

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
		System.out.println(al.get(4));
	}

}