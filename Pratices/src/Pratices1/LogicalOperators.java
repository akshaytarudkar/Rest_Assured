package Pratices1;

public class LogicalOperators {
	   
	public static void main(String[] args) {
	       
		    boolean isJavaFun = true;
	        boolean isProgrammingHard = false;
	        boolean bothConditionsMet = isJavaFun && !isProgrammingHard;
	        boolean eitherConditionMet = isJavaFun || isProgrammingHard;
	        System.out.println("Both Conditions Met: " + bothConditionsMet);
	        System.out.println("Either Condition Met: " + eitherConditionMet);
	    }
	}


