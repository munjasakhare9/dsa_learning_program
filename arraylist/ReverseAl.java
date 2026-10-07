package com.demo.arraylist;

import java.util.ArrayList;

public class ReverseAl {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		System.out.println(al);
		
		//Reverse
		
		for(int i=al.size()-1;i>=0;i--) {
			System.out.print(al.get(i)+" ");
		}
	}
}
