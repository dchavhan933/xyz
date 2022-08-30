package sona;

import java.util.Arrays;

public class sorting {
	

	public static void main(String[] args) {
		
		char [] a = {'a','c','b','d','g','f','e'};
		
		Arrays.sort(a);
		for(int i =a.length-1;i>=0;i--)
			System.out.println(a[i]);
	}
}
