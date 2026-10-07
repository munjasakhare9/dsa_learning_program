package com.demo.arraylist;

import java.util.ArrayList;

public class Program3 {
	public static void swap(ArrayList<Integer> al, int idx1, int idx2) {
		int temp=al.get(idx1);
		al.set(idx1, al.get(idx2));
		al.set(idx2, temp);
	}
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(5);
		al.add(9);
		al.add(3);
		al.add(6);
		int idx1=1, idx2=3;
		System.out.println(al);
		swap(al, idx1, idx2);
		System.out.println(al);
	}
}
