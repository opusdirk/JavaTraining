package basics;

public class SumAllNumbers {
	public static void main(String[] args) {
		System.out.println( SumAllNums(9) );
	}
	
	public static int SumAllNums( int n ) {
		if( n == 1) {
			return n;
		}
		return ( n + SumAllNums( n -1));
	}
}
