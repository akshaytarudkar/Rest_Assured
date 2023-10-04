package Pratices1;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		int n, m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N number");
		 n=sc.nextInt();
		 System.out.println("Enter M number"); 
		 m=sc.nextInt();
		if(n<m)
		    {
	           System.out.println("Number N is lesser");
		    } else if (n==m)
		           { System.out.println("Number N is equal to M");
		           } 
		                     else 
		                          {
			                         System.out.println("N is greater");
		                           }
		                       }
		

}
