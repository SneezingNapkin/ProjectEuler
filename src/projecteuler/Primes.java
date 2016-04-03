
package projecteuler;

import java.util.ArrayList;

public class Primes extends ArrayList {
    int LIMIT; // This needs to be set outside the "public ArrayList Solve()" so that it could be set in other classes.
    long sum = 2; // This needs to be set outside so that I could call it when needed in other classes.
    
    public ArrayList Solve() {

        ArrayList primeList = new ArrayList();
        primeList.add(2);
        //System.out.println("Originial list: " + primeList);
        for (int i = 3; i <= LIMIT; i+= 2){
            //System.out.println("Checking if number " + i + " is prime.");
            for (int j = 0; j <= primeList.size()-1; j++){
                //System.out.println("j = " + j);
                long primeNumber = (int) primeList.get(j);
                //System.out.println("divider = " + primeNumber);
                if (i % primeNumber == 0){
                    //System.out.println("Prime number "+ primeNumber + " divided " + i);
                    break;
                }
                else if (primeNumber > Math.floor(Math.sqrt(i)) && i % primeNumber != 0){
                    //System.out.println("i (" + i + ") is prime");
                    primeList.add(i);
                    sum += i;
                    //System.out.println("Sum: " + sum);
                    //System.out.println("Final list: " + primeList);
                    break;
                }
            }
        }
        //System.out.println("Final list: " + primeList);
        return primeList; 
        /* The method returns the primeList rather than anything else so that 
        it could be used in other classes for problems I have not anticipated yet. */
    }
}
