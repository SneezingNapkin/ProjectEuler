
package projecteuler;

/* What is the smallest positive number that is evenly divisible by all of the
numbers from 1 to 20? */

public class Problem5 {
    /* They have already told us that 2520 is the smallest number that can be
    divided by each of the numbers from 1 to 10 without any remainder.
    Knowing this means we can start at least at 2520 because there is no point
    checking this again.
    I also know that the smallest number needs to be divisible by all the 
    prime numbers in the range 1 to 20. So it has to be at least:
    2 x 3 x 5 x 7 x 11 x 13 x 17 x 19
    So we want to start at this number and check whether all the numbers
    in the range 11 to 20 divide it without a remainder.
    We want to increase our number by 20 each time we check.
    */
    
    public static void main(String[] args) {
        int[] primeArray = {2,3,5,7,11,13,17,19};
        int primeStart = 2 * 3 * 5 * 7 * 11 * 13 * 17 * 19;
        int potentialValue = primeStart;
        
        boolean number = false;
        boolean finished = false;
        int y = 20;
        
        while (!finished){
            System.out.println("hello");
            for (int i = 2; i <= 20; i++){
                System.out.println(i);
                if (potentialValue % i == 0){
                    number = true;
                }
                else{
                    System.out.println("test");
                    finished = true;
                }
            }
            potentialValue += 2;
            System.out.println(potentialValue);
        }
    }
}
