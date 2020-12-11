package com.xworkz.pattern.star;

public class Triangle {

	public static void main(String[] args) {
		int n=6;
		int mid=n/2;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i+j==mid||j-i==mid||i==mid)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
