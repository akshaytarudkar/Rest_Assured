package Pratices1;

public class pallindrome {

	public static void main(String[] args) {
		int num=1212121,rev=0,rem,temp=num;
		 while(num>0)
		 {
		 rem=num%10;
		 num=num/10;
		 rev=(rev*10)+rem;
		 }
		 System.out.println("Reverse of num is : "+rev);
		 if(temp==rev)
		 {
		System.out.println("your number is Pallindrome number");
		}
		else
		{
		System.out.println("your number is not Pallindrome number");
		} 
		 }
	}


