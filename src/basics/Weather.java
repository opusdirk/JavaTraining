package basics;

public class Weather {
	public static void main(String[] args) {
		int temperature = 50;
		String sunCondition = "Sunny";
		
		if( temperature > 80 ) {
			System.out.println("It is hot");
		} 
		else if((temperature > 60) && (sunCondition == "Sunny")){
			System.out.println("It is pretty nice");
		}
		else {
			System.out.println("It is a little cool");
		}
	}
}
