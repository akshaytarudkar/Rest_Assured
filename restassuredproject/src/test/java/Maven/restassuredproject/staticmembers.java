package Maven.restassuredproject;
public class staticmembers {
	private static final String StaticMembers = null;

	// Static variable
	public static String name = "Selenium";
	
	// Non static variable
	public int version = 3;
	
	// Static method
	public static void printName()
	{
		System.out.println("Name is :"+name);
	}

	// Non static method
	public void printVersion()
	{
		System.out.println("Version is : "+version);
	}
	
	
	public static void main(String[] args) {
		
		// Can call static members with class name
		System.out.println(staticmembers.name);
		staticmembers.printName();
		
		// Can not call non static members with class name
		//System.out.println(StaticMembers.version);
		//StaticMembers.printVersion();
		
		// Creating an object of class. We can call members using object name
		staticmembers sm = new staticmembers();
		
		// Calling static member with object is not recommended
		System.out.println(sm.name);
		sm.printName();
		
		// Object name should be used to call non static members of class
		System.out.println(sm.version);
		sm.printVersion();
		
	}
}
