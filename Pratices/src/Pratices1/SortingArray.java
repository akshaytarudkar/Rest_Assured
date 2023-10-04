package Pratices1;

public class SortingArray {

	public static void main(String[] args) {
	    boolean isSorted=true;
		int [] a= {1,2,3,4} ; 
		for( int i = 0; i<a.length-1; i++) {
			if(a[i]>a[i+1]) 
			{
				isSorted=false;
				break;
			}}
			if(isSorted) {
			System.out.println("is sorted");
			}else
			{
				System.out.println("is not sorted");
			}
	}

}
