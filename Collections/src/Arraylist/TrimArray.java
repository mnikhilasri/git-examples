package Arraylist;

import java.util.ArrayList;

public class TrimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<String>();
		//al.add(" ");
		al.add("red");
		al.add("green");
		al.add("white");
		//al.add(" ");
		al.add("yellow");
		al.add("blue ");
		al.add("pink ");
		al.add("green ");
		al.add(" ");
		System.out.println(al);
		al.trimToSize();
		System.out.println(al);

	}

}
