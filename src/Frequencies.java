/*
Assignment number : 2.4
File Name : Frequencies.java
Name : Ilay Serr
Email : ilay92@gmail.com
*/
/*
 * takes a string command­line argument text, counts the appearances of each 
 * letter from the English alphabet and stores them inside an array.
 *  Then use the array to print out a text histogram of the results.
 */

public class Frequencies {
		public static void main(String[] args) {
		
		// prints if input is illegal
		if (args.length == 0) {
			System.out.println("illegal input");
		} else {

			// changing all letters in text to lower case
			String text = args[0].toLowerCase();
			String[] a = new String[26];
			
			// making all the tabs in the array equal to " "  
			for (int i = 0; i < 26; i++) {
				a[i] = "";
			}

			// checking if the text are lower letters and insert * accordingly.
			for (int i = 0 ; i < text.length() ; i++) {
				if ((text.charAt(i) < 123) && (text.charAt(i) > 96)) {
					a[((char)text.charAt(i)) - 'a'] += "*";	
				}
			}	

			// printing the output 
			for(int i = 0; i < a.length ; i++) {
				System.out.println ((char)('a' + i) + ": " + a[i]);
			}
		}
	}
}
