package Arraylist;

import java.util.ArrayList;

public class CompareArray {

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
		ArrayList<String> a= (ArrayList<String>)al.clone();
		a.add("black");
		a.add("violet");
		a.add("maroon");
		ArrayList<String> a1= new ArrayList<String>();
		for(String s : a)
			a1.add(al.contains(s)?"True":"falsse");
			System.out.println(a1);
		

	}

}
