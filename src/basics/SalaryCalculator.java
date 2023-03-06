package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		String career;
		System.out.println("Program is starting");
		
		career = "Senior Software Engineer";
		System.out.println("My Career: " + career );
		
		int hoursPerWeek = 40;
		int weeksPerYear = 52;
		double rate = 76.9231;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		
		System.out.println("My salary as a " + career + " at the rate of $" + rate + "/hour is $" + salary + "/year");
	}
}
