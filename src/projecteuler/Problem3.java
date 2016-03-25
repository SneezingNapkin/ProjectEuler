package projecteuler;

/* What is the largest prime factor of the number 600851475143? */

public class Problem3 {
    
    public long Solve() {
        
        //Created the number as a variable:
        long x = 600851475143L;
        /* 'int' can only go up to 2,147,483,647 max. But our number is higher.
        There is a type of integer that lets you go higher - 'long'.
        Instead of 'int' you need to write 'long' when creating a variable.
        'L' is added at the end of the number to show that it is long. */
        
        /* The number is very large so going through it by adding 1 digit to the
        divider at a time would take the computer ages to do. 
        Instead I looked at what the lowest divider of 'x' is.
        Then I looked at what the lowest divider needs to be multiplied by in 
        order to get to 'x'. This will be the highest divider and, so, 
        potentially the highest prime divider.
        */
        
        /* 'outerloop:' is the name of the for loop. This will let me break the 
        loop completely from an inner loop by calling 'break outerloop'. */
        outerloop:
        //This loops through all the numbers starting from 1:
        for (long i = 1; i < x; i++){
            //System.out.println(i);
            
            //This checks each number to see whether it divides 'x' without a remainder:
            if (x % i == 0){
                System.out.println("Factor found: " + i);
                System.out.println("x / " + i + " = " + x / i);
                
                //This nested loop checks if the higher divider is prime:
                //(x / i) is the other divider. We do not need to look higher.
                for (long j = 2; j < (x / i); j++){
                    //System.out.println("Tried dividing by " + j);
                    
                    //We evaluate the higher divider: (x / i).
                    //If a number is found that divides it, it is not a prime.
                    if ((x / i) % j == 0 ){
                        System.out.println("Can be divided by " + j + ". Not a prime number.");
                        break; //we can break as soon as a number is found.
                    }
                    
                    // (x / i) will of course be a divider of (x / i).
                    // so we want to stop the loop before it gets to that point
                    else if (j == (x / i) - 1){
                        System.out.println((x / i) + " is a prime number" );
                        //if the value is prime we want to stop the outer loop:
                        break outerloop; 
                    }
                }
            }
        }
        return x;
    }
}
