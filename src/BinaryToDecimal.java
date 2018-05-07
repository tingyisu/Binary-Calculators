// converts a binary number to a decimal number

public class BinaryToDecimal {

	public static void main(String[] args) {
		//System.out.println(toDecimal(1100011));
		System.out.println(toDecimal("110001"));
	}
	
	// input: binary number (String) 
	// output: decimal number
	public static int toDecimal(String n) {
		// make sure is a binary number first, o/w throw an exception
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) != '0' && n.charAt(i) != '1') {
				throw new IllegalArgumentException(); 
			}
		}
		// special case for binary numbers
		// in order to do modulo, need to get rid of any consecutive zeros on left
		// index to start storing the characters 
		int index = -1; 
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) == '0') {
				continue; 
			} else {
				index = i;
				break; 
			}
		}
		// newString to store edited binary number 
		// edited = w/o beginning zeros
		// so that can to mod 
		String newString = ""; 
		if (index == -1) {
			newString = n;
		} else {
			for (int i = index; i < n.length(); i++) {
				newString += n.charAt(i); 
			}
		}
		// newBinary is the edited binary number (int)
		int newBinary = Integer.parseInt(newString); 
		// i represents the power of 2
		int i = 0;
		// d is the decimal number 
		int d = 0; 
		while (newBinary > 0) {
			// update the binary number
			d += (int) (newBinary%10 * Math.pow(2, i));
			// update n
			newBinary = newBinary/10;
			// update i
			i++; 
		}
		return d; 
	}
}

