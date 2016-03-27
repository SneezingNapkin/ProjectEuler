
package projecteuler;

// What is the 10 001st prime number?

import java.util.ArrayList;

public class Problem7 {
    
    public static void main(String[] args) {
        int PRIME = 10001;
        int i = 4; // this variable will be the number we start our loop at.
        ArrayList primeList = new ArrayList();
        primeList.add(2);
        primeList.add(3);
        // Already added 2 and 3 to make the while loop easier.
        while (primeList.size() < PRIME ){
            i++;
            for (int j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0){
                    break;
                }
                else if (j == Math.floor(Math.sqrt(i)) && i % j != 0){
                    primeList.add(i);
                }
            }
        }
        System.out.println("Final list: " + primeList);
        System.out.println("Prime number in place " + PRIME + " is: " + primeList.get(PRIME - 1));
    }
}
