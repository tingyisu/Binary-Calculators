// adds two binary numbers

public class BinaryAddition {

	public static void main(String[] args) {
		// must take integers as input 
		System.out.println(binaryAddition("11110", "10011"));
		/* int n = 110001;
		String nString = "" + n;
		// weird...
		System.out.println(nString); */ 
	}
	
	// input: 2 binary numbers
	// output: a binary number that represents the sum of the two input binary numbers 
	public static int binaryAddition(String n, String m) {
		// using my own code
		// using object oriented programming
		// must convert inputs into Strings b/c method takes a String as input
		int nDecimal = BinaryToDecimal.toDecimal(n); 
		int mDecimal = BinaryToDecimal.toDecimal(m);
		int sum = nDecimal + mDecimal;
		int binaryNumber = DecimalToBinary.toBinary(sum);
		return binaryNumber; 
	}
}
