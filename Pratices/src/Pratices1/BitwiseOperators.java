package Pratices1;


	public class BitwiseOperators {
	    public static void main(String[] args) {
	        int num1 = 5; // Binary: 0101
	        int num2 = 3; // Binary: 0011
	        int bitwiseAnd = num1 & num2; // Bitwise AND
	        int bitwiseOr = num1 | num2;   // Bitwise OR
	        int bitwiseXor = num1 ^ num2;  // Bitwise XOR
	        int bitwiseComplement = ~num1; // Bitwise NOT
	        System.out.println("Bitwise AND: " + bitwiseAnd);
	        System.out.println("Bitwise OR: " + bitwiseOr);
	        System.out.println("Bitwise XOR: " + bitwiseXor);
	        System.out.println("Bitwise Complement: " + bitwiseComplement);
	    }
	}


