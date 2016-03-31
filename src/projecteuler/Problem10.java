
package projecteuler;

/*
Find the sum of all the primes below two million.
*/

import java.util.*;

public class Problem10 {
    
     public static void main(String[] args) {
        int NUMBER = 2000000; //set what number we want to look for primes until.
        long sumOfPrimeNumbers = 5L; // 2 and 3 already included.
        long count = 1L;

        while (count < NUMBER){
            for (int i = 2; i <= Math.sqrt(count); i++){
                //System.out.println("i = " + i);
                if (count % i == 0){
                    //System.out.println("i divided the number:" + i + " divided " + count);
                    break;
                }
                else if (i == Math.floor(Math.sqrt(count)) && count % i != 0){
                    //System.out.println("Number [" + count + "] is prime");
                    sumOfPrimeNumbers += count;
                }
            }
            count += 2;
        }
        
        System.out.println("The sum of the prime numbers is: "+ sumOfPrimeNumbers);
    }
}
