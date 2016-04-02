
package projecteuler;

/* What is the smallest positive number that is evenly divisible by all of the
numbers from 1 to 20? */

import java.util.ArrayList;

public class Primes {
     
    public static void main(String[] args) {
        int LIMIT = 100; //set what factor we want to check up to.
        ArrayList primeList = new ArrayList();
        primeList.add(2);
        //System.out.println("Originial list: " + primeList);
        for (int i = 3; i <= LIMIT; i+= 2){
            //System.out.println("Checking if number " + i + " is prime.");
            for (int j =  0; j <= primeList.size()-1; j++){
                //System.out.println("j = " + j);
                int primeNumber = (int) primeList.get(j);
                //System.out.println("divider = " + primeNumber);
                if (i % primeNumber == 0){
                    //System.out.println("Prime number "+ primeNumber + " divided " + i);
                    break;
                }
                else if (primeNumber > Math.floor(Math.sqrt(i)) && i % primeNumber != 0){
                    System.out.println("i (" + i + ") is prime");
                    primeList.add(i);
                    //System.out.println("Final list: " + primeList);
                    break;
                }
            }
        }
        System.out.println("Final list: " + primeList);
    }
}
