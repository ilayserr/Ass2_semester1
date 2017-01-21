/*
Assignment number : 2.2
File Name : Sequence.java
Name : Ilay Serr
Email : ilay92@gmail.com
 */

/* 
 *  I made this program to calculate every arthmetic sequence 
 *  (it doesnt stop after 1 run)... for example: for args 1,2,3,4 there
 *  will be two arthmetic sequence 1,2,3 and 2,3,4 .
 */
public class Sequence { 

	public static void main(String [] args) {

		// checking if the input is illegal
		if (args.length == 0) {
			 System.out.println("illegal input");
		} else {

			// making a new array in the length of the arguments
			int[] a = new int[args.length];
			boolean f = false;

			// inserting args to the array
			for (int p = 0 ; p < a.length ; p++) {
				a[p] = Integer.parseInt(args[p]);
			}

			// checking if there is an arthmetic sequence and if there 
			// is - prints them and their locaton.
			for (int i = 0 ; i < a.length ; i++) {
				for (int j = 1 ; ((2 * j) + i) < a.length; j++) {
					if ((a[j + i] - a[i]) == ((a[(2 * j) + i]) - a[j + i])) {
						System.out.println ("The numbers " + a[i] + ", " + a[j + i] + ", " 
								+ a[(2 * j) + i] +  " located at indices " + i + ", " + (j + i) + ", " + 
								((2 * j) + i) + " form an arithmetic sequence.");

						// changing the value to true if the code found an arthmetic sequence
						f = true;
					}
				}
			}	

			// prints only if there is no arthmetic sequence
			if (f == false) System.out.println("There is no arithmetic sequence of length 3.");
		}	
	}
}
