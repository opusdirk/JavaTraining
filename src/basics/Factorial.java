package basics;

public class Factorial {

	public static void main(String[] args) {
		System.out.println( Factorial(5) );

	}
	
	public static int Factorial( int n ) {
		if( n == 1 ) {
			return n;
		}
		return ( n * Factorial(n-1));
	}

}
