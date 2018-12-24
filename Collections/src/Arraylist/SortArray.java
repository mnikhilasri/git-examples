package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<String>();
		al.add("red");
		al.add("green");
		al.add("white");
		ArrayList<Integer> a2= new ArrayList<Integer>();
		a2.add(1);
		a2.add(2);
		a2.add(3);
		a2.add(4);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);

	}

}
