package Arraylist;

import java.util.ArrayList;

public class PrintPosition {

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
		//al.addAll(a2);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(i+" "+al.get(i));
		}
				

	}

}
