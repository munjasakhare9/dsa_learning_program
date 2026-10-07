package com.demo.arraylist;

import java.util.ArrayList;

public class Program2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(5);
		al.add(9);
		al.add(3);
		al.add(6);

		System.out.println(al);
		int max=Integer.MIN_VALUE;
		for(int i=0;i<al.size();i++) {
			if(max<al.get(i)) {
				max=al.get(i);
			}
		}
		System.out.println(max);
	}
}
