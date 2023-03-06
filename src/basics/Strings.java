package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		bookTitle = "The Torah";
		String wordChoice = "Torah";
		
		if( bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);
		}
		
		String firstName = "Dirk";
		String lastName = "Myers";
		String SSN = "123456789";
		
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,1));
		System.out.println(SSN.substring(5));

	}

}
