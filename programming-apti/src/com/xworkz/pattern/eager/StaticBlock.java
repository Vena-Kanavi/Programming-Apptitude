package com.xworkz.pattern.eager;

public class StaticBlock {

	static int i; 
    int j;  
    static { 
        i = 10; 
        System.out.println("static block called "); 
    } 
    
    
    public static void main(String[] args) {
		System.out.println(StaticBlock.i);
	}
}
