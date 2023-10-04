package Pratices1;

public class MaxInArray {

	public static void main (String arg[]) {
	
	int[] arr = {1, 21, 3, 45, 5, 34, 67, 88};
	int max = Integer.MIN_VALUE ;
	for (int e : arr) {
	    if (e > max) {
	        max = e; 
	    }
	}   
	   System.out.println("The value of the maximum element in this array is: " + max);
	}

}
