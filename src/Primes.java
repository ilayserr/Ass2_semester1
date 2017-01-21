/*
Assignment number : 2.1
File Name : Primes.java
Name : Ilay Serr
Email : ilay92@gmail.com
 */

//the program prints all the prime numbers up to N (not include)

public class Primes { 

	public static void main(String [] args) {
		// checking if the input are illegal
		if (args.length == 0) {
			 System.out.println("illegal input");
		} else {
			int N = Integer.parseInt(args[0]);

			// making a array in N + 1 size for comfort acsses to the numbers.
			// for example  (args[1] = 1) 
			boolean[] isPrime = new boolean[N + 1];

			// setting the array to true from the number 2
			for (int i = 2; i <= N ; i++) {
				isPrime[i] = true;
			}
			System.out.println("the prime numbers up to " + N + " are: ");
			if (N <= 2) System.out.println("no prime numbers");

			// checking if the number is true and changing its multiplies to false
			for (int j = 2; j < N ; j++) {
				if (isPrime[j]) {
					System.out.println(j);
					for (int l = (j * 2); l <= N ; l = (l + j)) {
						isPrime[l] = false;
					}
				}
			}
		}	
	}
}
