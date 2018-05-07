// converts a decimal number to a binary number

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println(toBinary(359));
	}
	
	// input: decimal number
	// output: binary number 
	public static int toBinary(int n) {
		// i is the index of each binary # element
		// 10 to the power of i 
		int i = 0; 
		// b is the binary number
		int b = 0; 
		while (n > 0) {
			// add each modulo to its respective index 
			b += (int) (n%2 * Math.pow(10, i));
			// continue dividing n by 2 
			n = n/2;
			// update i for each iteration 
			i++; 
		}
		return b; 
	}
}

