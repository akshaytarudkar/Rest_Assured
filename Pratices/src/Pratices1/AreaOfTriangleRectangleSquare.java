package Pratices1;

 class AreaOfTriangleRectangleSquare {

	public static float areaOfTri(int breadth,int height)
	   {
	   float area1 = 0.5f * breadth * height;
	   return area1;
	   } 
	
	public static float areaOfCircle(int radius)
	{
	float pie=3.141f;
	float area2 = pie * radius * radius;
	return area2;
	}
	
	public static int areaOfRect(int breadth,int length)
	{
	int area3 = length * breadth;
	return area3;
	}
	
	public static int areaOfSquare(int side)
	{
	int area4 = side * side;
	return area4;
	}
	
	
	public static void main(String args[])
	{
	 System.out.println("Areaof Triangle is : "+ areaOfTri(5,10));
	 System.out.println("Areaof Circlee is : "+areaOfCircle(5));
	 System.out.println("Areaof Rectangle is : "+areaOfRect(3,8));
	 System.out.println("Areaof Square is : "+areaOfSquare(4));
	}
	}
	
	

