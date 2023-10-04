package Pratices1;

public class FindValueInArray {

	public static void main(String[] args) {
		int [] a = { 20,56,85,96,47 };
		int num=85;
		boolean found= false;
		for(int i=0; i<a.length; i++) {
			if (a[i]==num) {
				 found = true;
			}
		}
		if (found)
		{
			System.out.println (" Number is present" );
	} else
	{
		System.out.println (" Number is not present" );
}
}}