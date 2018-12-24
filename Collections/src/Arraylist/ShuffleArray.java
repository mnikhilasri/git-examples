package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArray {

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
		Collections.shuffle(al);
		System.out.println(al);

	}

}
