package Pratices1;


	import java.util.Scanner;

	public class ReadMultipleValues {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your name and age: ");
	        String name = scanner.next();
	        int age = scanner.nextInt();
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        scanner.close();
	    }
	}


