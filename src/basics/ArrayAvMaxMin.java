package basics;

public class ArrayAvMaxMin {

	public static void main(String[] args) {
		int[] theArrayOfNums = {1,2,3,4,5,6,7,8,9};
		
		System.out.println( ArrayAverage( theArrayOfNums) );
		
		System.out.println( ArrayMaximum( theArrayOfNums) );

		System.out.println( ArrayMinimum( theArrayOfNums) );

	}
	
	public static float ArrayAverage( int[] myArray ) {
		float theSum = 0;
		for(int i=0; i < myArray.length; i++) {
			theSum = theSum + myArray[i];
		}
		return( theSum / myArray.length );
	}
	
	public static int ArrayMaximum( int[] myArray ) {
		int theBiggest = 0;
		for(int i=0; i < myArray.length; i++) {
			if( myArray[i] > theBiggest) {
				theBiggest = myArray[i];
			}
		}
		return( theBiggest );
	}
	
	public static int ArrayMinimum( int[] myArray ) {
		int theSmallest = Integer.MAX_VALUE;
		for(int i=0; i < myArray.length; i++) {
			if( myArray[i] < theSmallest) {
				theSmallest = myArray[i];
			}
		}
		return( theSmallest );
	}
}
