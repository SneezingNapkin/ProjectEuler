package projecteuler;

/* By considering the terms in the Fibonacci sequence whose values do not 
exceed four million, find the sum of the even-valued terms. */

public class Problem2 {
    static int evenTerms;
    
    public int Solve() {
        
        evenTerms = 2; 
                /* In order to ensure that the first 2 is included in the 
                even number summation I made this variable start with a 2. This 
                is because it doesn't get added on from x3 for some reason.*/
        int x1 = 1; //1st term in the sequence
        int x2 = 2; //2nd term in the sequence
        int x3 = 3; //Will be used for adding x1 and x2
                /* The 2 doesn't get calculated for some reason in the
                while loop as an even number. So I changed it to 3 to 
                correspond with the pettern.*/
        
        System.out.println("x1 is " + x1 +
                    ", x2 is " + x2 +
                    ", x3 is " + x3);
        
        //Creating a loop that will stop when it hits 4 million.
        while (x3 < 4000000){
            x3 = x1 + x2; //Each loop x3 needs to be the addition of x1 and x2
            x1 = x2; //x1 should become x2 each loop
            x2 = x3; //x2 should become x3 each loop
            System.out.println("x1 is " + x1 +
                    ", x2 is " + x2 +
                    ", x3 is " + x3);
            
            //This part looks at whether x3 is even and if it is adds it to
            //the 'evenTerms' variable.
            if (x3 % 2 == 0) {
                evenTerms = evenTerms + x3;
                System.out.println("var evenTerms is " + evenTerms);
            }
        }
        System.out.println("Final Sum of even terms is: " + evenTerms);
        return evenTerms;
    }
}
