import java.util.Scanner;

public class Problem4_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		
		String letter = input.next();
		char let = Character.toLowerCase(letter.charAt(0));
		 if (!Character.isLetter(let))
	            System.out.println(letter + " is invalid input.");
	        else
	        {
	            switch(let)
	            {
	                case 'a': case 'e': case 'i': case 'o': case 'u':
	                    System.out.println(letter + " is a vowel");
	                    break;
	                default:
	                    System.out.println(letter + " is a consonant");
	            }    
	        }
		

	}

}
