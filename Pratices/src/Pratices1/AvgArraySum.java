package Pratices1;

public class AvgArraySum {

	public static void main(String[] args) {
		
		int [] a = { 20,55,69,54,62 };
		int sum=0;
		for(int element:a)	
		{
			sum = sum + element;
		}
		System.out.println(sum/a.length);
	}

}
	


