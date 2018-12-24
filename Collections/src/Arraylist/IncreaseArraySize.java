package Arraylist;

import java.util.ArrayList;

public class IncreaseArraySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<String>();
		//al.add("red");
		//al.add("green");
		//al.add("white");
		al.ensureCapacity(8);
		//System.out.println(al.size());
		al.add("yellow");
		al.add("blue");
		al.add("pink");
		al.add("green");
		al.add("violet");
		al.add("maroon");
		//al.ensureCapacity(10);
		System.out.println(al);

	}

}
