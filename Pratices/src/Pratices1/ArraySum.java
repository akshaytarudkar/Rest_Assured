package Pratices1;

public class ArraySum {

	public static void main(String[] args) {
		
		float [] a = { 20.2f,55.3f,69.5f,54.7f,62.3f };
		float sum=0;
		for(float element:a)	
		{
			sum = sum + element;
		}
		System.out.println(sum);
	}

}
