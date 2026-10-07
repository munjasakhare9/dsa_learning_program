package com.demo.arraylist;

import java.util.ArrayList;

public class Program1 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		/*
		System.out.println(al.get(2));
		al.add(2,500);
		al.remove(2);
		al.set(2, 7000);
		//al.clear();
		System.out.println(al.size());
		System.out.println(al);
		*/
		System.out.println(al.size());
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
			
	}
}
