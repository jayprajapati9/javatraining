package javatraining;

import java.util.Scanner;

public class secondprogram {

	    public static void main(String[] args) 
	    {
	        int a, b,c;
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter two numbers:");
	        a = s.nextInt();
	        b = s.nextInt();
	        c = (a>b)?a:b;
	        System.out.println("Largest Number:"+c);
	    }
}
