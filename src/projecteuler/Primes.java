
package projecteuler;

/* What is the smallest positive number that is evenly divisible by all of the
numbers from 1 to 20? */

import java.util.ArrayList;

public class Primes {
     
    public static void main(String[] args) {
        int NUMBER = 100; //set what factor we want to check up to.
        ArrayList primeList = new ArrayList();
        primeList.add(2);
        primeList.add(3);
        System.out.println("Originial list: " + primeList);
        for (int i = 4; i <= NUMBER; i++){
            System.out.println("for loop with i = " + i);
            for (int j = 2; j <= Math.sqrt(i); j++){
                System.out.println("j = " + j);
                if (i % j == 0){
                    System.out.println("j divided i:" + j + " divided " + i);
                    break;
                }
                else if (j == Math.floor(Math.sqrt(i)) && i % j != 0){
                    System.out.println("i[" + i + "] is prime");
                    primeList.add(i);
                }
            }
        }
        System.out.println("Final list: " + primeList);
    }
}
