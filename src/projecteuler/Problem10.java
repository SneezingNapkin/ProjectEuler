
package projecteuler;

/*
Find the sum of all the primes below two million.
*/

public class Problem10 {
    /*
    I used the "Primes" method to solve this problem making the code very
    short for this class.
    */
     public static void main(String[] args) {
        Primes arrayOfPrimes = new Primes();
        arrayOfPrimes.LIMIT = 2000000; // setting the limit
        
        // Calling the method to solve for the limit that was set:
        arrayOfPrimes.Solve();
        
        // calling the sum of primes that were just generated:
        System.out.println("2nd method: The sum of the prime numbers is: "+ arrayOfPrimes.sum);
    }
}
