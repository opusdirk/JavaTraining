package basics;

public class NumbersCalc {
	
	public static void main(String[] args) {
		int numA = 10;
		int numB = 20;
		int product = MultiplyNumbers( numA, numB);
		System.out.println("The product of " + numA + " and " + numB + " is " + product);
	}


	static int MultiplyNumbers(int numA2, int numB2) {
		return numA2 * numB2;
	}
}