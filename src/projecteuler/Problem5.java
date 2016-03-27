
package projecteuler;

/* What is the smallest positive number that is evenly divisible by all of the
numbers from 1 to 20? */

import java.util.ArrayList; // imported to be able to use ArrayList

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
    In theory, the only numbers we really should check against are:
    {20, 19, 18, 17, 16, 15, 14, 13, 12, 11} because all other numbers make up
    the ones in this set. If a number is divisible by these, it will be 
    divisible by the smaller ones as well. (What ever is divided by 15 is also
    divided by 3 and 5 so they do not have to be checked again).
    */
    
    public static void main(String[] args) {
        int NUMBER = 20; //set what factor we want to check up to. 
        //42 is the maximum because otherwise the numbers become too big and it goes into negatives.
        //Creating a list to hold all the prime numbers within our NUMBER limit:
        ArrayList primeList = new ArrayList(); 
        //ArrayList used because it is open ended (does not need a size to be given to it).
        primeList.add(2); // Added 2 to the list so that the for loop would be easier
        primeList.add(3); // Added 3 to the list so that the for loop would be easier
        //Finding all the prime numbers:
        for (int i = 4; i <= NUMBER; i++){
            for (int j = 2; j <= Math.sqrt(i); j++){
                // It only needs loop through dividers up to sqrt of i. 
                if (i % j == 0){
                    break; // break if there is a number that divides i.
                }
                else if (j == Math.floor(Math.sqrt(i))){
                    /* j is an int so I need to round the sqrt. Otherwise j
                    will never be equal to i. I want it to be rounded down. */
                    primeList.add(i);
                }
            }
        }
        System.out.println("Prime number list: " + primeList);
        
        long primeMultiplier = 1L; //creating the variable to multiply the primes into.
        // Made it "long" so that it could handle bigger numbers.
        /* The for loop is used to multiply all the primes in the ArrayList above.
        This will give us the number to start looping from when looking for all
        the dividers without remainders. */
        for (Object i : primeList) {
            primeMultiplier *= (int) i;
            /* The values in the list are seen as objects so you need to go 
            through the loop with an i that is an object too.
            You cannot multiply objects, so it needed to be converted to an
            integer before multiplying by the primeMultiplier. */
        }
        System.out.println("Starting number: " + primeMultiplier);

        // Created new variable to amend in the loop:
        long potentialValue = primeMultiplier; 
        int count = 0; //will be used to stop the loop.
        boolean finished = false; //when this will be set to true the loop will stop
        
        /* Creating the loop that will be checking if the numbers in our range
        will divide each number we loop over without remainders.
        It starts off having a True value (the loop will not work with a false
        value). !finished = not false = true.
        */
        while (!finished){
            System.out.println("new loop:");
            count = 0; //setting count back to 0 after every for loop is done.
            
            for (int i = NUMBER / 2 + 1; i <= NUMBER; i++){
                // Odd numbers seem to be rounding correctly automatically.
                System.out.println("i is " + i);
                if (potentialValue % i != 0){
                    break;
                    // If i does not divide without remainder, we break the for loop.
                }
                else{
                    System.out.println(i + " divides the value without a remainder");
                    count++;
                    // If i does divide without a remainder, we want to count if all i's do that.
                    System.out.println("count is " + count);
                    
                    /* If count shows that all numbers in range have been checked
                    and divide our value without remainder we stop the while loop
                    by changing finished to be true. */
                    if (count == NUMBER / 2){
                        System.out.println("i " + i);
                        System.out.println("value is " + potentialValue);
                        finished = true;
                    }
                }
            }
            System.out.println("loop ended on " + potentialValue);
            potentialValue += primeMultiplier;
        }
    }
}
