package com.xworkz.pattern.star;

public class LeftAngleTriangle {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==n||i==n||i+j==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();

	}

	}
}