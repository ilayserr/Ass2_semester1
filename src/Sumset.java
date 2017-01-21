/*
Assignment number : 2.3
File Name : Sumset.java
Name : Ilay Serr
Email : ilay92@gmail.com
 */

/* 
 * this program find's a valid sumset and prints it. 
*/

public class Sumset { 

	public static void main(String [] args) {
		
		// checking if the input is illegal
		if (args.length == 0) {
			System.out.println("illegal input");
		} else {
			int N = Integer.parseInt(args[0]);
			int m = Integer.parseInt(args[1]);
			int[] a = new int[N];
			boolean f = false;
			System.out.print("data: ");

			// inserting random values to the array
			for (int i = 0; i < N; i++) {
				a[i] = 1 + (int)(Math.random() * m);
				System.out.print(a[i] + " ");
			}
			System.out.println();

			// runs on all the numbers 3 times (until we found a match)
			// and check the condition	
			for (int j = 0; (j < N) && (f == false); j++) {
				for (int l = 0; (l < N) && (f == false); l++) {
					for (int p = 0; p < N ; p++) {

						// checking if there is 3 numbers that are "sumset".
						// and prints them if there are.
						if ((a[j] + a[l]) == a[p]) {
							System.out.println(a[j] + " + " + a[l] + " = " + a[p]);

							// changing the bollean f to true and getting out of all loops.
							f = true;
							break;
						}
					}
				}
			}
		
			// printing  the answer if there isnt a "sumset"
			if (f == false) System.out.println("no sums were found.");
		}		
	}
}